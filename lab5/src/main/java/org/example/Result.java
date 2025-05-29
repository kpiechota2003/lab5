package org.example;

import java.util.ArrayList;
import java.util.List;

public class Result {
    public List<Integer> items;
    public int totalWeight = 0;
    public int totalValue = 0;

    public Result() {
        items = new ArrayList<>();
    }

    @Override
    public String toString() {
        String itemsStr = String.join(", ", items.stream()
                .map(String::valueOf)
                .toArray(String[]::new));
        return "result: " + itemsStr +
               ", [w,v]=[total weight: " + totalWeight +
               ", total value: " + totalValue + "]";
    }
}
