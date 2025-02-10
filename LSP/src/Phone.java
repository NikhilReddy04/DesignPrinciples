import java.time.LocalTime;

public class Phone {
    public void answerCall(){
        System.out.println("Answering the call.....");
    }

    public void showTime(){
        LocalTime time=LocalTime.now();
        System.out.println("Showing time:"+time);
    }

    public void openCalculator(){
        System.out.println("Opening calculator");
    }
}
