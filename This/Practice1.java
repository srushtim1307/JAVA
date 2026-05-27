
class Car{
    String brand;
    String color;
    int speed;

    Car(String brand, String color, int speed){
        this.brand= brand;
        this.color= color;
        this.speed= speed;
    }
    void display(){
        System.out.println(this.brand);
        System.out.println(this.color);
        System.out.println(this.speed);
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Car c1 = new Car("BMW","Black", 220);
        c1.display();
        Car c2 = new Car("Audi","White", 200);
        c2.display();
    }
    
}
