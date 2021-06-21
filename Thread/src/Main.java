public class Main {
    public static void main(String [] args){
        new SimpleThread("Thread Object 1").run();
        new SimpleThread("Thread Object 2").run();
        new Thread(new SimpleThread("runnable Object")).start();
    }

}
