/**
 * Write a Java program to test if an array list is empty or not.
 */

import java.util.ArrayList;

public class Programme7EmptyArrayList {

    public static void main(String[] args) {
        // Create an empty ArrayList
        ArrayList<String> arrayList1 = new ArrayList<>();

        // Create an ArrayList with elements
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Rosemary");
        arrayList2.add("Tulsi");
        arrayList2.add("Coriander");

        // Test if the first ArrayList is empty
        if (arrayList1.isEmpty()) {
            System.out.println("ArrayList 1 is empty");
        } else {
            System.out.println("ArrayList 1 is not empty");
        }

        // Test if the second ArrayList is empty
        if (arrayList2.isEmpty()) {
            System.out.println("ArrayList 2 is empty");
        } else {
            System.out.println("ArrayList 2 is not empty");
        }
    }
}