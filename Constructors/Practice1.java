
class Student{
    String name;
    int age;

    Student(String n, int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class Practice1 {
    public static void main(String[] args) {
        Student s1 = new Student("Srushti", 19);

        Student s2 = new Student("Shravani", 15);
        s1.display();
        s2.display();
    }
}
