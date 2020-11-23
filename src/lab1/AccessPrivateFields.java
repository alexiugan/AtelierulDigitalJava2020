package lab1;

import java.lang.reflect.Field;

public class AccessPrivateFields {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Student s = new Student("John", 21);

        Field field = s.getClass().getDeclaredField("name");
        field.setAccessible(true);
        System.out.println(field.get(s));
    }
}
