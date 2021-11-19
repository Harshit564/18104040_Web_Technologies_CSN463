class MyException extends Exception {
    private static int accno[] = { 2001, 2002, 2003, 2004, 2005 };
    private static String name[] = { "Rakesh", "Shubham", "Sushrut", "Aman", "Aarav" };
    private static double bal[] = { 123300.00, 102000.00, 3290.50, 909.00, 1342.45 };

    MyException() {
    }

    MyException(String str) {
        super(str);
    }

    public static void main(String[] args) {
        try {
            System.out.println("ACCOUNT NUMBERS" + "\t" + "CUSTOMER NAME" + "\t" + "BALANCE AMOUNTS");
            for (int i = 0; i < 5; i++) {
                System.out.println(accno[i] + "\t\t" + name[i] + "\t\t" + bal[i]);
                if (bal[i] < 1000) {
                    MyException me = new MyException("Balance amount is less");
                    throw me;
                }
            }
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}