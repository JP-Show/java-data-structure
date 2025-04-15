package vetores.src.teste;

import vetores.src.Vector;

public class Lesson04 {
    public static void main(String[] args) {
        Vector vector = new Vector(5);
    
        vector.add("Hello");
        vector.add("World!");
        
        System.out.println(vector.fetch(0));
        System.out.println(vector.fetch(3));
    }
}
