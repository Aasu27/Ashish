import java.util.LinkedList;

class ProCon {
	LinkedList<Integer> ll = new LinkedList<>();
	int i=2;
	public void produce() throws InterruptedException {
		int v=0;
		while (true) {
			synchronized(this) {
				while(ll.size()==i) {
					wait();
				}
				System.out.println("Producer : " + v);
				ll.add(v++);
				notify();
				Thread.sleep(2000);
			}
		}
	}
	public void consumer() throws InterruptedException {
		while(true) {
			synchronized(this) {
				while(ll.size()==0) {
					wait();
				}
				int v = ll.removeFirst();
				System.out.println("Consumer : " + v);
				notify();
				Thread.sleep(2000);
			}
		}
	}
}
public class ProducerConsumer {
	public static void main(String[] args) throws Exception {
		final ProCon p = new ProCon();
		Thread t =new Thread(new Runnable() {
			public void run() {
				try {
					p.produce();
				}
				catch(Exception e) {
					System.out.println("Exception occurred" + e);
				}
			}
		});
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					p.consumer();
				}
				catch(Exception e) {
					System.out.println("Exception occurred" + e);
				}
			}
		});
		t.start();
		t1.start();
	}
}
