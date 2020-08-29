package Array_1;

public class sameFirstLast {
    public static void main(String[] args) {

//        Given an array of ints, return true if the array is length 1 or more,
//        and the first element and the last element are equal.
//
//
//                sameFirstLast([1, 2, 3]) → false
//        sameFirstLast([1, 2, 3, 1]) → true
//        sameFirstLast([1, 2, 1]) → true


    }
    public static boolean sameFirstLast(int[] nums){
        boolean b=false;
        if (nums.length>=1)
        {

            if (nums[0]==nums[nums.length-1])
                b=true;

        }

        return b;

    }



}
