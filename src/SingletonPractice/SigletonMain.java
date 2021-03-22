package SingletonPractice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Main {
    public static void main(String args []) {

        SingletonExample s1 = SingletonExample.getInstance();
        System.out.println("S1"+s1);

        SingletonExample s2 = SingletonExample.getInstance();
        System.out.println("S2"+s2);


        SingletonExample s3 = SingletonExample.getInstance();
        System.out.println("S3"+s3);
/*

        //Reflection
        Class clazz = Class.forName("patterns.Singleton");
        Constructor<SingletonExample> ctor = clazz.getDeclaredConstructor();
        ctor.setAccessible(true);
        SingletonExample s4 = ctor.newInstance();
        System.out.println("s4"+s4);
*/


    }
}
