package Array_1;

import java.util.Arrays;

public class fix23 {
    public static void main(String[] args) {

//        Given an int array length 3, if there is a 2 in the array immediately followed by a 3,
//        set the 3 element to 0. Return the changed array.
//
//
//        fix23([1, 2, 3]) → [1, 2, 0]
//        fix23([2, 3, 5]) → [2, 0, 5]
//        fix23([1, 2, 1]) → [1, 2, 1]

        int[] a={1,2,3};
        System.out.println(Arrays.toString(fix23(a)));

    }

    public static int[] fix23(int[] nums){

      int[] b=new int[3];
      b[0]=nums[0];

        for (int i = 1; i <3 ; i++) {

            if (nums[i-1]==2 && nums[i]==3)
                b[i]=0;
            else
                b[i]=nums[i];
        }
      return b;
    }

}
