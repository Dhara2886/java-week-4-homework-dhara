import java.util.ArrayList;
import java.util.Iterator;

//Write a Java program to iterate through all elements in an array list using Iterator.

public class Programme5IteratorArrayList {

        // Method to create and populate the ArrayList
        public static ArrayList<Integer> createArrayList() {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(10);
            arrayList.add(20);
            arrayList.add(30);
            arrayList.add(40);
            arrayList.add(50);
            return arrayList;
        }

        // Method to iterate through all elements using Iterator
        public static void iterateArrayList(ArrayList<Integer> arrayList) {
            Iterator<Integer> iterator = arrayList.iterator();
            System.out.println("Elements in the ArrayList:");
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }

        public static void main(String[] args) {
            // Create and populate the ArrayList
            ArrayList<Integer> arrayList = createArrayList();

            // Iterate through all elements using Iterator
            iterateArrayList(arrayList);
        }
    }


