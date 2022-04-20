public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second= second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour <24 ){
            this.hour = hour;
        }else {
            this.hour = 0;

        }
    }

    public void setMinute(int minute) {
        if (minute >=0 && minute <=59 ){
            this.minute = minute;
        }else {
            this.minute = 0;

        }
    }

    public void setSecond(int second) {
        if (second >=0 && second <=59 ){
            this.second = second;
        }else {
            this.minute = 0;

        }
    }
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Time: " +  hour + ":" + minute + ":" + second + '.';
    }
    public Time nextSecond(){

    }
    public Time previousSecond(){

    }
}
