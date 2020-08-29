package Array_1;

public class midThree {
    public static void main(String[] args) {

//        Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array.
//        The array length will be at least 3.
//
//
//        midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
//        midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
//        midThree([1, 2, 3]) → [1, 2, 3]

    }
    public static int[] midThree(int[] nums) {

        int[] a = new int[3];

        a[0]=nums[(nums.length-1)/2-1];
        a[1]=nums[(nums.length-1)/2];
        a[2]=nums[(nums.length-1)/2+1];
        return a;
    }

}
