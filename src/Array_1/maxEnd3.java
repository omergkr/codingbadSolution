package Array_1;

public class maxEnd3 {
    public static void main(String[] args) {

//        Given an array of ints length 3, figure out which is larger, the first or last element in the array,
//        and set all the other elements to be that value. Return the changed array.
//
//
//        maxEnd3([1, 2, 3]) → [3, 3, 3]
//        maxEnd3([11, 5, 9]) → [11, 11, 11]
//        maxEnd3([2, 11, 3]) → [3, 3, 3]



    }

    public static int[] maxEnd3(int[] nums){
        int [] a=new int[nums.length];

        if (nums[0]>nums[nums.length-1]) {
            for (int i = 0; i < nums.length; i++) {

                a[i] = nums[0];

            }
        }
        else
            {
                for (int i = 0; i < nums.length; i++) {

                    a[i] = nums[nums.length-1];

                }
        }

        return a;

    }
}
