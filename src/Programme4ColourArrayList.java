import java.util.ArrayList;

//Write a Java program to create a new array list, add some colours (string) and printout the collection using for each loop


public class Programme4ColourArrayList {

    // Method to create and populate the ArrayList
    public static ArrayList<String> createColorList() {
        ArrayList<String> colorsList = new ArrayList<>();
        colorsList.add("Pink");
        colorsList.add("White");
        colorsList.add("Blue");
        colorsList.add("Yellow");
        colorsList.add("Purple");
        return colorsList;
    }

    // Method to print the collection using for-each loop
    public static void printColorList(ArrayList<String> colorsList) {
        System.out.println("Colors in the ArrayList:");
        for (String color : colorsList) {
            System.out.println(color);
        }
    }

    public static void main(String[] args) {
        // Create and populate the ArrayList
        ArrayList<String> colorsList = createColorList();

        // Print out the collection using a for-each loop
        printColorList(colorsList);
    }
}

