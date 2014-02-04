public class HelloRunnable implements Runnable {

	int ii;
	HelloRunnable(int ii){
		this.ii = ii;
	}
    public void run() {
        System.out.println("Hello from a thread!"+ii);
    }

    public static void main(String args[]) {
        (new Thread(new HelloRunnable(0))).start();
        (new Thread(new HelloRunnable(1))).start();
        (new Thread(new HelloRunnable(2))).start();
        (new Thread(new HelloRunnable(3))).start();
    }

}