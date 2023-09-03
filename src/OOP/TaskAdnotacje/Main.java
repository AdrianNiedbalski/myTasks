package OOP.TaskAdnotacje;
import java.lang.reflect.Method;
/*Zadanie 1
        Napisać dowolną klasę która ma dowlne 3-4 pola - proste i obiektowe.
        Stworzyć w tej klasie dowlne 3-4 metody jakies proste które coś tam obliczają.
        Stworzyć w tej klasie 2 konstruktory, bezargumentowy i argumentowy.
        W osobnym pliku zdefiniować adnotację która się nazywa "SuperMethod" która przyjmuje paramets "run" który jest true albo false.
        Dowolną metodę w wcześniej stworzonej klasie opatrzeć adnotacją SuperMethod i dać mu parameter "run" na true;*/
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
