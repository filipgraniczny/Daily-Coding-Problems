
public class Day3 {

//    Given an array of integers, find the first missing positive integer in linear time and constant space.
//    In other words, find the lowest positive integer that does not exist in the array.
//    The array can contain duplicates and negative numbers as well.
//
//    For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
//
//    You can modify the input array in-place.

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println(missingInt(arr));
    }

    public static int missingInt(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
       for(int val : arr){
           if(val < min && val > 0){
               min = val;
           }
           else if(val > max && val > 0){
               max = val;
           }
       }

       for(int i = min; i < max; i++) {
           boolean contains = false;
           for(int val : arr) {
               if(val == i) {
                   contains = true;
               }
           }
           if(!contains){
               return i;
           }

       }
       return max + 1;
    }

}
