package conditionalStatment;
import java.util.*;

public class condStatment {
    public static void main(String args[]){
        // If Else & Else If
        // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        
        // if(age > 18){
        //     System.out.println("adult");
        // }else{
        //     System.out.println("teenager");
        // }
       
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        
        // if(num % 2 == 0){
        //     System.out.println("Even Number");
        // }else{
        //     System.out.println("odd Number");
        // }
       
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        
        // if(a == b){
        //     System.out.println("a equal to b");
        // }else if(a > b){
        //     System.out.println("a greater than b");
        // }else if(a < b){
        //     System.out.println("a less than b");
        // }
       
        // Scanner sc = new Scanner(System.in);
        // int button = sc.nextInt();
        
        // if(button == 1){
        //     System.out.println("Hello");
        // }else if(button == 2){
        //     System.out.println("Assalam o Alikum");
        // }else if(button == 2){
        //     System.out.println("bonjour");
        // }else{
        //     System.out.println("invalid button");

        // }

        // Switch Statment

        // Scanner sc = new Scanner(System.in);
        // int button = sc.nextInt();

        // switch (button) {
        //     case 1:
        //         System.out.println("hellow");
        //         break;
        //     case 2:
        //         System.out.println("Assalam o Alikum");
        //         break;
        //     case 3:
        //         System.out.println("bonjour");
        //         break;
        //     default:
        //     System.out.println("Invalid Button");
        // }

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
            System.out.println("Invalid Month");
        }

    }

}
