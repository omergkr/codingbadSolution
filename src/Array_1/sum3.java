package Array_1;

public class sum3 {
    public static void main(String[] args) {

//        Given an array of ints length 3, return the sum of all the elements.
//
//
//                sum3([1, 2, 3]) → 6
//        sum3([5, 11, 2]) → 18
//        sum3([7, 0, 0]) → 7
int[] a={7,0,0};

        System.out.println(sum3(a));


    }

    public  static  int sum3(int[] nums){
int sum=0;
        for (int i = 0; i <3 ; i++) {

            sum+=nums[i];

        }
        return sum;

    }
}
