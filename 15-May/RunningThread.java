
public class RunningThread extends Thread {
	String t;
	RunningThread(String n){
		t = n;
		System.out.println(t + " created");
	}
	public void run() {
		System.out.println(t + " running");
	}
	public static void main(String[] args) {
		RunningThread rt = new RunningThread("Thread 1");
		rt.start();
		RunningThread rt1 = new RunningThread("Thread 2");
		rt1.start();
	}
}
