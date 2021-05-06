import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalizedDataTime {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		String s  = dt.format(dtf);
		System.out.println("Date & Time : " + s);
	}
}
