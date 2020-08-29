package Array_1;

public class reverse3 {


    public static void main(String[] args) {

//        Given an array of ints length 3, return a new array with the elements in reverse order,
//        so {1, 2, 3} becomes {3, 2, 1}.
//
//
//        reverse3([1, 2, 3]) → [3, 2, 1]
//        reverse3([5, 11, 9]) → [9, 11, 5]
//        reverse3([7, 0, 0]) → [0, 0, 7]


    }
    public static int[] reverse3(int[] nums)
    {
        int [] a=new int[3];
        int j=0;
        for (int i = 2; i >=0 ; i--) {

            a[j]=nums[i];
            j++;


        }
        return a;

    }


}
