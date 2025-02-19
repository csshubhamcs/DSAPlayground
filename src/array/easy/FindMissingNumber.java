package array.easy;

public class FindMissingNumber {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,9};

        int expectedSum = 9*(9+1)/2;
        int actualSum = 0;


        for(int num : arr){
            actualSum += num;
        }


        System.out.println("Missing number = "+ (expectedSum - actualSum));
    }





}
