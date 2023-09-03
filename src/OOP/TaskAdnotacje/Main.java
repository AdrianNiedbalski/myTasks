package OOP.TaskAdnotacje;
import java.lang.reflect.Method;
public class Main{
    public static void main(String[] args) {
        Adnotacje myAdnotation = new Adnotacje();
        try {
            Method method = myAdnotation.getClass().getMethod("sum");
            if (method.isAnnotationPresent(SuperMethod.class)) {
                SuperMethod superMethod = method.getAnnotation(SuperMethod.class);
                System.out.println("Metoda 'sum' jest oznaczona adnotacją 'SuperMethod' z parametrem na " + superMethod.run());
            }
            else {
                System.out.println("Metoda 'sum' nie jest oznaczona adnotacją 'SuperMethod'");
            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
