package OOP.TaskAdnotacje;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
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
        String className = myAdnotation.getClass().getName();
        System.out.println("Nazwa klasy: " + className);

        Constructor<?>[] constructorNumber = myAdnotation.getClass().getConstructors();
        int constructorCount = constructorNumber.length;
        System.out.println("Ilość konstruktorów: " + constructorCount);

        Method[] methodNumber = myAdnotation.getClass().getDeclaredMethods();
        int methodNum = methodNumber.length;
        System.out.println("Ilosc metod: " + methodNum);

        for (Method method : methodNumber) {
            boolean isSuper = method.isAnnotationPresent(SuperMethod.class);
            String returnType = method.getReturnType().getSimpleName();
            String methodName = method.getName();
            System.out.println("Metoda: " + methodName + ", Zwracany typ: " + returnType);
            System.out.println("Metoda " + methodName + " jest oznaczona adnotacja 'SuperMethod' " + isSuper);
        }

        Field[] fields = myAdnotation.getClass().getDeclaredFields();

        for (Field field : fields) {
            String fieldName = field.getName();
            String fieldType = field.getType().getSimpleName();
            System.out.println("Pole: " + fieldName + ", Typ: " + fieldType);
        }
        }
    }
