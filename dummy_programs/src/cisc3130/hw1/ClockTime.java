package cisc3130.hw1;

public class ClockTime implements Comparable<ClockTime> {

    private int hour, minute;
    private String meridiem;

    public ClockTime(int hour, int minute, String meridiem) throws IllegalArgumentException {

        if (hour < 1 || hour > 12) {
            throw new IllegalArgumentException("");
        }

        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("");
        }

        if (!meridiem.equals("am") && !meridiem.equals("pm")) {
            throw new IllegalArgumentException("");
        }

        this.hour = hour;
        this.minute = minute;
        this.meridiem = meridiem;

    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public String getAmOrPm() {
        return this.meridiem;
    }

    @Override
    public String toString() {

        if (this.minute < 10) {

            return this.hour + ":0" + this.minute + this.meridiem;

        } else {

            return this.hour + ":" + this.minute + " " + this.meridiem;

        }

    }

    @Override
    public boolean equals(Object o) {

        if (o instanceof ClockTime) {

            ClockTime other = (ClockTime) o;

            return this.hour == other.hour && this.minute == other.minute && this.meridiem.equals(other.meridiem);
        } else {

            return false;

        }
    }

    @Override
    public int compareTo(ClockTime other) {

        if (this.meridiem.equals("am") && other.meridiem.equals("pm")) {

            int militaryTime0 = other.hour + 12;
            return Integer.compare(this.hour, militaryTime0);

        } else if (this.meridiem.equals("pm") && other.meridiem.equals("am")){

            int militaryTime1 = this.hour + 12;
            return Integer.compare(militaryTime1, other.hour);

        } else { // will add clause if both meridiem are same, and will do appropriate math on each

            if (this.meridiem.equals("am")) {

                if (this.hour == other.hour) { // if hours equal & in am meridiem

                    return Integer.compare(this.minute, other.minute);

                } else { // if hours not equal & in am meridiem

                    if (this.hour == 12) {

                        this.hour = 0;
                        return Integer.compare(this.hour, other.hour);

                    } else if (other.hour == 12) {

                        other.hour = 0;
                        return Integer.compare(this.hour, other.hour);

                    } else {

                        return Integer.compare(this.hour, other.hour);

                    }

                }

            } else {

                if (this.hour == other.hour) {

                    return Integer.compare(this.minute, other.minute);

                } else {

                    if (this.hour == 12) {

                        this.hour = 0;
                        return Integer.compare(this.hour, other.hour);

                    } else if (other.hour == 12) {

                        other.hour = 0;
                        return Integer.compare(this.hour, other.hour);

                    } else {

                        return Integer.compare(this.hour, other.hour);

                    }

                }

            }

        }

        // on a 24 hour clock, anything closer to 12am is CONSIDERED LESS
    }
}



