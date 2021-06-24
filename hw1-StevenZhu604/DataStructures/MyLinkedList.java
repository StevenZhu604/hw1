package DataStructures;

/**
    Your custom implementation of a singly linked list.

    Linked lists are composed of a bunch of individual Links, each containing a single value.
    Each Link must hold a `next` object, which is a type Link or `null` if at the end of the list.

    Linked lists have the following runtime characteristics:
    - Add: O(1) 
    - Get/Set/Contains: O(N)
    - Remove: O(N)
    - GetSize: O(1)

    Don't forget to fill out Link.java!
*/
public class MyLinkedList {

    private Link sentinel;
    private Link first;
    private Link second;
    private Link third;
    private Link forth;
    private Link fifth;
    private Link sixth;
    private Link seventh;
    private Link eighth;
    private Link ninth;
    private Link tenth;
    private int size;

    // Create an empty sentinel node.
    // The value of the sentinel node is insignificant (so choose whatever you want).
    // Remember to set size and last!
    public MyLinkedList() {
        sentinel=new Link(0, first);
        first=new Link(0,second);
        second=new Link(0,third);
        third=new Link(0,forth);
        forth=new Link(0,fifth);
        fifth=new Link(0,sixth);
        sixth=new Link(0,seventh);
        seventh=new Link(0,eighth);
        eighth=new Link(0,ninth);
        ninth=new Link(0,tenth);
        tenth=new Link(0);
        size=0;
    }
    
    public MyLinkedList(Link lnk) {
        // Initialize a linked list starting with the given lnk.
        // You can assume that the inputted link is NOT circular.
        this();
        sentinel=new Link(0, first);
        first=new Link(lnk.value,second);
        second=new Link(0,third);
        third=new Link(0,forth);
        forth=new Link(0,fifth);
        fifth=new Link(0,sixth);
        sixth=new Link(0,seventh);
        seventh=new Link(0,eighth);
        eighth=new Link(0,ninth);
        ninth=new Link(0,tenth);
        tenth=new Link(0);
        size=1;
    }

    /**
     * Appends the value to the end of the list.
     */
    public void add(int value) {
        if (size==0){
            first.value=value;
            size++;
        } else if (size==1){
            second.value=value;
            size++;
        } else if (size==2){
            third.value=value;
            size++;
        } else if (size==3){
            forth.value=value;
            size++;
        } else if (size==4){
            fifth.value=value;
            size++;
        } else if (size==5){
            sixth.value=value;
            size++;
        } else if (size==6){
            seventh.value=value;
            size++;
        } else if (size==7){
            eighth.value=value;
            size++;
        } else if (size==8){
            ninth.value=value;
            size++;
        } else if (size==9){
            tenth.value=value;
            size++;
        }
    }

    /**
     * Returns the last link in the list in O(1) time, or
     * null if the list is empty.
     */
    public Link getLast() {
        if (size==0){
            return null;
        } else if (size==1){
            return first;
        }  else if (size==2){
            return second;
        } else if (size==3){
            return third;
        } else if (size==4){
            return forth;
        } else if (size==5){
            return fifth;
        } else if (size==6){
            return sixth;
        } else if (size==7){
            return seventh;
        } else if (size==8){
            return eighth;
        } else if (size==9){
            return ninth;
        } else {
            return tenth;
        }
    }

    /**
     * Returns the first link in the list in O(1) time,
     * or null if the list is empty.
     */
    public Link getFirst() {
        if (size==0){
            return null;
        } else {
            return first;
        }
    }

    /* 
     * Returns the Integer at the given index.
     * Throw an IllegalArgumentException if index is out of bounds.
     */
    public int get(int index) {
        if (index>=0&&index<size){
            if (index==0){
                return first.value;
            } else if (index==1){
                return second.value;
            } else if (index==2){
                return third.value;
            } else if (index==3){
                return forth.value;
            } else if (index==4){
                return fifth.value;
            } else if (index==5){
                return sixth.value;
            } else if (index==6){
                return seventh.value;
            } else if (index==7){
                return eighth.value;
            } else if (index==8){
                return ninth.value;
            } else{
                return tenth.value;
            }
        } else {
            throw new IllegalArgumentException("Index out of bounds");
        }
    }

    /**
     * Sets the value at the given index and returns whether it was successful or not 
     */
    public boolean set(int index, int value) {
        if (index >= size || index < 0) {
            return false;
        }
        if (index==0){
            first.value=value;
            return true;
        } else if (index==1){
            second.value=value;
            return true;
        }  else if (index==2){
            third.value=value;
            return true;
        } else if (index==3){
            forth.value=value;
            return true;
        } else if (index==4){
            fifth.value=value;
            return true;
        } else if (index==5){
            sixth.value=value;
            return true;
        } else if (index==6){
            seventh.value=value;
            return true;
        } else if (index==7){
            eighth.value=value;
            return true;
        } else if (index==8){
            ninth.value=value;
            return true;
        } else {
            tenth.value=value;
            return true;
        }
    }

    /** Returns size of the Array */
    public int getSize() {
        return size;
    }

    /**
     * Removes the value at the given index and returns the removed value.
     * Throw an IllegalArgumentException if index is out of bounds.
     */
    public int remove(int index) {
        if (index >= size || index < 0) {
            throw new IllegalArgumentException();
        } else {
            int result=this.get(index);
            for (int x=index; x<size-1; x++){
                this.set(index, this.get(index+1));
            }
            size--;
            return result;
        }
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MyLinkedList)) {
            return false;
        }
        MyLinkedList otherLst = (MyLinkedList)other;
        if (getSize() != otherLst.getSize()) {
            return false;
        }
        Link curr = getFirst();
        Link oCurr = otherLst.getFirst();
        for (int i = 0; i < getSize(); i++) {
            if (curr.value != oCurr.value) {
                return false;
            }
            curr = curr.next;
            oCurr = oCurr.next;
        }
        return true;
    }
}