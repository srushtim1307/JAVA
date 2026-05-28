class Student{

    private int age;
    void setAge(int a){
        age = a;
    }
    int getAge(){
        return age;
    }
}

public class Practice1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setAge(19);
        System.out.println(s1.getAge());
    }   
}
