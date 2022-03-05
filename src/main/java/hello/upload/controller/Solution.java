package hello.upload.controller;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0,0,0,0,0,0};

        int number = solution.numberOfArithmeticSlices(nums);
        System.out.println("number = " + number);
    }


    public int numberOfArithmeticSlices(int[] nums) {
        int arithmeticNumber = 0;

        for(int i = 0 ; i < nums.length ; i++){

            int diff = 0;

            for(int j = i ; j < nums.length ; j++){
                if(j+1 < nums.length){
                    if(j != i && diff == (nums[j+1] - nums[j])){
                        arithmeticNumber++;
                    }else if(j != i && diff != (nums[j+1] - nums[j])){
                        break;
                    }
                    diff = nums[j+1] - nums[j];
                }

            }
        }

        return arithmeticNumber;
    }
}
