public class Hora {
    private int hour;
    private int minute;

    public Hora(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour(){
        return hour;
    }

    public int getMinute(){
        return minute;
    }

    public String toString(){
        return hour + ":" + String.format("%02d", minute);
    }
}
