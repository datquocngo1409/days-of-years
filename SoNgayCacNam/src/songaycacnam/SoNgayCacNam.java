package songaycacnam;

import java.util.Scanner;

public class SoNgayCacNam {

    static boolean isLeapYear(int year){
        boolean isLeapYear = false;

        boolean isDivisibleBy4 = year % 4 == 0;
        if(isDivisibleBy4){
        boolean isDivisibleBy100 = year % 100 == 0;
        if(isDivisibleBy100){
            boolean isDivisibleBy400 = year % 400 == 0;
            if(isDivisibleBy400){
                isLeapYear = true;
            }
        } else {
            isLeapYear = true;
            }
        }
        return isLeapYear;        
    }
    
    public static int sumDay(int start, int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            if(isLeapYear(i)) sum += 366;
            else sum+=365;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int yearStart,yearEnd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start: ");
        yearStart=sc.nextInt();
        System.out.println("Enter the end: ");
        yearEnd=sc.nextInt();
        System.out.println("The day is: "+sumDay(yearStart, yearEnd));
    }
    
}
