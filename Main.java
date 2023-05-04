public class Main {
    public static void main(String[] args) {
        Celsius c = new Celsius(12);
        double kelvin = c.celsiusToKelvin();
        System.out.println(kelvin);
    }
}
