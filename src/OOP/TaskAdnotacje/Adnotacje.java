package OOP.TaskAdnotacje;
/*Zadanie 1
        Napisać dowolną klasę która ma dowlne 3-4 pola - proste i obiektowe.
        Stworzyć w tej klasie dowlne 3-4 metody jakies proste które coś tam obliczają.
        Stworzyć w tej klasie 2 konstruktory, bezargumentowy i argumentowy.
        W osobnym pliku zdefiniować adnotację która się nazywa "SuperMethod" która przyjmuje paramets "run" który jest true albo false.
        Dowolną metodę w wcześniej stworzonej klasie opatrzeć adnotacją SuperMethod i dać mu parameter "run" na true;*/
public class Adnotacje {
    private int a;
    private double b;
    private String text;
    private Obiect obiect;

    public Adnotacje(int a, double b, String text, Obiect obiect) {
        this.a = a;
        this.b = b;
        this.text = text;
        this.obiect = obiect;
    }
    public Adnotacje () {
    }
    @SuperMethod(run = true)
    public int sum () {
        return (int) (a+b);
    }
    public String textAdd (String otherText) {
        return text + otherText;
    }
    public void method () {
        System.out.println("Metoda wykonana");
    }
    public Obiect getObiect() {
        return obiect;
    }
}
