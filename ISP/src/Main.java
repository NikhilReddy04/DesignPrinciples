//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NokiaPhone nokiaPhone=new NokiaPhone();
        SamsungPhone samsungPhone=new SamsungPhone();

        samsungPhone.record4kVideo();
        //nokiaPhone.record4kVideo();
        nokiaPhone.showTime();
    }
}