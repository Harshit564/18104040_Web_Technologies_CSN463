class Ques3 extends Thread {
    public void run() {
        for (int i = 1; i <= 100; ++i) {
            System.out.print(i + "  ");
            if (i % 10 == 0)
                System.out.println("Hello World!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        new Ques3().start();
    }
}