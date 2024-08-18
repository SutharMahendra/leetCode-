/*
 * Given an array of integers A and an integer B.

    Find the total number of subarrays having bitwise XOR of all elements equals to B.

    Input 1:
    A = [4, 2, 2, 6, 4]
    B = 6

    Output 1:
    4

    Explanation 1:
    The subarrays having XOR of their elements as 6 are:
    [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], [6]

    here we use map to track the xor value 
    crete a map and then put 0 with value 1 it means at first we assume that 0 will be give as xor equals to k 

    now iterate loop 

    0.xor = 0 ^ 4 = 4 
        x = 4 ^ 6 = 2
        map can not contains 2 so put add 4 with 1 value 
        map = {0:1 , 4:1}
       
    1.xor = 4 ^ 2 = 6 
        x = 6 ^ 6 = 0
        map contains 0 so 
        count = 0 + 1 = 1;
        first subarray = [4,2]
        map = {0:1 , 4:1}
    
    2.xor = 6 ^ 2 = 4 
        x = 4 ^ 6 = 2
        map can not contains 2 so put add 4 with 2 value 
        map = {0:1 , 4:2}

    3.xor = 4 ^ 6 = 2 
        x = 2 ^ 6 = 4
        map contains 4 so 
        count = 1 + 2 = 3; here two subarray is present which has xor 6 
        first subarray = [2,2,6] , second subarray = [6]
        map = {0:1 , 4:2}
    
    4.xor = 2 ^ 4 = 6 
        x = 6 ^ 6 = 0
        map contains 0 so 
        count = 3 + 1 = 4;
        map = {0:1 , 4:2}
       
        
 */

import java.util.*;

public class Subarray_with_given_XOR {
    public int solve(ArrayList<Integer> A, int B) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int xor = 0;
        map.put(0, 1);
        int pivot = 1;
        for (int i = 0; i < A.size(); i++) {
            xor = xor ^ A.get(i);

            int x = xor ^ B;

            if (map.containsKey(x)) {
                count += map.get(x);
            } else {
                map.put(xor, map.getOrDefault(xor, 0) + 1);
            }
        }
        return count;
    }
}
