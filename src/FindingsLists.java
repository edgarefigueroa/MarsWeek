import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class FindingsLists {
    public FindingsLists() throws InterruptedException {
        // to stop the terminal for half a second
        Thread.sleep(500);

        System.out.println("Welcome back from your expedition. Time to catalog everything you found.");
        ArrayList<String> rockList = new ArrayList<String>();
        System.out.println("Rock data downloaded.");

        // adding 4 rocks to the list using rockList.add("") rock, weird rock, smooth rock, and not rock
        rockList.add("rock");
        rockList.add("weird rock");
        rockList.add("smooth rock");
        rockList.add("not rock");

        System.out.println(rockList);
        System.out.println("Wait a second that last on is not a rock we need to delete that one from the list");

        // Remove "not rock" from the rockList ArrayList by using rockList.remove()
        rockList.remove("not rock");

        System.out.println(rockList);
        System.out.println("Perfect");

        // stop the terminal for half a second
        Thread.sleep(500);

        // fossilDirectory element to have 2 attributes, name and description
        HashMap<String, String> fossilDirectory = new HashMap<>();

        System.out.println("Fossil data downloaded\n" +
                "[Bird Fossil, Fish Fossil, Tooth Fossil]");

        fossilDirectory.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Which of the fossils would you like to learn more about (Spelling and Spacing is important)?");

        Scanner input = new Scanner(System.in);
        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }
        else if (fossilChoice.equalsIgnoreCase("Fish Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }
        else if (fossilChoice.equalsIgnoreCase("Tooth Fossil")) {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " + fossilDirectory.get(fossilChoice));
        }

        Thread.sleep(500);

        HashSet<String> suppliesBrought = new HashSet<>();
        HashSet<String> suppliesUsed = new HashSet<>();

        suppliesBrought.add("Food");
        suppliesBrought.add("Water");
        suppliesBrought.add("Medicine");
        suppliesUsed.add("Food");
        suppliesUsed.add("Water");

        // Remove supplies used from supplies brought
        suppliesBrought.removeAll(suppliesUsed);

        System.out.println("Supplies left over: " + suppliesBrought);

    }
}
