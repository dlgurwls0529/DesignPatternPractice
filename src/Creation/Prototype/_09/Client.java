package Creation.Prototype._09;

import java.lang.reflect.Field;

public class Client {
    public static void main(String[] args) {
        Circle circle = new Circle(3, 5, 10);
        printAllField(circle);

        Circle circle1 = (Circle) circle.clone();
        printAllField(circle1);

    }

    private static void printAllField(Object o) {
        Class<?> classType = o.getClass();
        Class<?> superClassType = o.getClass().getSuperclass();

        Field[] fields = classType.getDeclaredFields();
        Field[] superClassFields = superClassType.getDeclaredFields();

        System.out.println("<" + o.hashCode() + ">");

        for(int i = 0; i < superClassFields.length; i++) {
            superClassFields[i].setAccessible(true);
            try {
                System.out.println(superClassFields[i].getName()
                        + " : "
                        + superClassFields[i].get(o));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        for(int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            try {
                System.out.println(fields[i].getName()
                        + " : "
                        + fields[i].get(o));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

}
