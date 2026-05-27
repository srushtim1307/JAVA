class Student{
    String name;
    static String college = "VIT";

    void display(){
        System.out.println(name);
        System.out.println(college);
    }
}
public class Practice1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Srushti";
        s2.name = "Shravani";
        s1.display();
        s2.display();
    }    
}
