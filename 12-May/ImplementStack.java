
public class ImplementStack {
	int s, t;
	long[] a;
	public ImplementStack(int s) {
		this.s = s;
		a = new long[s];
		t = -1;
	}
	public void push(long p) {
		a[++t] = p;
	}
	public long pop() {
		return a[t--];
	}
	public boolean isEmpty() {
		return (t==-1);
	}
	public static void main(String[] args) {
		ImplementStack is = new ImplementStack(5);
		is.push(1);
		is.push(2);
		is.push(3);
		is.push(4);
		while(!is.isEmpty()) {
			long l = is.pop();
			System.out.print(l);
			System.out.print(" ");
		}
	}
}
