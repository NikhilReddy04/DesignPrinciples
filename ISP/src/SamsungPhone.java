import java.time.LocalTime;

public class SamsungPhone implements Phone,SmartPhone{

    @Override
    public void showTime() {
        LocalTime time=LocalTime.now();
        System.out.println("Showing Time:"+time);
    }

    @Override
    public void answerCall() {
        System.out.println("Answering Call....");
    }

    @Override
    public void record4kVideo() {
        System.out.println("Recoding Video");
    }
}
