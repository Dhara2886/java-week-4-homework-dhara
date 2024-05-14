import java.util.ArrayList;

/**
 * Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */

public class Programme11CompareArrayList {

    // Method to compare two ArrayLists
    public static void compareArrayLists(ArrayList<String> list1, ArrayList<String> list2) {
        // Check if both lists have the same size
        if (list1.size() != list2.size()) {
            System.out.println("ArrayLists are not equal in size");
            return;
        }

        // Check if all elements of list1 are present in list2
        for (String element : list1) {
            if (!list2.contains(element)) {
                System.out.println("ArrayLists are not equal");
                return;
            }
        }

        // Check if all elements of list2 are present in list1
        for (String element : list2) {
            if (!list1.contains(element)) {
                System.out.println("ArrayLists are not equal");
                return;
            }
        }

        System.out.println("ArrayLists are equal");
    }

    public static void main(String[] args) {
        // Declare and populate ArrayLists c1 and c2
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // Compare the ArrayLists
        compareArrayLists(c1, c2);
    }
}


