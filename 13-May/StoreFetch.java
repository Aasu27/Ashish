
public class StoreFetch<T> {
	T t;
	StoreFetch(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}
	public static void main(String[] args) {
		StoreFetch<Integer> sf = new StoreFetch<Integer>(11);
		System.out.println(sf.get());
	}
}
