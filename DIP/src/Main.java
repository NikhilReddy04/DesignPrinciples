//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserManager u1=new UserManager(new EmailService());
        u1.notifyUser("Hello user");
    }
}