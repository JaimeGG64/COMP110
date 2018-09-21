class MethodsCollection {
    static double getAreaOfCircle(double radius) {
        double areaOfCircle = Math.pow(radius, 2) * Math.PI;
        return areaOfCircle;
    }

    public static void main(String[] args) {
        
        double CircleInput = getAreaOfCircle(20);
        System.out.println(CircleInput);
    }
}