import robot.Robot;

public class Main {
    public static void main(String[] args) {
        Robot anonymous = new Robot();
        Robot one = new Robot("Bib", "RX23");
        Robot two = new Robot("Bob", "Rx23", 30);
        System.out.println(anonymous);
        System.out.println(one);
        System.out.println(two);
    }
}