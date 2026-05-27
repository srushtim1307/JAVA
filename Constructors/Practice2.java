
class Student{
    String name;
    int age;

    Student(String n, int a){
        name = n;
        age = a;
    }
    Student(Student s){
        name = s.name;
        age = s.age;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Student s1 = new Student("Srushti", 19);
        s1.display();
        Student s2 = new Student(s1);
        s2.display();

    }
}
