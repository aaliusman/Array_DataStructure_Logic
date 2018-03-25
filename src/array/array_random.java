package array;

import java.util.Scanner;
import java.util.Random;

public class array_random {
    public static void main(String[] args) {

        int limit = 5;
        int  stId [] = new int [limit];
        Random random = new Random();

        for(int i=0;i<stId.length;i++){
            stId[i] = random.nextInt(76);
        }
        for(int j=0;j<stId.length;j++){
            System.out.println(stId[j]);
        }
    }
}
