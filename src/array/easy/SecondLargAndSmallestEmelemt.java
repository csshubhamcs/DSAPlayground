package array.easy;

public class SecondLargAndSmallestEmelemt {
    public static void main(String[] args) {

        int[] arr = {8,3,5,7,9,1,4,6,2};


        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr){
            if (num < smallest){
                secondSmallest = smallest;
                smallest = num;
            }else if (num < secondSmallest && num != smallest){
                secondSmallest = num;
            }

            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
                
            }
        }

        System.out.println("Second Largest "+ secondLargest);
        System.out.println("Second Smallest "+ secondSmallest);

    }
}
