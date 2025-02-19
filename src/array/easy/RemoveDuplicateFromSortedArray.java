package array.easy;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,5,5,6,7,7,8};
        int newArrayIndex = 0;

        for (int i = 1 ;i<arr.length;i++){
            if (arr[i] != arr[i-1]){
                arr[newArrayIndex] = arr[i];
                newArrayIndex++;
            }
        }
        for (int i = 0; i < newArrayIndex; i++) {
            System.out.print(arr[i] + " ");
        }

//       int[] newArray = Arrays.stream(arr).distinct().toArray();
//
//        for (int i = 0; i < newArray.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }
}
