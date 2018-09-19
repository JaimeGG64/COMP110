public class Lec6 {
    public static int getValue(int input, int anotherinput) {
        int plus = input + anotherinput;
        return plus;
    }

    public static double getCircumference(double r) {
        double c = 2 * Math.PI * r;
        return c;
    }

    public static void main(String[] args) {
        int someValue = getValue(6, 5);
        int maxVal = Math.max(5, 20);
        System.out.println(someValue);
        System.out.println(maxVal);

        double input = getCircumference(5);
        System.out.println(input);
    }
}