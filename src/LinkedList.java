

import java.util.NoSuchElementException;

public class LinkedList {

    private class Node {
        private int value;
        private Node next; 

        Node(int value)
        {
            this.value = value;
        }
      }
    private Node first;
    private Node last;
    private int size = 0;

public int size(){return size;}


public void addLast(int  item){
       var node =  new Node(item);
       if(isEmpty())
           first = last = node;
       //[10,20,30]
       last.next = node;
       last = node;
       size++;
   }

public void addFirst(int  item){
    var node =  new Node(item);
    if(isEmpty())
        first = last = node;
    //[10,20,30]
    node.next = first;
    first = node;
     size++;
}

private boolean isEmpty()
{
    return first == null;
}

public int indexOf(int item)
{
    int index = 0;
    var current = first;
    while (current != null) { 
        
        if(current.value == item) return index;
         current = current.next;
         index++;
    }
    return -1;
}

public boolean contine(int item){
    return indexOf(item)!=-1;
}

public void removeFirst(){
    var secunde = first.next;
    if(isEmpty())
    throw new  NoSuchElementException();
    if(first == last)
    {
        first = last = null;
        size--;
        return;
    }
    
    first.next = null;
    first = secunde;
    
    size--;
}
  
public void removeLast(){
    if(isEmpty())
    throw new  NoSuchElementException();
    if(first == last)
    {
        first = last = null;
        size--;
        return;
    }
   var priveus = getPriveus(last);
   last = priveus;
   last.next = null;
   size--;
}
   
public Node getPriveus(Node node){
//[10,20,30,40]
var current = first;
while (current!= null) {
    if(current.next == node) return current;
       current = current.next;
}
return null;

}

public int[] toArray(){
    int[] array = new int[size()];
    var current = first;
    int index = 0;
    while(current!=null){
        if(index<size())
        {
            array[index++] = current.value;
            current = current.next;
        } else break;
        
    }
    return array;
}
 
public void reverse()
{
    //[10--> 20--> 30--> 40]
    var priveus = first;
    var current =  first.next;

    while (current!= null) {
 
    }
}
   }
  
 
