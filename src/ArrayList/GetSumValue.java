package ArrayList;

import java.util.ArrayList;

public class GetSumValue {
    public Integer getSumValue (ArrayList<Integer> arr) {
        int value = 0;

        for(int i=1; i < arr.size(); i++){
            if(value < arr.get(i)) {
                value = value + arr.get(i);
            }
        }
        return value;
    }

    public static void main(String[] args) {
        int result;
        ArrayList<Integer> test = new ArrayList<>();
        test.add(8);
        test.add(9);
        test.add(10);
        Object potato = new GetSumValue();
        result = ((GetSumValue) potato).getSumValue(test);
        System.out.println(result);
    }
}