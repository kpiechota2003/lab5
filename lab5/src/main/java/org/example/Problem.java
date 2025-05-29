package org.example;

import java.util.*;

public class Problem {
    public List<Item> items;

    public Problem(int n, int seed, int lowerBound, int upperBound) {
        Random random = new Random(seed);
        items = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int value = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            int weight = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
            items.add(new Item(value, weight, i));
        }
    }

    public Result solve(int capacity) {
        int[] dp = new int[capacity + 1];
        int[] itemChoice = new int[capacity + 1];
        Arrays.fill(itemChoice, -1);

        for (int c = 0; c <= capacity; c++) {
            for (int i = 0; i < items.size(); i++) {
                Item item = items.get(i);
                if (item.weight <= c) {
                    int newValue = dp[c - item.weight] + item.value;
                    if (newValue > dp[c]) {
                        dp[c] = newValue;
                        itemChoice[c] = i;
                    }
                }
            }
        }

        Result result = new Result();
        int c = capacity;
        while (c > 0 && itemChoice[c] != -1) {
            int i = itemChoice[c];
            result.items.add(items.get(i).index);
            result.totalValue += items.get(i).value;
            result.totalWeight += items.get(i).weight;
            c -= items.get(i).weight;
        }

        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Item item : items) {
            sb.append(item.toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
