package HashTable;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.*;

public class HashTable < T extends Comparable, V extends Comparable > {
    LinkedList<T> linkedList;


    public HashTable() {
        this.linkedList=new LinkedList<>();
    }

    public V get(T data) {
        Node<T,V> node= this.linkedList.add(data)
        if(node == null){
            return null;
        }
        else{
            return (V) node.getNodeValue();
        }
    }

    public void add(T data,V value) {
        Node<T,V> node=(Node<T, V>) this.linkedList.(data);
        if(node == null){
            node=new Node(data,value);
            this.linkedList.insertback();
        }

        else{
            node.setNodeValue(value);

        }
    }

    @Override
    public String toString() {
        return "HashTable{" + linkedList + '}';
    }
}