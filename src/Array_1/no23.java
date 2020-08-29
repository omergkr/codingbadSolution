package Array_1;

public class no23 {

    public static void main(String[] args) {

//        Given an int array length 2, return true if it does not contain a 2 or 3.
//
//
//        no23([4, 5]) → true
//        no23([4, 2]) → false
//        no23([3, 5]) → false


    }
    public static  boolean no23(int[] nums){

        int count=0;

        for (int i = 0; i <2 ; i++) {


            if (nums[i] == 2 || nums[i] == 3)
                count++;


        }
        if (count==0)
            return true;
        else
            return false;



    }



}
