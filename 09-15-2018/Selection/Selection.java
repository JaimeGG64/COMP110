class Selection {
    public static boolean selectionA(String s) {
        boolean result = false;
        if(s.length() > 5) {
            result = true;
        }

        return result;
    }

    public static void selection(int age) {
        switch(age) {
            case 1 : System.out.println("baby");
                break;
            case 13 : System.out.println("teen");
                break;
            case 16 : System.out.println("can drive");
                break;
            default : System.out.println("Does not support");
        }
    }

    public static void main(String[] args) {
        String word = "word";
        boolean val = selectionA(word);
        System.out.println("Is " + word + " more than 5 characters? " + val);
        
        selection(20);
        selection(1);
        selection(16);
    }
}