package recursion;

import java.util.Scanner;

public class RecQue {
    public static void main(String[] args) {
        System.out.println("Enter any no: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        OneToN(n);
        NtoOne(n);
    }

    // 1 to N numbers

    static void OneToN(int n){
        if(n==0)
            return;
        OneToN(n-1);
        System.out.println(n);
    }

    //n to 1 numbers

    static void NtoOne(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        NtoOne(n-1);
    }
}

