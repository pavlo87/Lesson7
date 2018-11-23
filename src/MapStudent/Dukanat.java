package MapStudent;
import MapStudent.Student;

import java.util.*;

public class Dukanat {
    public static void main(String[] args) {
        List<Integer> st1 = Arrays.asList(10,11,7);
        List<Integer> st2 = Arrays.asList(8,5,4);
        List<Integer> st3 = Arrays.asList(5,6,7);
        Map<Object,List<Integer>> dukanat= new HashMap<>();
        dukanat.put(new Student("Sonja",22),st1);
        dukanat.put(new Student("Pavlo",21),st3);
        dukanat.put(new Student("Luba",23),st2);
       System.out.println(dukanat);
    }
}
