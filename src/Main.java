import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int enteredNumber, count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Girilen Sayıya Kadar Olan 2'nin Kuvvetini Bulma");
        System.out.print("Bir Sayı Girin : ");
        enteredNumber = scanner.nextInt();

        /**
         * 2'nin Kuvvetleri
         */
        for(int i = 1; i <= enteredNumber; i *= 2){
            System.out.println("2 üzeri " + count++ + " => " + i);
        }
        System.out.println("****************************");
        count = 0;
        /**
         * 4'ün kuvvetleri
         */
        int j = 1;
        while(j <= enteredNumber){
            System.out.println("4 üzeri " + count++ + " => " + j);
            j *= 4;
        }

        System.out.println("**************************");
        count = 0;
        /**
         * 5'in Kuvvetleri
         */
        int z = 1;
        while(z <= enteredNumber){
            System.out.println("5 üzeri " + count++ + " => " + z);
            z *= 5;
        }



    }
}
