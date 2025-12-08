package org.example;
import java.util.Arrays;

public class Statistics {
    // For-loop Implementations
    public int maximumUsingForLoop(int[] nums) {
        int max = nums[0];
        for (int n : nums) {
            if (n > max) max = n;
        }
        return max;
    }

    public int minimumUsingForLoop(int[] nums) {
        int min = nums[0];
        for (int n : nums) {
            if (n < min) min = n;
        }
        return min;
    }

    public int sumUsingForLoop(int[] nums) {
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public int averageUsingForLoop(int[] nums) {
        return sumUsingForLoop(nums) / nums.length;
    }
    // Stream Implementations
    public int maximumUsingStream(int[] nums) {
        return Arrays.stream(nums).max().orElseThrow();
    }

    public int minimumUsingStream(int[] nums) {
        return Arrays.stream(nums).min().orElseThrow();
    }

    public int sumUsingStream(int[] nums) {
        return Arrays.stream(nums).sum();
    }

    public int averageUsingStream(int[] nums) {
        return (int) Arrays.stream(nums).average().orElseThrow();
    }
    // Add-On: Evens Only

    public int[] filterEvenNumbers(int[] nums) {
        return Arrays.stream(nums)
                .filter(n -> n % 2 == 0)
                .toArray();
    }

    // Add-On: Odds Only

    public int[] filterOddNumbers(int[] nums) {
        return Arrays.stream(nums)
                .filter(n -> n % 2 != 0)
                .toArray();
    }

    // Add-On: Add Five
    public int[] addFive(int[] nums) {
        return Arrays.stream(nums)
                .map(n -> n + 5)
                .toArray();
    }

    // Add-On: Square Numbers
    public int[] squareNumbers(int[] nums) {
        return Arrays.stream(nums)
                .map(n -> n * n)
                .toArray();
    }
}
