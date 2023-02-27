package counter;

public class Counter {

    private int value = 0;

    public int incrementValue(int value) {
        value = value + 1;
        return value;
    }

    public int getValue() {
        return value;
    }
}

class App {
    public static void main(String[] args) {

        Counter counter = new Counter();

        int count5 = counter.incrementValue(5);
        int count6 = counter.getValue();
        System.out.println(count5);
        System.out.println(count6);


    }
}
