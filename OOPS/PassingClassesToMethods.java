

public class PassingClassesToMethods {

    public static class Car {
        int seats;
        String name;
        double length;
        String type;
        int torque;
        void print(){
            System.out.println(seats+" "+name+" "+length+"m "+type+" "+torque);
        }
    }

    public static void main(String[] args) {
        Car c = new Car();

        c.length = 4;
        c.name = "kia";
        c.seats = 4;
        c.torque = 30;
        c.type = "Sedan";

        change(c);

        System.out.println(c.seats);
        c.print();
    }

    private static void change(Car c) {
        c.seats = 10;
    }
}