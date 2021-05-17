
class B extends Thread {
	public void run() {
		System.out.println("Close");
	}
}
public class StopThread {
	public static void main(String[] args) throws InterruptedException {
		B b = new B();
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(b);
		for(;;) {
			System.out.println("Infinte");
		}
	}
}
