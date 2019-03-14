public class Hangar {

    public static void main(String[] args) {

        Boat yoacht = new Boat ("yoacht");

        System.out.println("je suis " + yoacht.getBrand() + yoacht.doStuff());

        Car bugatti = new Car ("bugatti");

        System.out.println("je suis " + bugatti.getBrand() + bugatti.doStuff());
    }
}