
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int age = 22;
        double height = 165.5;
        boolean likeCoffee = true;

        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " cm");
        System.out.println("Do I like coffee? " + likeCoffee);

        System.out.println("\n=== Exercise 7: Scanner ===");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");

        if (input.hasNextInt()) {
            int inputAge = input.nextInt();
            System.out.println("Your age is " + inputAge);
        } else {
            System.out.println("Invalid input! Please enter a number.");
            System.out.println("Testing 1.. 2.. 3..");
        }

        input.nextLine(); // Hapus input yang tersisa


        String[] hobbies = {
            "Reading",
            "Watching movies",
            "Eating"
        };

        for (String hobby : hobbies) {
            System.out.println("Balqis hobby is " + hobby);
        }

        ArrayList<String> hobbyList =
            new ArrayList<>(Arrays.asList(hobbies));

        // Add hobby baru
        hobbyList.add("Traveling");

        // Remove hobby pertama index 0
        hobbyList.remove(0);

        System.out.println("Updated hobbies: " + hobbyList);


        HashMap<String, String> profile = new HashMap<>();

        profile.put("name", "Balqis");
        profile.put("city", "Bali");
        profile.put("goal", "Become a Software Engineer");

        System.out.println("My Profile:");
        System.out.println("Name: " + profile.get("name"));
        System.out.println("City: " + profile.get("city"));
        System.out.println("Goal: " + profile.get("goal"));

        input.close();
    }
}
