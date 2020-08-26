import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Day1 {
    public static void main(String[] args) {
//        Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
//
//        For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
//
//        Bonus: Can you do this in one pass?

        int[] arr = {10, 15, 3, 7}; // Define array
        int k = 17; // Define k

        System.out.println(addToK(17, arr)); // Call addToK method and print result

    }

    public static boolean addToK(int k, int[] arr) {
        LinkedList<Integer> potentialAnswers = new LinkedList<>(); // Create list to store potential solutions (k-value_
        for (int i : arr) { // Iterate through passed array
            if(potentialAnswers.contains(i)) { // If array value is also in potentialAnswers, then there is a match.
                return true;
            }
            else{
                potentialAnswers.add(k - i); // Otherwise, add the difference between k and i into potentialAnswers
            }
        }
        return false; // If no match is found, return false.

    }
}
