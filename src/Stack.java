/*
Cooper Jonathan Eisman
Date Created: 10/27/2020
Date Modified: 10/27/2020
Creates a Stack of StackNode type object
*/


public class Stack {

    private int length; //height of the stack
    private StackNode topNode; //the Node at the top of the stack
    private StackNode bottomNode; //The Node at the bottom of the stack\

    public Stack() {    //Empty Constructor.
        length = 0;
        topNode = null;
        bottomNode = null;
    }
    public Stack(StackNode bottomNode) {    //Constructor for a single node
        length = 1;
        topNode = bottomNode;
        bottomNode = bottomNode;
    }
    public Stack() {    //Constructor for more than 1 node.
        length = 0;
        topNode = null;
        bottomNode = null;
    }


    void push(E element)   {}  //add an element
    E pop()    {}             //remove and return the top element
    boolean isEmpty() {}
    int size() {}
    E peek()     {}           //look at the top element without removing
}
