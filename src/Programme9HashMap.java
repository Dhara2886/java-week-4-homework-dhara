import java.util.HashMap;

/**
 * Create a HashMap object called people that will store String keys and Integer values
 * And use for each loop to iterate the value from Map
 */

public class Programme9HashMap {

    // Method to create and populate the HashMap
    public static HashMap<String, Integer> createPeopleMap() {
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Susan", 30);
        people.put("Abbey", 25);
        people.put("Leah", 35);
        people.put("Lauren", 28);
        return people;
    }

    // Method to iterate through the values in the HashMap using for-each loop
    public static void iterateHashMapValues(HashMap<String, Integer> people) {
        System.out.println("Values in the HashMap:");
        for (int age : people.values()) {
            System.out.println(age);
        }
    }

    public static void main(String[] args) {
        // Create and populate the HashMap
        HashMap<String, Integer> people = createPeopleMap();

        // Iterate through the values in the HashMap using for-each loop
        iterateHashMapValues(people);
    }
}


