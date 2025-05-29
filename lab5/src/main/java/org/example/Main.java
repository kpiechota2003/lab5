package org.example;

public class Main {
    public static void main(String[] args) {
        // Problem with 10 items, seed 1, values/weights in range [1, 10]
        Problem problem = new Problem(3, 4345, 1, 10);

        System.out.println(problem);

        Result result = problem.solve(10); // Capacity = 20
        System.out.println(result);
    }
}