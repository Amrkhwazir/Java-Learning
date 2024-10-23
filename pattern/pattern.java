package pattern;

public class pattern {

    public static void main(String args[]){
        // Q1

        // for(int i = 1; i <= 4; i++){            
        //     for(int j = 1; j <= 5; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Q2

        // int n = 4;
        // int m = 5;
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=m; j++){
        //         if(i == 1 || j == 1 || i == n || j == m){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Q3

        // int n = 4;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= i; j++ ){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Q4

    //     int n = 4;
    //     for(int i = n; i >= 1; i--){
    //         for(int j = 1; j <= i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    // }

        // Q5

    //     int n = 4;
    //     for(int i = 1; i <= n; i++){
    //         for(int j = 1; j <= n-i; j++){
    //             System.out.print(" ");
    //         }
    //         for(int k = 1; k <= i; k++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    // }

        // Q6

    //     int n = 5;
    //     for(int i = 1; i <= n; i++){
    //         for(int k = 1; k <= i; k++){
    //             System.out.print(k);
    //         }
    //         System.out.println();
    // }


        // Q7

    //     int n = 5;
    //     for(int i = n; i >= 1; i--){
    //         for(int k = 1; k <= i; k++){
    //             System.out.print(k+" ");
    //         }
    //         System.out.println();
    // }

        // Q8

    //     int n = 5;
    //     int number = 1;

    //     for(int i = 1; i <= n; i++){
    //         for(int k = 1; k <= i; k++){
    //             System.out.print(number+","+" ");
    //             number++;
    //         }
    //         System.out.println();
    // }

        // Q9

        int n = 5;
        

        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= i; k++){
                int sum = i+k;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
    }
}
}
