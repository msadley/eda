package questions;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        PairSum ps = new PairSum();

        int[] nums = { 8, 1, 6, 3, 4, 5, 2, 7 };
        int target = 9;
        int i = 2;
        // System.out.println(ps.findPairs(nums, target));
        System.out.println(Arrays.toString(nums));
        ps.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(ps.search(nums, 9 - nums[i], i + 1, nums.length-1));

        System.out.println("---");
        System.out.println(ps.findPairs(nums, target));

    }
}