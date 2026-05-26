

class Car {
    String brand;
    String color;
    int speed;

    void display(){
        System.out.println("Brand : " +brand);
        System.out.println("Color : " +color);
        System.out.println("Speed : " +speed);
    }
}

public class Practice2{
    public static void main(String[] args){
        Car c1 = new Car();
        c1.brand = "BMW";
        c1.color = "Black";
        c1.speed = 200;

        c1.display();
    }

}
