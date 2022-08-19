import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() {
        Scanner input = new Scanner(System.in);

        // Expedition prep program starting
        System.out.println("Expedition prep Program starting...");
        System.out.println("Booting up...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Ready");

        System.out.println("Hello user, What is your name?");
        String name = input.nextLine();
        System.out.println("Hi, " + name + " Welcome to the Expedition prep program. Are you ready to head out in new world?\n" + "Type Y or N");

        String excited = input.nextLine();

        if (excited.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        }
        else {
            System.out.println("To bad you are team leader. You have to go.");
        }

        System.out.println("How many people do you want on your expedition team? (Input an int number)");
        int teamSize = input.nextInt();
        input.nextLine();

        if (teamSize > 2) {
            System.out.println("That's way to many people. We can only send 2 more members");
            teamSize = 2;
        }
        else if (teamSize < 2) {
            System.out.println("That's not enough people. We need you and 2 more members.");
            teamSize = 2;
        }
        else if (teamSize == 2) {
            System.out.println("That's a perfect sized team. Good job.");
        }

        System.out.println("You are allowed to bring one weapon with you. You know, just incase. What do you bring?");
        String weapon = input.nextLine();
        System.out.println("Nice choice, you will be bringing a " + weapon + " with you");
        System.out.println("You have the choice of 3 vehicles" +
                "\nA: A Mars Rover" +
                "\nB: A Chevy Silverado" +
                "\nC: A Honda Civic");

        String vehicleChoice = input.nextLine();

        if (vehicleChoice.equalsIgnoreCase("A")) {
            vehicleChoice = "a Mars Roover";
        }
        else if (vehicleChoice.equalsIgnoreCase("B")) {
            vehicleChoice = "a Chevy Silverado";
        }
        else if (vehicleChoice.equalsIgnoreCase("C")) {
            vehicleChoice = "a Honda Civic";
        }
        else {
            vehicleChoice = "your feet";
        }

        System.out.println("Your expedition team is now ready" +
                "\nLed by " + name + " with " + teamSize + " teammates." +
                "\nTo explore the surface of Mars using " + vehicleChoice + "." +
                "\nExploration team heads out in" +
                "\n5...." + "\n4...." + "\n3...." + "\n2...." + "\n1...." + "\nGO GO GO!");




    }

}
