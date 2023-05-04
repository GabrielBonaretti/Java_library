import orientedObject.Specialization;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Celsius extends Operations implements Gconst{
    double celsius;
    double constantKelvin = 273.15;
    double constant1Fahrenheit = 1.8;
    double constant2Fahrenheit = 32;

    public Celsius(double celsius){
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
        return number1+number2;
    }

    @Override
    public double multiplication(double number1, double number2) {
        return number1*number2;
    }

    public double celsiusToKelvin(){
        return sum(this.celsius, constantKelvin);
    }

    public double celsiusToFahrenheit(){
        return sum(multiplication(this.celsius, constant1Fahrenheit),constant2Fahrenheit);
    }

    @Override
    public double getConstants() {
        Constants m[] = Constants.values();
        for (int i = 0; i < m.length; i++) {
            switch(i){
                case 0 -> constantKelvin = m[0].contants;
                case 1 -> constant1Fahrenheit = m[1].contants;
                case 2 -> constant2Fahrenheit = m[2].contants;
            };
        }
        return 0;
    }
}
