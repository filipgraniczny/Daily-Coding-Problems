import java.util.Arrays;

public class Day2 {
    public static void main(String[] args) {
//        Given an array of integers, return a new array such that each element at index i of the new array
//        is the product of all the numbers in the original array except the one at i.
//
//        For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24].
//        If our input was [3, 2, 1], the expected output would be [2, 3, 6].
//
//        Follow-up: what if you can't use division?
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(calcProductArr1(arr)));
        System.out.println(Arrays.toString(calcProductArr2(arr)));
    }

    // Solution via division -- O(n) time complexity
    public static int[] calcProductArr1(int[] arr) {
        int[] newArr = new int[arr.length];
        int arrProduct = 1;

        for(int i = 0; i < arr.length; i++) {
            arrProduct *= arr[i];
        }

        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arrProduct / arr[i];
        }

        return newArr;
    }

    // Solution without division -- O(n^2) time complexity
    public static int[] calcProductArr2(int[] arr) {
        int[] newArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            newArr[i] = 1;
            for(int j = 0; j < arr.length; j++) {
                if(j != i){
                    newArr[i] *= arr[j];
                }
            }
        }
        return newArr;
    }

}
