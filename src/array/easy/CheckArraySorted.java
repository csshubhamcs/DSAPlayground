package array.easy;

public class CheckArraySorted {

    public static void main(String[] args) {

        if(checkSort()){
            System.out.println("Array is sorted");
        }else {
            System.out.println("Array is not sorted");
        }
    }

    public static Boolean checkSort(){

        int[] arr = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] > arr[i+1]){
                return false;
            }

        }
        return true;
    }
}
