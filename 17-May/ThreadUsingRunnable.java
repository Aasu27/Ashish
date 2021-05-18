
public class ThreadUsingRunnable implements Runnable {
	public void run() {
		System.out.println("Thread");
	}
	public static void main(String[] args) {
		ThreadUsingRunnable tur = new ThreadUsingRunnable();
		Thread t = new Thread(tur);
		t.run();
	}
}
