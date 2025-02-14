//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Phone phoneObj=new Phone();
        phoneObj.openCalculator();
        phoneObj.answerCall();
        phoneObj.showTime();

        System.out.println();
        SmartPhone smartPhoneObj=new SmartPhone();
        smartPhoneObj.openCalculator();
        smartPhoneObj.answerCall();
        smartPhoneObj.showTime();


        //Calculator is extending phone
        //Calculator can only perform calculate method
        Calculator calcObj=new Calculator();
        calcObj.answerCall();
    }
}