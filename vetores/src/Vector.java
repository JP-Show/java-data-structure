package vetores.src;

public class Vector {
    private String[] elements;
    private int size;

    public Vector(int size){
        this.elements = new String[size];
        this.size = 0;
    }
    
    public void add(String element){
        if(this.size < this.elements.length){
            this.elements[this.size++] = element;
        }else 
            throw new RuntimeException("Vector is full, can't add more elements");
    }
}
