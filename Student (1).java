package CIE;
import java.util.*;
 public class Student{
 public  String usn;
 public    String name;
 public   int sem;Scanner sc=new Scanner(System.in);
 public void getdata(){
    System.out.println("Enter your USN:");usn=sc.next();
    System.out.println("Enter your Name:");name=sc.next();
    System.out.println("Enter the Semister:");sem=sc.nextInt();
}
}