public class YearlyMaintenanceCost {
    public static void main(String[] args) {
        //Initalize variables
        int springCost = 400;
        int summerCost = 900;
        int fallCost = 600;
        int winterCost = 200;

        //Add the variables
        int totalCost = springCost + summerCost + fallCost + winterCost;

        //Output the values and the total
        System.out.println("With the costs of maintenance for Spring($" + springCost + "), Summer($" + summerCost + "), Fall($" + fallCost + "), and Winter($" + winterCost + "), your total yearly maintenance cost is $" + totalCost + ".");

    }
}
