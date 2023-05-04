public enum Constants {
    CONSTANTKELVIN(273.15), CONSTANT1FAHRENHEIT(1.8), CONSTANT2FAHRENHEIT(32);
    double contants;
    //Constructor to initialize the instance variable
    Constants(double contants) {
        this.contants = contants;
    }
    public static void getMarks(int model){
        Constants marks[] = Constants.values();
        System.out.println("Price of: "+marks[model]+" is "+marks[model].contants);
    }
}
