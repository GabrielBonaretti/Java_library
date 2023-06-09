import orientedObject.Specialization;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Celsius extends Operations implements Gconst {
    double celsius;
    double constant273_15;
    double constant1_8;
    double constant32;

    public Celsius(double celsius) {
        this.celsius = celsius;
        getConstants();
    }

    public double getCelsius() {
        return this.celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    @Override
    public double sum(double number1, double number2) {
        return number1 + number2;
    }

    @Override
    public double multiplication(double number1, double number2) {
        return number1 * number2;
    }

    public double celsiusToKelvinIn() {
        return sum(this.celsius, constant273_15);
    }

    public double celsiusToFahrenheitIn() {
        return sum(multiplication(this.celsius, constant1_8), constant32);
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
