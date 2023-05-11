import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConvertTemperatures ct = new ConvertTemperatures();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        boolean running = true;

        while (running){
            System.out.println("Welcome to the code who convert temperatures for you.");
            System.out.println("[1] Celsius.");
            System.out.println("[2] Fahrenheit.");
            System.out.println("[3] Kelvin.");

            while (true) {
                try {
                    System.out.print("Enter which of the temperatures you want to manipulate: ");
                    choice = sc.nextInt();

                    if (choice >= 1 && choice <= 3) {
                        break;
                    } else {
                        System.out.println("Insert a valid number.");
                    }

                } catch (Exception e) {
                    System.out.println("Insert a number.");
                }
            }

            switch (choice) {
                case 1:
                    System.out.println("What temperature do you want to convert to?");
                    System.out.println("[1] Fahrenheit.");
                    System.out.println("[2] Kelvin.");
                    System.out.print("Enter your choice: ");
                    choice = sc.nextInt();

                    if (choice == 1) {
                        System.out.print("Enter the temperature in Celsius: ");
                        double tempCelsius = sc.nextDouble();
                        System.out.printf("The conversion from Celsius to Fahrenheit is equal: %.2f°F \n", ct.celsiusToFahrenheit(tempCelsius));
                    } else if (choice == 2) {
                        System.out.print("Enter the temperature in celsius: ");
                        double tempCelsius = sc.nextDouble();
                        System.out.printf("The conversion from Celsius to Kelvin is equal: %.2f°K \n", ct.celsiusToKelvin(tempCelsius));
                    }
                    break;

                case 2:
                    System.out.println("What temperature do you want to convert to?");
                    System.out.println("[1] Celsius.");
                    System.out.println("[2] Kelvin.");
                    System.out.print("Enter your choice: ");
                    choice = sc.nextInt();

                    if (choice == 1) {
                        System.out.print("Enter the temperature in Fahrenheit: ");
                        double tempFahrenheit = sc.nextDouble();
                        System.out.printf("The conversion from Fahrenheit to Celsius is equal: %.2f°C\n", ct.fahrenheitToCelsius(tempFahrenheit));
                    } else if (choice == 2) {
                        System.out.print("Enter the temperature in Fahrenheit: ");
                        double tempFahrenheit = sc.nextDouble();
                        System.out.printf("The conversion from Fahrenheit to Kelvin is equal: %.2f°K\n", ct.fahrenheitToKelvin(tempFahrenheit));
                    }
                    break;

                case 3:
                    System.out.println("What temperature do you want to convert to?");
                    System.out.println("[1] Celsius.");
                    System.out.println("[2] Fahrenheit.");
                    System.out.print("Enter your choice: ");
                    choice = sc.nextInt();

                    if (choice == 1) {
                        System.out.print("Enter the temperature in Kelvin: ");
                        double tempKelvin = sc.nextDouble();
                        System.out.printf("The conversion from Kelvin to Celsius is equal: %.2f°C\n", ct.kelvinToCelsius(tempKelvin));
                    } else if (choice == 2) {
                        System.out.print("Enter the temperature in Kelvin: ");
                        double tempKelvin = sc.nextDouble();
                        System.out.printf("The conversion from Kelvin to Fahrenheit is equal: %.2f°F\n", ct.kelvintoFahrenheit(tempKelvin));
                    }
                    break;

                default:
                    System.out.println("Error");
            }

            sc.nextLine();

            while (true) {
                try {
                    System.out.print("Do you want continue? [Y/N]: ");
                    String test = sc.nextLine();

                    if (test.equalsIgnoreCase("Y")) {
                        break;
                    } else if (test.equalsIgnoreCase("N")){
                        System.out.println("Thank you to use the program :)");
                        running = false;
                        break;
                    } else {
                        System.out.println("Enter a valid choice.");
                    }

                } catch (Exception e) {
                    System.out.println("Insert a number.");
                }
            }
        }
    }
}
