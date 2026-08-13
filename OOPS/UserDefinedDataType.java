import java.util.Scanner;

public class UserDefinedDataType { 
    public static class Student{//yha class bna rhe hai 
        String name;             // class is blueprint 
        int rno;
        double cgpa;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//scanner bhi class hai aur sc ek object hai 
        Student s1= new Student();// yha declaration hua h
        s1.name = "rohit"; //s1 object h yha -  object is real life entity
        s1.rno = 51;
        s1.cgpa = 7.3;

        Student s2= new Student();// yha declaration hua h
        s2.name = "Aman";
        s2.rno = sc.nextInt();
        s2.cgpa = 7.2;

        Student s3= new Student();// yha declaration hua h
        s3.name = "Harshit";
        s3.rno = 35;
        s3.cgpa = 9.2;

        System.out.println(s1.name+" "+s1.cgpa+" "+s1.rno );
        s3.rno = 33;//yeshe koe value change bhi kar skte hai 
        System.out.println(s2.rno);
       sc.close();

    }
    
}
