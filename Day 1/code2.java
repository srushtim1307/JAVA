import java.util.Scanner;

class code2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        double marks = sc.nextDouble();
        char grade = sc.next().charAt(0);
        System.out.println("Age: " +age);
        System.out.println("Marks: " +marks);
        System.out.println("Grade: " +grade);
    }
}