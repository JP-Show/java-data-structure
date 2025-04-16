package vetores.src.teste;

import vetores.src.VectorGeneric;

public class Exer02 { 
    public static void main(String[] args) {
        VectorGeneric<String> vector = new VectorGeneric(5);
        vector.add("Hello");
        vector.add("World!");
        vector.add("Hi");
        vector.add("Sup!");
        vector.add("Hi");
    
        System.out.println(vector.lastIndexOf("World!"));
    }
}
