package wrappers;

public class AppWrapperCompare {
    int a;
    Integer b;
    double c;
    Double d;
    char e;
    Character f;

    public AppWrapperCompare (int a, Integer b, double c, Double d, char e, Character f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean doesAequalsB() {
        if (this.a == this.b) {
            return true;
        }
            return false;
    }

    public boolean doesCequalsD() {
        if (this.c == this.d) {
            return true;
        }
        return false;
    }

    public boolean doesEequalsF() {
        if (this.e == this.f) {
            return true;
        }
        return false;

    }

}

class App {
    public static void main(String[] args) {
        AppWrapperCompare comparer = new AppWrapperCompare(10,10,15.00,15.00, 'c', 'c');

        boolean a = comparer.doesAequalsB();
        boolean b = comparer.doesCequalsD();
        boolean c = comparer.doesEequalsF();

        System.out.println(a +" "+ " " + b + " " + c);

    }
}
