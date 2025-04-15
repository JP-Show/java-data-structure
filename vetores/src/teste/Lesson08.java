package vetores.src.teste;

import vetores.src.Vector;

public class Lesson08 {
    public static void main(String[] args) {
        Vector vector = new Vector(5);
    
        vector.add("Hello");
        vector.add("World!");
    
        vector.remove(0);
        System.out.println(vector);
    }    
}
