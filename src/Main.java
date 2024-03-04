//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user = new User();
        User user1 = new User();
        user1.setName("Carlo");
        user1.setAge(80);

        user.printInfo();
        user1.printInfo();
    }
}