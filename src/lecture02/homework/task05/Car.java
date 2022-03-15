package lecture02.homework.task05;

public class Car {
    static int speed;
    String color;
    static int count;

    static {
        speed = 220;
    }
    public static void main(String[] args) {
        Car orangeCar = new Car();
        //orangeCar.speed = 150;
        orangeCar.color = "Orange";
        count++;

        Car blueCar = new Car();
        //blueCar.speed = 100;
        blueCar.color = "Blue";
        count++;

        System.out.println(orangeCar.color + " car, speed: " + Car.speed + " km/h");
        System.out.println(blueCar.color + " car, speed: " + Car.speed + " km/h");
        System.out.println("Количество машин: " + count + " шт.");

    }
}
