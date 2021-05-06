import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class PatternDateTime {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("DD:MM:YYYY hh:mm:ss");
		String s = dt.format(dtf);
		System.out.println("Date & Time : " + s);
	}
}
