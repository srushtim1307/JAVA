class Student{
    String name;
    int marks;

    void checkResult(){
        if(marks>=40){
            System.out.println(name + "Passed");
        }
        else{
            System.out.println(name + "Failed");
        }
    }
}

public class Practice4 {

    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Srushti";
        s1.marks = 95;
        s1.checkResult();

        System.out.println();
        Student s2 = new Student();
        s2.name = "Shravani";
        s2.marks = 35;
        s2.checkResult();
    }
    
}
