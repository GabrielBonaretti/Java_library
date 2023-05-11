public class Fahrenheit extends Operations implements Gconst {
    double fahrenheit;
    double constant273_15;
    double constant32;
    double constant0_55;

    public Fahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        getConstants();
    }

    public double getFahrenheit() {
        return this.fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    @Override
    public double sum(double number1, double number2) {
        return number1 + number2;
    }

    @Override
    public double subtraction (double number1, double number2) {
        return number1 - number2;
    }

    @Override
    public double multiplication(double number1, double number2) {
        return number1 * number2;
    }

    public double fahrenheitToCelsiusIn() {
        return multiplication(subtraction(this.fahrenheit, constant32), constant0_55);
    }

    public double fahrenheitToKelvinIn() {
        return sum(multiplication(subtraction(this.fahrenheit, constant32), constant0_55), constant273_15);
    }

    @Override
    public void getConstants() {
        Constants m[] = Constants.values();
        for (int i = 0; i < m.length; i++) {
            switch (i) {
                case 0 -> constant273_15 = m[0].contants;
                case 1 -> constant32 = m[2].contants;
                case 2 -> constant0_55 = m[3].contants;
                default -> {
                    continue;
                }
            }
        }
    }
}
