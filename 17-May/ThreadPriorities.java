
public class ThreadPriorities extends Thread {
	public void run() {
		System.out.println("Thread Priorities");
	}
	public static void main(String[] args) {
		ThreadPriorities tp = new ThreadPriorities();
		tp.start();
		tp.setPriority(MAX_PRIORITY);
		ThreadPriorities tp1 = new ThreadPriorities();
		tp1.start();
		tp1.setPriority(MIN_PRIORITY);
		int j = tp1.getPriority();
		System.out.println("Priority : " + j);
		int i = tp.getPriority();
		System.out.println("Priority : " + i);
	}
}
