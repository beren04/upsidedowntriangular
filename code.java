package first;

import java.util.Scanner;

public class upsidedowntriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a row number for triangular:");
        int row = input.nextInt();


        for(int i=1;i<=row;i++){
            for(int n=1;n<=i;n++) {
                System.out.print(" ");
            }
            for(int k=1;k<=(2*row -(2*i-1));k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
