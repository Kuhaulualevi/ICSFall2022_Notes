public class createMethod {
    public static void main(String[] args) {
        hiGreeting();    
        //aloha50();
        System.out.println("*******************************");
        /* 
        displayValue(20); 
        displayValue(10);
        doubleValue(100);
        sumNumber(10.9, 300.8, 69.0);
        personalStatement("Dennis", 29);
        characterSummary("Dennis", 29, 176.5, 22000);

        double total;
        total = sumTwo(300.69, 69.420);
        System.out.println(total);
        */

        dayOfTheWeek("monday");

        favoriteDessert("Halo Halo", 20);
    }

    // create method or function and consistently call it when needed
    public static void hiGreeting() {
        System.out.println("Aloha World! Chee Hoo");
    }

    public static void aloha50() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Aloha");
        }
    }
    
    public static void displayValue(int num){
        System.out.println("Number is " + num);
    }

    public static void doubleValue(int num) { 
        int result = num * 2;
        System.out.println("You entered, " + num + ", doubling it equals " + result);
    }

    public static void sumNumber (double num1, double num2, double num3) {
        double result = num1 + num2 + num3;
        System.out.println("You entered numbers: " + num1 + ", " 
        + num2 + " and " 
        + num3 + ". \nThe result is: " + result);
    }

    public static void personalStatement(String name, int age) {
        System.out.println("Hello " + name + ". You are " + age + " years old.");
    }

    public static void characterSummary(String name, int age, double weight, float netWorth) {
        System.out.println("Name: " + name + "\nAge: " + age
        + "\nWeight: " + weight + "\nNet Worth: " + netWorth);
    }

    /**
     * sumTwo - finds sum of two numbers 
     * @param num1
     * @param num2
     * @return result 
     */
    public static double sumTwo(double num1, double num2) {
        double result;
        result = num1 + num2; 
        return result;
    }

    // create a void method that takes in the day of the week, and output specific responses

    public static void dayOfTheWeek(String day) {
        String dayLowerCase = day.toLowerCase();
        if (dayLowerCase.equals("friday") || dayLowerCase.equals("saturday") || dayLowerCase.equals("sunday")) {
            System.out.println("Yay let's go to the beach");
        } else {
            System.out.println("we got work...");
        }
    }

    /**
     * 
     * @param favDessert
     * @param counter
     */
    public static void favoriteDessert(String favDessert, int counter) {
        for (int i = 1; i <= counter; i++) {
            System.out.println(favDessert);
        }
    }
}
