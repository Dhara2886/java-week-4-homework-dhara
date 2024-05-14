import java.util.ArrayList;

//Write a Java program to retrieve an element (at a specified index) from a given array list


public class Programme6RetrieveArrayList {

    // Method to create and populate the ArrayList
    public static ArrayList<String> createArrayList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Lotus");
        arrayList.add("Wisteria");
        arrayList.add("Lily");
        arrayList.add("Jasmine");
        arrayList.add("Lavender");
        return arrayList;
    }

    // Method to retrieve an element at a specified index
    public static String retrieveElement(ArrayList<String> arrayList, int index) {
        if (index >= 0 && index < arrayList.size()) {
            return arrayList.get(index);
        } else {
            return "Invalid index";
        }
    }

    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> arrayList = createArrayList();

        // Specify the index to retrieve element
        int index = 4;

        // Retrieve the element at the specified index
        String element = retrieveElement(arrayList, index);

        // Print the retrieved element
        System.out.println("Element at index " + index + ": " + element);
    }
}


