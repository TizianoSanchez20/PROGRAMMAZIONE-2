public class RegularIntervalSchedule implements ProgrammingSchedule {
    private final int startDate;
    private final int interval;
    private final int endDate;

    public RegularIntervalSchedule(int startDate, int interval, int endDate) {
        this.startDate = startDate;
        this.interval = interval;
        this.endDate = endDate;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int currentDate = startDate;

            @Override
            public boolean hasNext() {
                return currentDate <= endDate;
            }

            @Override
            public Integer next() {
                int date = currentDate;
                currentDate += interval;
                return date;
            }
        };
    }
}