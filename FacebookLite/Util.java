public class Util{
    public static void print(String s){
        System.out.println(s);
    }
    public static void reset(String[] s){
        for(int i = 0; i < s.length; i++){
            s[i] = "";
        }
    }
    public static void pring(String[] s){
        for(int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }
    }
}