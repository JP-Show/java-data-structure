package vetores.src.teste;

import vetores.src.Vector;

public class Lesson05 {
    public static void main(String[] args) {
        Vector vector = new Vector(5);
    
        vector.add("Hello");
        vector.add("World!");
        
        System.out.println(vector.fetch("World!"));
        System.out.println(vector.fetch("Hi"));
    }
}
