/**
 * 
 */

public class List extends AbstractList {
    
    List() {
        super();
    }
    List(int capacity) {
        super(capacity);
    }
    public void add(int item) {
        this.list[size] = item;
        size++;
        if(size == capacity) {
            resize();
        }
    }

    
    public int indexOf(int item) {
        for (int i = 0; i < size; i++) {
            if (list[i] == item) {
                return i;
            }
        }
        return -1;
    }

}