import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int n;
        n = input.nextInt();
        for (int i = 1; i <= n; i++){
            for (int k = 1; k <= (n - i); k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i) -1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 0; i<= n-1; i++){

            for (int j = 0; j <= (i-1); j++){
                System.out.print(" ");
            }
            for (int k = 1; k<= (2* (n-i)-1); k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

        }
    }




