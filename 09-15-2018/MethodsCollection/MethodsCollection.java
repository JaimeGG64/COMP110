//Name: Jaime Garcia Garcia
//Date: 09-15-2018
//Application: Collection of Methods
//Purpose: The application has a series of a methods that calculate the area/circumference of a circle, convert beteen fahrenheit and celsius, and has the quadatic formula
class MethodsCollection {
    static double getAreaOfCircle(double radius) {
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        return areaOfCircle;
    }

    static double getCircumferenceOfCircle(double radius) {
        double circumferenceOfCircle = 2 * Math.PI * radius;
        return circumferenceOfCircle;
    }

    static double getCelsiusToFahrenheit(double celsius) {
        double celsiusToFahrenheit = ((9 * celsius)/5) + 32;
        return celsiusToFahrenheit;
    }

    static double getFahrenheitToCelsius(double farhrenheit) {
        double fahrenheitToCelsius = ((farhrenheit - 32) * 5)/9;
        return fahrenheitToCelsius;
    }

    static void getQuadraticFormula(double squareCoefficient, double singleCofficient, double constantNumber) {
        System.out.println("The Quadratic Formula give the following output:");
        double quadraticFormulaPositiveOutput = (-(singleCofficient) + Math.sqrt(Math.pow(singleCofficient,2) - (4 * squareCoefficient * constantNumber)))/(2 * squareCoefficient);
        System.out.println("Postive Root:" + quadraticFormulaPositiveOutput);
        double quadraticNegativeOutput = (-(singleCofficient) - Math.sqrt(Math.pow(singleCofficient,2) - (4 * squareCoefficient * constantNumber)))/(2 * squareCoefficient);
        System.out.println("Negative Root:" + quadraticNegativeOutput);
    }

    public static void main(String[] args) {
        //Area of Circle
        double regularCircleInputArea = getAreaOfCircle(20);
        double negativeCircleInputArea = getAreaOfCircle(-5);
        double zeroCircleInputArea = getAreaOfCircle(0);
        String areaOfCircleMessage = "The Area of Circle Method gave the follow output \n" + Double.toString(regularCircleInputArea) + "\n" + Double.toString(negativeCircleInputArea) + "\n" + Double.toString(zeroCircleInputArea);

        //Circumference of Circle
        double regularCircleInputCircumference = getCircumferenceOfCircle(2);
        double pointCircleInputCircumference = getCircumferenceOfCircle(2.5);
        double zeroCircleInputCircumference = getCircumferenceOfCircle(0);
        String CircumferenceOfCircleMessage = "The Circumference of Circle Method gave the follow output \n" + Double.toString(regularCircleInputCircumference) + "\n" + Double.toString(pointCircleInputCircumference) + "\n" + Double.toString(zeroCircleInputCircumference);

        //Celsius to Fahrenheit
        double regularTempetureInputFahrenheit = getCelsiusToFahrenheit(6);
        double zeroTempetureInputFahrenheit = getCelsiusToFahrenheit(0);
        double negativeTempetureInputFahrenheit = getCelsiusToFahrenheit(-8);
        String CelsiusToFahrenheitMessage = "The Celsius to Fahrenheit Method gave the follow output \n" + Double.toString(regularTempetureInputFahrenheit) + "\n" + Double.toString(zeroTempetureInputFahrenheit) + "\n" + Double.toString(negativeTempetureInputFahrenheit);

        //Fahrenheit to Celsius
        double regularTempetureInputCelsius = getFahrenheitToCelsius(7);
        double zeroTempetureInputCelsius = getFahrenheitToCelsius(0);
        double pointTempetureInputCelsius = getFahrenheitToCelsius(9.4);
        String FahrenheitToCelsiusMessage = "The Fahrenheit to Celsius Method gave the follow output \n" + Double.toString(regularTempetureInputCelsius) + "\n" + Double.toString(zeroTempetureInputCelsius) + "\n" + Double.toString(pointTempetureInputCelsius);

        //Outputs
        System.out.println(areaOfCircleMessage);
        System.out.println(CircumferenceOfCircleMessage);
        System.out.println(CelsiusToFahrenheitMessage);
        System.out.println(FahrenheitToCelsiusMessage);
        
        getQuadraticFormula(-3, 5, 10);
        getQuadraticFormula(3, 3, -5);
        getQuadraticFormula(7, 3, 0);
    }
}