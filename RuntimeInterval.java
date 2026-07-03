public class RuntimeInterval {

    public static void main(String[] args) {
        System.out.println("\n\tTIME INTERVAL");
        timeInterval t1 = new timeInterval();
        timeInterval t2 = new timeInterval(1, 20, 30, "WORK");
        timeInterval t3 = new timeInterval(t2);
        timeInterval t4 = timeInterval.create(2, 10, 15, "TRAVEL");
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        System.out.println(t4.toString());
System.out.println("\nGetters checking");
        System.out.println("Hours: " + t2.getHours());
        System.out.println("Minutes: " + t2.getMinutes());
        System.out.println("Seconds: " + t2.getSeconds());
        System.out.println("Type: " + t2.getType());
System.out.println("\nSetters checking and its value after new values");
        t2.setHours(3);
        t2.setMinutes(45);
        t2.setSeconds(20);
        t2.setType("ANYTHING");

        System.out.println(t2.toString());

        System.out.println("Checking conditon of invlaid hours second minutes");
        t2.setHours(-2);
        t2.setMinutes(80);
        t2.setSeconds(90);
        t2.setType("");

        System.out.println("\nUsing compare methods");
        if (t2.isEqual(t3))
            System.out.println("t2 and t3 have same duration.");
        else
            System.out.println("t2 and t3 have different duration.");

        if (t2.notEqual(t3))
            System.out.println("notEqual returns TRUE");
        else
            System.out.println("notEqual() returns FALSE");

        System.out.println("Copy method ");

        timeInterval t5 = t2.copy();

        System.out.println("Original is: " + t2);
        System.out.println("Copy is:     " + t5);

        System.out.println("\nFirst condition checking of remaining same type");

        timeInterval s1 = new timeInterval(0, 20, 0, "BREAK");

        int total1 = s1.shiftDuration(300);

        System.out.println("Total Seconds = " + total1);
        System.out.println(s1);

        System.out.println("\nseond condition checking of changing to work");

        timeInterval s2 = new timeInterval(0, 20, 0, "WORK");

        int total2 = s2.shiftDuration(2000);

        System.out.println("Total Seconds = " + total2);
        System.out.println(s2);

        System.out.println("\nthird condition checking of changing to travel");

        timeInterval s3 = new timeInterval(1, 0, 0, "TRAVEL");

        int total3 = s3.shiftDuration(5000);

        System.out.println("Total Seconds = " + total3);
        System.out.println(s3);
    }
}