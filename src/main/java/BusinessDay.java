import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class BusinessDay {
	public BusinessDay() {
		// TODO Auto-generated constructor stub
	}
	private LocalDate start;
	private LocalDate end;
	
	public static BusinessDay between(LocalDate a, LocalDate b) {
		return new BusinessDay(a, b);
	}
	
	public BusinessDay(LocalDate a, LocalDate b) {
		this.start = a;
		this.end = b;
	}
	
	public int inDays() {
		return of(this.start, this.end);
	}
	
	public static int of1(LocalDate start, LocalDate end) {
		int i =0, j = 0, base  =  start.getDayOfWeek().getValue();
		int days = (int) ChronoUnit.DAYS.between(start, end);
		while(j < days) {
			if (base % 7 < 5) {
				i++;
			} else {
				if(days < 2) return 0;
			}
			base++; j++;
		}
		return ++i;
	}
	
	public static int of(LocalDate start, LocalDate end) {
		int days = (int) ChronoUnit.DAYS.between(start, end);
		int startBase = start.getDayOfWeek().getValue();
		int endBase = end.getDayOfWeek().getValue();
		int startTrailing  = getStartTrailing(startBase);
		int endTrailing =  getEndTrailing(endBase);
		int weekends =  (startTrailing + days + endTrailing) /7 *2;
		System.out.println(weekends);
		return 0;
		
		
		
	}

	public static int getEndTrailing(int endBase) {
		return 7- endBase;
	}

	public static int getStartTrailing(int startBase) {
		return startBase > 5 ? 7 - startBase : startBase + 1;
	}
}

