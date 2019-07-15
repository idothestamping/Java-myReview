package ArrayList;

import java.util.ArrayList;

public class GetSumValue {
    public static int getSumValue (ArrayList<Integer> arr) {
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        double result;
        ArrayList<Integer> test = new ArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);
        test.add(5);

        System.out.println(getSumValue(test));
    }
}