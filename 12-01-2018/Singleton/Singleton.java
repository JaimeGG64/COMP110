class Singleton{
    private int value;
    private static Singleton instance = new Singleton();

    private Singleton(){
    }
    
    public void setValue(int value){
        this.value = value;
    }
    
    public int getValue(){
        return value;
    }
    
    public static Singleton getInstance(){
        System.out.println("Singleton Demo");
        return instance;
    }
}