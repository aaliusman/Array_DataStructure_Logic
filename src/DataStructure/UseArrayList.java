package DataStructure;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UseArrayList {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<Integer>();

        Random random = new Random();
        int limit = 20;
        for (int i=0;i<limit;i++){
            numberList.add(random.nextInt(50));
        }
        for (int j=0;j<numberList.size(); j++)
        System.out.println(numberList.get(j));

//        numberList.add(9);
//        numberList.add(12);
//        System.out.println(numberList.get(0));
    }
}
