import java.util.ArrayList;

public class Ques2 {
    public static void main(String[] args) {
        Market sm = new Market(25);
        sm.farmer("apple");
        sm.farmer("orange");
        sm.farmer("grape");
        sm.farmer("watermelon");
        sm.consumer();
    }
}

class Market {
    private ArrayList<String> fts = new ArrayList<>();
    private int num;

    public Market(int num) {
        if (num > 0) {
            this.num = num;
        } else {
            throw new IllegalArgumentException("Invalid argument");
        }
    }

    private synchronized boolean isFull() {
        return fts.size() == this.num;
    }

    private synchronized boolean isEmpty() {
        return fts.isEmpty();
    }

    public synchronized void farmer(String ft) {
        if (isFull()) {
            System.out
                    .println("No more fruits can be accepted");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interruption");
            }
        }
        fts.add(ft);
        System.out.printf("fruit : %s is added %n", ft);
    }

    public synchronized String consumer() {

        if (isEmpty()) {
            System.out.println("No good fruit");
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interruption");
            }
        }

        String cur_fts = fts.remove(0);
        notifyAll();
        return cur_fts;
    }

}
