
public class Employee implements java.io.Serializable  {
	public String nm;
	public String add;
	public int id;
	
	public String setnm(String nm) {
		this.nm = nm;
		return nm;
	}
	public String setadd(String add) {
		this.add = add;
		return add;
	}
	public int setid() {
		return id;
	}
}
