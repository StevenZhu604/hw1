package DataStructures;

public class Link {
    
    public Link next;
    public int value;

    public Link(int value, Link next) {
        // Initialize class attributes

        next=next;
        value=value;
    }

    public Link(int value) {
        // Shortcut to create a new Link with next set to null.
        // Remember to reuse code whenever possible (rather than copy pasting)!

        next=null;
        value=value;
    }
}