import java.util.*;

public class gradeCalculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Subject Marks");
        int a = sc.nextInt();
        System.out.println("Enter Second Subject marks");
        int b = sc.nextInt();
        System.out.println("Enter Third Subject Marks");
        int c = sc.nextInt();
        System.out.println("Enter Fourth Subject Marks");
        int d = sc.nextInt();
        System.out.println("Enter Fifth Subject Marks");
        int e = sc.nextInt();
        int avg=(a+b+c+d+e)/5;
        System.out.println("Average of subjects is "+avg);
        if(avg>90){
            System.out.println("Grade A");
        }
        else if (avg>=80&&avg<90){
            System.out.println("Grade B");

        }
        else if (avg>=70&&avg<80){
            System.out.println("Grade C");

        }
        else if(avg>=60&&avg<70){
            System.out.println("Grade D");
        }
        else if (avg>=50&&avg<60){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Grade F");
        }

    }
}
