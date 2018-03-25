package array;

import java.util.Scanner;

public class UseArray {

    public static void main(String[] args) {

        int limit = 10;
        int  stId [] = new int [limit];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter some intger number: ");
        for(int i=0;i<stId.length;i++){
            stId[i] = sc.nextInt();
        }
        for(int j=0;j<stId.length;j++){
            System.out.println(stId[j]);
        }
//        stId[0] = 101;
//        stId[2] = 103;

        System.out.println(stId[0]);
        System.out.println(stId[2]);


        int workID [] = {12, 13, 15};
        System.out.println(workID[0]);

    }
}
