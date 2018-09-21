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

    static double getQuadraticFormula(double squareCoefficient, double singleCofficient, double constantNumber) {
        double quadraticFormulaPositiveOutput = (-(singleCofficient) + Math.sqrt(Math.pow(singleCofficient,2) - (4 * squareCoefficient * constantNumber)))/(2 * squareCoefficient);
        return quadraticFormulaPositiveOutput;
    }

    public static void main(String[] args) {
        double CircleInput = getAreaOfCircle(20);
        double celsiusInput = getCelsiusToFahrenheit(14);
        double farhrenheitInput = getFahrenheitToCelsius(6);
        double quadraticInput = getQuadraticFormula(5,3,9);
        System.out.println(CircleInput);
        System.out.println(celsiusInput);
        System.out.println(farhrenheitInput);
        System.out.println(quadraticInput);
    }
}