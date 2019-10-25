/**
 * List of my linkedlists.
 */
class MyLinkedList {

    /**
     * Constructs an empty list with size initialized to zero.
     */
    Node head;
    Node tail;
    int size;
    public MyLinkedList() {
        this.size=0;
    }
    /**
     * Appends the specified element to the end of this list.
     *
     * @param      data  The data
     */
    public void add(String data){
        Node node = new Node(data);
        if(head==null){
        head=node;
        tail=node;
        this.size++;
        } else{
            this.tail.nextNode=node;
            this.tail=node;
            this.size++;
            // Node temp=head;
            // while(temp.nextNode!=null){
            //     temp=temp.nextNode;
            // }

        }
    }
    /**
     * Inserts the specified element at the beginning of this list.
     *
     * @param      data  The data
     */
    public void addFirst(String data){
    
    Node node=new Node(data);
    Node temp=head;
    this.head=node;
    head.nextNode=temp;
    this.size++;
    }
    /**
     * Removes all of the elements from this list.
     */
    public void clear() {
        this.size=0;
        this.head=null;
        this.tail=null;
    }
    /**
     * Returns true if this list contains the specified element.
     *
     * @param      data  The data
     *
     * @return     { description_of_the_return_value }
     */
    public boolean contains(String data) {
        
         Node temp=head;
             while(temp.nextNode!=null){
                 if(temp.value.equals(data)){
                     return true;
                 }
                 temp=temp.nextNode;
             }
        
        return false;
     }
    /**
     * Returns the element at the specified position in this list.
     *
     * @param      index  The index
     *
     * @return     { description_of_the_return_value }
     */
    public String get(int index){ 
    
        if(index>=0 && index <size){
        int pos=0;
        Node temp=head;
        while(temp.nextNode!=null && pos!=index){
            pos++;
            temp=temp.nextNode;
        }
        return temp.value;
        }

        return null; 
    }

    /**
     * Returns the first element in this list.
     *
     * @return     The first.
     */
    public String getFirst() { 
        if(size==0){
            return null;
        }
        
        return this.head.value; }
    /**
     * Returns the last element in this list.
     *
     * @return     The last.
     */
    public String getLast() {
        if(size==0){
            return null;
        } 
        return this.tail.value; 
    }
    /**
     * Retrieves and removes the head (first element) of this list.
     *
     * @return     { description_of_the_return_value }
     */
    public String remove() { 
        if(size==0){
            return "LinkedList is empty";
        }
        Node temp=this.head;
        this.head=this.head.nextNode;
        this.size--;
        return temp.value; }
    /**
     * Removes and returns the last element from this list.
     *
     * @return     { description_of_the_return_value }
     */
    public String removeLast() { 
        if(size==0){
            return "LinkedList is empty";
        }
        Node temp=head;
        while(temp.nextNode!=this.tail){
            temp=temp.nextNode;
        }
        String toReturn=tail.value;
        this.tail=temp;
        this.tail.nextNode=null;
        this.size--;
        return toReturn; }
    /**
     * Returns the number of elements in this list.
     *
     * @return     { description_of_the_return_value }
     */
    public int size() { 
        return this.size; }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() { 
        if(size==0){
            return "LinkedList is empty";
        }
            String toReturn="";
            Node temp=head;
            while(temp.nextNode!=null){
                toReturn+="["+temp.value+"]";
                temp=temp.nextNode;
            }
            toReturn+="["+temp.value+"]";
        return toReturn;
     }
}
