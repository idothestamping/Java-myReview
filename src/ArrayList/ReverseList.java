package ArrayList;

import java.util.ArrayList;

public class ReverseList {
    public ArrayList<Integer> reverseList (ArrayList<Integer> arr) {
       ArrayList<Integer> value = new ArrayList();

       System.out.println(arr.size());
        for(int i=0; i < arr.size(); i++){
            System.out.println("I'm in the for-loop");
            System.out.println("Array size = " + arr.size());
            System.out.println("i = " + i);
            value.add(arr.get(arr.size() - 1) - i);
        }
        return value;
    }

    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList();
        result.add(8);
        result.add(9);
        result.add(10);
        Object potato = new ReverseList();
        result = ((ReverseList) potato).reverseList(result);
        System.out.println(result);
    }
}