public class Kelvin extends Operations implements Gconst {
    double kelvin;
    double constant273_15;
    double constant32;
    double constant1_8;

    public Kelvin(double kelvin) {
        this.kelvin = kelvin;
        getConstants();
    }

    public double getKelvin() {
        return this.kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
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

    public double kelvinToCelsiusIn() {
        return subtraction(this.kelvin, constant273_15);
    }

    public double kelvintoFahrenheitIn() {
        return sum(multiplication(subtraction(this.kelvin, constant273_15), constant1_8), constant32);
    }

    @Override
    public void getConstants() {
        Constants m[] = Constants.values();
        for (int i = 0; i < m.length; i++) {
            switch (i) {
                case 0 -> constant273_15 = m[0].contants;
                case 1 -> constant1_8 = m[1].contants;
                case 2 -> constant32 = m[2].contants;
            }
        }
    }
}
