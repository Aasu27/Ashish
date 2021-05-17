
class Run {
	public void print(int j) {
		synchronized(this) {
			for(int i=0;i<=5;i++) {
				System.out.println(j+i);
				try {
					Thread.sleep(1000);
				}
				catch(Exception e) {
					System.out.println("Exception occurred" + e);
				}
			}
		}
	}
}
class A extends Thread {
	Run r;
	A(Run r){
		this.r = r;
	}
	public void run() {
		r.print(8);
	}
}
public class SynchronizedBlock {
	public static void main(String[] args) {
		Run r1 = new Run();
		A a = new A(r1);
		a.start();
	}
}
