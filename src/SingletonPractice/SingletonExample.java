package SingletonPractice;

public class SingletonExample {

    private static SingletonExample s1= new SingletonExample();
    private SingletonExample(){
        System.out.println("Creating...");

    }
    public static SingletonExample getInstance(){
        return s1;
    }

}
