public class timeEntity {
    private int hours;
    private int min;
    private int seconds;

    public int getHours(){
        return hours;
    }
    public int getMins(){
        return min;
    }
    public int getSeconds(){
        return seconds;
    }

    public void setHours(int hours){
        this.hours=hours;
    }
    public void setMins(int min){
        this.min=min;
    }
    public void setSeconds(int seconds){
        this.seconds=seconds;
    }

    public void whatTime(int no_of_seconds_till_noon){
        this.hours=no_of_seconds_till_noon/3600;
        int remaining=no_of_seconds_till_noon%3600;
        this.min=remaining/60;
        this.seconds=remaining%60;
    }
    public void displayTime(){
        System.out.println("time till noon is : " +hours+":" +min+":"+ seconds+" AM");
    }

    public static void main (String[]args){
        timeEntity t=new timeEntity();
        t.whatTime(2300);
        t.displayTime();

    }
}
