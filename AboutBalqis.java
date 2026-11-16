import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        int age = 22;
        double shoeSize = 38.5;
        boolean loveY2K = true;

        System.out.println("I'm " + age + " years old, wearing EUR " + shoeSize + " shoes.");
        System.out.println("Do I love Y2K? " + loveY2K);
        
        
        String[] favoriteGenres = {"Pop", "Indie", "Rock"};
        System.out.println("My favorite genres are " + String.join(", ", favoriteGenres) + ".");

    }
}
