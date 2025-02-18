package array.easy;

public class LargestAndSmallestElement {

    public static void main(String[] args) {

        int[] arr = {2,4,6,8,1,3,5,7};

        int min = arr[0];
        int max = arr[0];

        for (int j : arr) {
            if (min > j) {
                min = j;
            } else if (max < j) {
                max = j;
            }
        }

//        for (int num : arr){
//            if (num < min){
//                min = num;
//            } else if (num > max) {
//                max = num;
//            }
//        }

        System.out.println("Min = "+min);
        System.out.println("Max = "+max);

    }
}
