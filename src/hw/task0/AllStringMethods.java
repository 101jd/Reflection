package hw.task0;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AllStringMethods {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class<?> clazz = String.class;
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods){
            System.out.println(method);
        }
    }
}
