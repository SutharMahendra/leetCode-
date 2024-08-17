/*
 * Given an array having both positive and negative integers. The task is to compute the length of the largest subarray with sum 0.
 *  
 * Examples:

    Input: arr[] = {15,-2,2,-8,1,7,10,23}, n = 8
    Output: 5
    Explanation: The largest subarray with sum 0 is -2 2 -8 1 7.

    arr is given 
    we take one map that contains sum as key and it's idex as value because if map contains sum that we essaly modify max_length

    now take iteration 

    0. sum = sum + arr[i] = 0 + 15 = 15
       map is empty so we put in map
       map = {15}
    
    1. sum = sum + arr[i] = 15 + -2 = 13

       map = {15:0}
        map can not contains 13 so put in map
       now map = {15:0 , 13:1}
    
    2. sum = sum + arr[i] = 13 + 2 = 15

       now map = {15:0 , 13:1}
       map contains 15 
       so update max_length;
       max_length = (0 , 2-0) = 2

    3. sum = sum + arr[i] = 15 + -8 = 7

       
        map = {15:0 , 13:1}
        map can not contains 7 so put in map
        now map = {15:0 , 13:1, 7:3}

    4. sum = sum + arr[i] = 7 + 1 = 8

        now map = {15:0 , 13:1, 7:3}
        map can not contains 8 so put in map
        now map = {15:0 , 13:1, 7:3, 8:4}
    
    5. sum = sum + arr[i] = 8 + 7 = 15

       map = {15:0 , 13:1, 7:3, 8:4}
        map contains 15 
       so update max_length;
       max_length = (2 , 5-0) = 5
    
    6. sum = sum + arr[i] = 15 + 10 = 25

       map = {15:0 , 13:1, 7:3, 8:4}
        map can not contains 25 so put in map
       map = {15:0 , 13:1, 7:3, 8:4, 25:6}
    
    7. sum = sum + arr[i] = 25 + 23 = 48

       map = {15:0 , 13:1, 7:3, 8:4, 25:6}
        map can not contains 48 so put in map
       map = {15:0 , 13:1, 7:3, 8:4, 25:6}
       
    
    so at the end we get max_length = 5 

 */

import java.util.*;

public class GFG_Largest_Subarray_with_K_sum {
    public static void main(String[] args) {
        int arr[] = { 2, 10, 4 };
        int n = arr.length;

        int max_length = Largest_Subarray_with_K_sum(arr, n);
        System.out.println(max_length);
    }

    public static int Largest_Subarray_with_K_sum(int[] arr, int n) {

        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int max_length = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];

            if (sum == 0) {
                max_length = i + 1;
            }
            if (map.containsKey(sum)) {
                max_length = Math.max(max_length, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        return max_length;
    }
}
