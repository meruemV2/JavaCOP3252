public class DateAndTime {

	Date date;
	Time time;

	public DateAndTime() {
		date = new Date(1, 1, 1);
		time = new Time(date);
		
		System.out.printf("Date/Time default values are: %s\n\n", this);
	}
	
	public DateAndTime(int mon, int day, int year, int hour, int min, int sec) {
		
		date = new Date(mon, day, year);
		time = new Time(date, hour, min, sec);

		System.out.printf("Date/Time given values: %s\n\n", this);
	}

	public int getDay() {
		return date.getDay();
	}

	public int getMonth() {
		return date.getMonth();
	}

	public int getYear() {
		return date.getYear();
	}

	public int getHour() {
		return time.getHour();
	}

	public int getMinute() {
		return time.getMinute();
	}

	public int getSecond() {
		return time.getSecond();
	}

	public void nextDay() {
		date.nextDay();
	}

	public void nextMonth() {
		date.nextMonth();
	}

	public void tick() {
		time.tick(date);
	}
	
	public void incrementMinute() {
		time.incrementMinute(date);
	}

	public void incrementHour() {
		time.incrementHour(date);
	}

	@Override
	public String toString() {
		return String.format("%02d/%02d/%04d       %02d:%02d:%02d %s", date.getMonth(), date.getDay(), date.getYear(),
				((time.getHour() == 0 || time.getHour() == 12) ? 12 : time.getHour() % 12), time.getMinute(),
				time.getSecond(), (time.getHour() < 12 ? "AM" : "PM"));
	}

	public String toUniversalString() {
		return String.format("%02d/%02d/%04d –%02d:%02d:%02d", date.getMonth(), date.getDay(), date.getYear(),
				time.getHour(), time.getMinute(), time.getSecond());
	}
}