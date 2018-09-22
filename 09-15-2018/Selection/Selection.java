//Name: Jaime Garcia Garcia
//Date: 09-15-2018
//Application: Collection of Methods
//Purpose: The application has a series of a methods that calculate the area/circumference of a circle, convert beteen fahrenheit and celsius, and has the quadatic formula
class Selection {
    //A - If Statment
    public static void AifCheckExample(boolean hasCard, double money) {
        if(money > 4 || hasCard == true) {
            System.out.println("Enjoy your meal.");
        }
    }

    //B - If, Else Statement
    public static void BifElseCheckExample(boolean hasDriverLicense, int age) {
        if(hasDriverLicense == true && age >= 16){
            System.out.println("You can drive");
        }
        else {
            System.out.println("You cannot drive");
        }
    }

    //C - If, Else If, Else Statment
    // public static void CifElseIfElseCheckExample(boolean inDebt, double balance) {
    //     if (inDebt != false){
    //         double balance = -balance;
    //     }
    //     else if (inDebt != true) {
    //         double balance = -balance;
    //     }
    //     else {
    //         System.out.print("What happened to your money");
    //     }
    // }

    //D - If, Else If, Else If, Else
    public static void DifElseIfElseIfElseCheckExample(int pokedexNumber) {
        if (pokedexNumber < 386){
            System.out.println("Pokemon can be found in any region");
        }
        else if (pokedexNumber < 251) {
            System.out.print("Pokemon can be found in Kanto and Johto");
        }
        else if (pokedexNumber <= 151) {
            System.out.print("Pokemon can only be found in Kanto");
        }
        else {
            System.out.print("Pokemon might be nonexistent");
        }
    }

    //E - Nested If
    // public static void ENestedIfExample() {
    //     if(username.equalTo("Jim101")) {
    //         if(password.equalTo("password1")) {
    //             System.out.println("Welcome");
    //         }    
    //     }
    // }

    public static boolean selectionA(String s) {
        boolean result = false;
        if(s.length() > 5) {
            result = true;
        }

        return result;
    }

    //F - Switch Case
    public static void switchCaseExample(int year) {
        switch(year) {
            case 1 : System.out.println("Beginning of Common Era");
                break;
            case 2000 : System.out.println("Y2K");
                break;
            case 2018 : System.out.println("Current Year");
                break;
            case 3000 : System.out.println("The Future");
                break;
            default : System.out.println("Does not support");
        }
    }

    public static void main(String[] args) {
        String word = "word";
        boolean val = selectionA(word);
        System.out.println("Is " + word + " more than 5 characters? " + val);
        
        AifCheckExample(true, 20);
        BifElseCheckExample(false, 15);
        // CifElseIfElseCheckExample(false, 2);
        DifElseIfElseIfElseCheckExample(345);

        switchCaseExample(1);
    }
}