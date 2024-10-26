public class Base {
    int n, i;

    Base() {
        add(1);
    }

    void add(int n) {
        i += n;
    }

    void print() {
        System.out.println(i);
    }
}

class Ext extends Base {
    Ext() {
        add(2);
    }

    @Override
    void add(int n) {
        i += n * 2;
    }
}

