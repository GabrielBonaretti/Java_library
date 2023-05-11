public class ConvertTemperatures {
    public double fahrenheitToCelsius(double fahrenheit) {
        Fahrenheit f = new Fahrenheit(fahrenheit);
        return f.fahrenheitToCelsiusIn();
    }
    public double fahrenheitToKelvin(double fahrenheit) {
        Fahrenheit f = new Fahrenheit(fahrenheit);
        return f.fahrenheitToKelvinIn();
    }
    public double celsiusToKelvin(double celsius) {
        Celsius c = new Celsius(celsius);
        return c.celsiusToKelvinIn();
    }
    public double celsiusToFahrenheit(double celsius) {
        Celsius c = new Celsius(celsius);
        return c.celsiusToFahrenheitIn();
    }
    public double kelvinToCelsius(double kelvin) {
        Kelvin k = new Kelvin(kelvin);
        return k.kelvinToCelsiusIn();
    }
    public double kelvintoFahrenheit(double kelvin) {
        Kelvin k = new Kelvin(kelvin);
        return k.kelvintoFahrenheitIn();
    }
}
