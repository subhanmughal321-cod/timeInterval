public class timeInterval {
    private int hours;
    private int minutes;
    private int seconds;
    private String type;

    public timeInterval() {
        hours = 0;
        minutes = 15;
        seconds = 0;
        type = "BREAK";
    }
       public timeInterval(int hours,int minutes,int seconds,String type) {
        if(hours >= 0)
           this. hours = hours;
        else
            this.hours = 0;
        if(minutes >= 0 && minutes <= 59)
            this.minutes = minutes;
        else
            this.minutes = 0;
        if(seconds >= 0 && seconds <= 59)
           this.seconds=seconds;
        else
            this.seconds=0;
        if(type!=null && !type.isEmpty())
            this.type=type;
        else
            this.type="BREAK";
    }
    public timeInterval(timeInterval a) {
        hours = a.hours;
        minutes = a.minutes;
        seconds = a.seconds;
        type = a.type;
    }
     public static timeInterval create(int h, int m, int s, String t) {

        if (h >= 0 &&m >= 0 && m <= 59 &&s >= 0 && s <= 59 &&t != null && !t.isEmpty()) {
            return new timeInterval(h, m, s, t);
        }
       else
         return null;
    }
     public void setHours(int h) {
        if (h >= 0)
            hours = h;
        else
            System.out.println("Invalid Hours");
    }
    public void setMinutes(int m) {
        if (m >= 0 && m <= 59)
            minutes = m;
        else
            System.out.println("Invalid Minutes");
    }
    public void setSeconds(int s) {
        if (s >= 0 && s <= 59)
            seconds = s;
        else
            System.out.println("Invalid Seconds");
    }
    public void setType(String t) {
        if (t != null && !t.isEmpty())
            type = t;
        else
            System.out.println("Invalid Type");
    }
    private int totalSeconds() {
        return (hours * 3600) + (minutes * 60) + seconds;
    }
    public boolean isEqual(timeInterval obj) {
         if(this.totalSeconds() == obj.totalSeconds())
            return true;
        else 
            return false;
    }
    public boolean notEqual(timeInterval obj) {
        if(this.totalSeconds() == obj.totalSeconds())
            return false;
        else 
            return true;
    }
    public int shiftDuration(int secondsToAdd) {
        String originalType = type;
        int total = totalSeconds();
        total = total + secondsToAdd;
        if (total < 0)
            total = 0;
        hours = total / 3600;
        minutes = (total % 3600)/60;
        seconds = total % 60;
        if (total > 7200) {
            type = "LONG";
        }
        else if (total > 1800 && total <= 7200) {
            type = "MEDIUM";
        }
        else {
            type = originalType;
        }
        return total;
    }
    public String toString() {
        return "Interval: " + hours + "h " + minutes + "m " + seconds + "s, Type: "+ type;
    }
    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public String getType() {
        return type;
    }
     public timeInterval copy() {
    timeInterval a = new timeInterval();
    a.hours = this.hours;
    a.minutes = this.minutes;
    a.seconds = this.seconds;
    a.type= this.type;
    return a;
}
}
