package bad.robot.refactoring.chapter1;

public class MyMain {

    public static void main(String[] args) {
        Customer myCustomer = new Customer("BigCo");
        System.out.println(myCustomer.statement());
    }
}
