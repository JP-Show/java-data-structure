package vetores.src.teste;

import vetores.src.VectorGeneric;

public class Lesson09 {
        public static void main(String[] args) {
        VectorGeneric<String> vector = new VectorGeneric(5);
        vector.add("Hello");
        vector.add("World!");
    
        vector.remove(0);
        System.out.println(vector);
    }    
}
