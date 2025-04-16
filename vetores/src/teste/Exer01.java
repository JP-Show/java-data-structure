package vetores.src.teste;

import vetores.src.VectorGeneric;

public class Exer01 { 
    public static void main(String[] args) {
        VectorGeneric<String> vector = new VectorGeneric(5);
        vector.add("Hello");
        vector.add("World!");
    
        System.out.println(vector.contains(null));
    }
}
