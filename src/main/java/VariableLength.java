/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author behlt
 */
public class VariableLength {
    public static int product(int... numbers){
        int result = 1;
        for(int num : numbers){
            result *= num;
        }
        return result;
    }
    
    
    
    public static void main(String[] args) {
        int[] nums1 = {2,3,4};
        int[] nums2 = {1,5,7,10};
        int[] nums3 = {2};
        
        
        System.out.println("Product of nums1: " + product(nums1));
        System.out.println("Product of nums2: " + product(nums2));
        System.out.println("Product of nums3: " + product(nums3));
    }
    
}
