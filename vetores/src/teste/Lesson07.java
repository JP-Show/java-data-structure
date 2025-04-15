package vetores.src.teste;

import vetores.src.Vector;

public class Lesson07 {
    public static void main(String[] args) {
        Vector vector = new Vector(2);
        vector.add("A");
        vector.add("B");
        vector.add("C");
        vector.add("D");
        vector.add("E");
        vector.add("F");
        vector.add(0,"6");
        vector.add(0,"5");
        vector.add(0,"4");
        vector.add(0,"3");
        vector.add(0,"2");
        vector.add(0,"1");
        vector.add(0,"0");
        System.out.println(vector);
    }
}
