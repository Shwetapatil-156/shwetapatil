import CIE.*;
import java.util.*;
import SEE.*;
class demo{
    public static void main(String[] args)
    {
        int n;Scanner sc=new Scanner(System.in);
         System.out.println("Enter number of students:");
         n=sc.nextInt();
        Student[] stud=new Student[n];
        Internals[] im=new  Internals[n];
        int total[][]=new int[n][5];
        scores[] scr=new scores[n];int temp=0;
        for (int i=0;i<n;i++){
        im[i]=new Internals();
         scr[i]=new scores();
    }
       for(int j=0;j<n;j++)
       {
        im[j].getcie();
        scr[j].getsee();
        for (int i=0;i<5;i++){
        total[j][i]=im[j].marksCIE[i]+scr[j].marksee[i];
        System.out.println("marks in subject "+(i+1)+" by "+im[j].name+" is "+total[j][i]);
         }
        for (int i=0;i<5;i++)
        temp=temp+total[j][i];
        System.out.println("total marks by "+im[j].name+" is "+temp);temp=0;
       }
    
    }
}