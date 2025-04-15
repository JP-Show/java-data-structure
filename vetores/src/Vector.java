package vetores.src;

public class Vector {
    private String[] elements;
    private int size;

    public Vector(int size){
        this.elements = new String[size];
        this.size = 0;
    }

    public void add(String element){

        increasesCapacity();
        if(this.size < this.elements.length){
            this.elements[this.size++] = element;
        }else 
            throw new RuntimeException("Vector is full, can't add more elements");
    }

    public boolean add(int index, String element){
        indexValidation(index);
        
        increasesCapacity();
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = this.elements[i];
        }
        elements[index] = element;
        size++;
        return true;
    }

    public String fetch(int index){
        indexValidation(index);
        return elements[index];
    }

    //sequencial search
    public int fetch(String element){
        for (int i = 0; i < size; i++) {
            if(this.elements[i].equals(element))
                return i;
        }
        return -1;
    }

    public void remove(int index){
        indexValidation(index);
        for (int i = index; i < size; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
    }

    public int getSize(){
        return size;
    }

    private void indexValidation(int index){
        if (!(index >= 0 && index < size)) 
            throw new IllegalArgumentException("Invalid index: " + index + 
                " max size: " + size);
    }

    private void increasesCapacity(){
        if(this.size == this.elements.length){
            String[] newElements = new String[this.elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }
            this.elements = newElements;
        }
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size - 1; i++) {
            sb.append(elements[i]+", ");
        }
        if(size > 0)
            sb.append(elements[size - 1]);
        sb.append("]");

        return sb.toString();
    }
}
