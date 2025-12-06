public class time3 {
    public int hours;
    public int mins;
    public int seconds;

    public void whatTime(int no_of_seconds_till_noon) {
        this.hours = no_of_seconds_till_noon / 3600;
        int remaining = no_of_seconds_till_noon % 3600;
        this.mins = remaining / 60;
        this.seconds = remaining % 60;
    }
    public String displayTime(){
        return hours+":" +mins+":"+ seconds;
    }

    public int toSeconds(){
        return hours*3600+mins*60+seconds;
    }
    public int diffInTime(int one,int two){
        return Math.abs(one-two);
    }
    public void timeAfter12(int totalSec){
        whatTime(totalSec);
    }

    public static void main(String[]args){
        time3 time_one=new time3();
        time_one.whatTime(3500);
        System.out.println("time one : "+time_one.displayTime());
        time3 time_two=new time3();
        time_two.whatTime(7800);
        System.out.println("time two : "+time_two.displayTime());

        int a=time_one.toSeconds();
        int b=time_two.toSeconds();
        int c= time_one.diffInTime(a,b);
        System.out.println("difference between time 1 and time 2 in seconds is : "+c);
        time3 diff=new time3();
        diff.whatTime(c);
        System.out.println("Difference in time 1 and time 2 is : "+diff.displayTime());


    }
}
