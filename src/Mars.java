public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "SpaceX";
        int shipPopulation = 300;
        double shipFood = 4000.00;
        boolean landing = true;

        //Upon reaching Mars everyone will eat 0.75 meals a day, to preserve food
        //The landing process takes 2 days, calculate how much food is left after landing
        //Equation: Food = Food - (Pop * 0.75);
        //Use the equation twice
        shipFood = shipFood - (shipPopulation * 0.75);
        shipFood = shipFood - (shipPopulation * 0.75);

        System.out.println(shipFood);

        //An extra crate of food is found increasing ShipFood by 50%
        shipFood = shipFood + (shipFood * .5);

        //The births very timed perfectly and 5 more babies join the ShipPopulation
        shipPopulation = shipPopulation + 5;

        String landingLocation = "The Plain";

        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain");
        }
        else{
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }

        //Call a function called LandingCheck() that has a parameter of 100, returns boolean, and set it equal to Landing
        landing = landingCheck(100);
        new GuessingGame();
        new MarsExpedition();
        new FindingsLists();
    }

    /**
     * name: landingCheck
     * @param loops
     * @return boolean
     * @throws InterruptedException
     */

    // public static void function called LandingCheck with an int parameter called Loops
    public static boolean landingCheck(int loops) throws InterruptedException {
        // loops until i is equal to loops, and i increments by 1 each loop
        for (int i = 0; i <= loops; i++) {
            // if statement should check to see if i divisible by 3 equals 0, and that i divisible by 5 equals 0
            if (((i % 3) == 0) && ((i % 5) == 0)) {
                System.out.println("Keep Center");
            }
            // else if statement should check if i divisible by 5 equals 0
            else if ((i % 5) == 0) {
                System.out.println("Right");
            }
            // else if statement should check if i divisible by 3 equals 0
            else if ((i % 3) == 0) {
                System.out.println("Left");
            }
            else {
                System.out.println("Calculating");
            }

            //Thread.sleep(250) slows the console down by 250 milliseconds
            Thread.sleep(250);
        }

        System.out.println("Landed");

        //The ship has landed on Mars. Return the value false;
        return false;
    }

}
