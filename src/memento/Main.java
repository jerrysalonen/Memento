package memento;

public class Main {

    public static void main(String[] args) {
        RiddlerCaretaker rc = new RiddlerCaretaker();

        Riddler r = new Riddler();

        Runnable runnable1 = () -> {
            Object o = rc.liityPeliin(r);
            for (int i = 0; i <= 100; i++) {
                if (rc.guess(o, i)) {
                    System.out.println("Thread 1: " + i + ", oikein!");
                    break;
                } else {
                    System.out.println("Thread 1: " + i + ", väärin.");
                }
            }
        };

        Runnable runnable2 = () -> {
            Object o = rc.liityPeliin(r);
            for (int i = 0; i <= 100; i++) {
                if (rc.guess(o, i)) {
                    System.out.println("Thread 2: " + i + ", oikein!");
                    break;
                } else {
                    System.out.println("Thread 2: " + i + ", väärin.");
                }
            }
        };

        Runnable runnable3 = () -> {
            Object o = rc.liityPeliin(r);
            for (int i = 0; i <= 100; i++) {
                if (rc.guess(o, i)) {
                    System.out.println("Thread 3: " + i + ", oikein!");
                    break;
                } else {
                    System.out.println("Thread 3: " + i + ", väärin.");
                }
            }
        };

        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);
        Thread t3 = new Thread(runnable3);

        t1.start();
        t2.start();
        t3.start();

    }
}
