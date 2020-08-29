package Array_1;

public class unlucky1 {

    public static void main(String[] args) {
//        We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
//        Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
//
//
//        unlucky1([1, 3, 4, 5]) → true
//        unlucky1([2, 1, 3, 4, 5]) → true
//        unlucky1([1, 1, 1]) → false

    }

    public static boolean unlucky1(int[] nums){

        boolean control=false;



   if(nums.length>1) {
       if (nums[0] == 1) {
           if (nums[1] == 3)
               control = true;
       }
       if (nums[1] == 1) {
           if (nums[2] == 3)
               control = true;
       }

       if (nums[nums.length - 2] == 1) {
           if (nums[nums.length - 1] == 3)
               control = true;
       }

   }


        return control;



    }

}
