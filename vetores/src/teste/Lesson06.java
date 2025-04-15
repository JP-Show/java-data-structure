package vetores.src.teste;

import vetores.src.Vector;

public class Lesson06 {
    public static void main(String[] args) {
        Vector vector = new Vector(10);
    
        vector.add("B");
        vector.add("C");
        vector.add("D");
        vector.add("F");
        
        System.out.println(vector);

        vector.add(0, "A");
        System.out.println(vector);

        vector.add(4, "E");
        System.out.println(vector);

        vector.add(6, "G");
        System.out.println(vector);
    }
}
