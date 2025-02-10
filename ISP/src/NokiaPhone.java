import java.time.LocalTime;

public class NokiaPhone implements Phone{
    @Override
    public void showTime() {
        LocalTime time=LocalTime.now();
        System.out.println("Showing Time:"+time);
    }

    @Override
    public void answerCall() {
        System.out.println("Answering Call");
    }


}
