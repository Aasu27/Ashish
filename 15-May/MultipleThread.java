
public class MultipleThread extends Thread {
	public void run() {
		for(int i=3;i>0;i--) {
			System.out.println("Thread : " + Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		MultipleThread mt = new MultipleThread();
		mt.start();
		MultipleThread mt1 = new MultipleThread();
		mt1.start();
	}
}
