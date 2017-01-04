import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.time.LocalDate;
import java.time.Month;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

public class BusinessDayTest {
	@Test
	public void should_return_0_if_start_day_is_sat_and_end_day_is_immediate_sunday() throws Exception {
		LocalDate saturday = LocalDate.of(2016, Month.JULY, 2);
		LocalDate sunday = saturday.plusDays(1);

		assertThat(BusinessDay.between(saturday, sunday).inDays(), is(0));
	}
	
	@Test
	public void should_return_0_if_start_day_is_sat_and_end_day_is_immediate_sunday1() throws Exception {
		LocalDate saturday = LocalDate.of(2016, Month.JULY, 1);
		LocalDate sunday = LocalDate.of(2016, Month.JULY, 1);

		assertThat(BusinessDay.between(saturday, sunday).inDays(), is(1));
	}

	/*@Test
	public void should_return_5_if_duration_is_a_week() throws Exception {
		LocalDate today = LocalDate.of(2016, Month.JULY, 6);
		LocalDate aWeekLater = today.plusDays(6);

		assertThat(BusinessDay.between(today, aWeekLater).inDays(), is(5));
	}

	@Test
	public void should_return_7_if_start_day_is_fri_and_end_day_is_next_mon() throws Exception {
		assertThat(BusinessDay.between(LocalDate.of(2016, Month.JULY, 1), LocalDate.of(2016, Month.JULY, 11)).inDays(),
				CoreMatchers.is(7));

	}

	@Test
	public void should_return_21_if_duration_is_in_jul_2016() throws Exception {
		assertThat(BusinessDay.between(LocalDate.of(2016, Month.JULY, 1), LocalDate.of(2016, Month.JULY, 31)).inDays(),
				is(21));
	}

	@Test
	public void should_return_66_if_duration_is_jul_to_the_end_of_sep_2016() throws Exception {
		assertThat(BusinessDay.between(LocalDate.of(2016, Month.JULY, 1), LocalDate.of(2016, Month.SEPTEMBER, 30))
				.inDays(), is(21 + 23 + 22));
	}

	@Test
	public void should_return_minus_66_if_duration_is_the_end_of_sep_to_the_start_of_jul_2016() throws Exception {
		assertThat(BusinessDay.between(LocalDate.of(2016, Month.JULY, 1), LocalDate.of(2016, Month.SEPTEMBER, 30))
				.inDays(), is(21 + 23 + 22));
	}

	public void test_business_day() {
		LocalDate start = LocalDate.of(2016, 07, 02);
		LocalDate end = LocalDate.of(2017, 7, 1);
		// System.out.println(start +"--- "+ end +" " + BusinessDay.of(start,
		// end) +" " + end.getDayOfWeek());

		while (!start.isAfter(end)) {
			System.out.println(start + "--- " + end + " " + BusinessDay.of(start, end) + " " + end.getDayOfWeek());
			end = end.minusDays(1L);

		}
	}*/
}
