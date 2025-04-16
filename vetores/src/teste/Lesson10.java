package vetores.src.teste;

import java.util.Arrays;
import java.util.List;

public class Lesson10 {
        public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        
        int[] a = list.stream().mapToInt(Integer::intValue).toArray();

        for (int i : a) {
            System.out.println(i);
        }
    }    
}