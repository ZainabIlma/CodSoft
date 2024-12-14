import java.util.*;
public class StudentGradeCalculator  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total=0;
        double percentage;
        char grade;
        System.out.println("Grade Calculator");  
        System.out.println("Enter your marks below:");
        System.out.println("English:") ; 
        int eng=sc.nextInt();
        System.out.println("Maths:") ;
        int maths=sc.nextInt();
        System.out.println("Science:") ;
        int sci=sc.nextInt();
        System.out.println("Computer Science:") ;
        int comp=sc.nextInt();
        System.out.println("S.S.T:") ;
        int sst=sc.nextInt();
        total = eng + maths + sci + comp + sst ;
        percentage = (total / 500.0) * 100 ;
        if(percentage<30)
        grade='F';
        else if(percentage<50)
        grade='D';
        else if( percentage<65)
        grade='C';
        else if(percentage<80)
        grade='B';
        else
        grade='A';
        System.out.println("Total marks:"+total);
        System.out.println("Percentage: "+percentage);
        System.out.println("Grade: "+grade);
        sc.close();

    }
}
