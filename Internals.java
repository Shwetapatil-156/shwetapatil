package CIE;
import java.util.*;
public class Internals extends Student{
    public int[] marksCIE=new int[5];
    Scanner sc=new Scanner(System.in);
    public void getcie(){
        super.getdata();System.out.println("enter marks in Internal:");
        for(int i=0;i<5;i++)
        marksCIE[i]=sc.nextInt();
    }

}