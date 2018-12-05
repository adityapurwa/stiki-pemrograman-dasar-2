/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author yohan
 */
public class Modul3 {

    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.print(); // should show nothing
        a.insert(new LinkedListNode(5));
        a.insert(new LinkedListNode(4));
        a.insert(new LinkedListNode(7));
        a.insert(new LinkedListNode(6));
        a.print(); // should show 4 5 6 7
        a.delete(a.head);
        a.print(); // should show 5 6 7
        a.delete(a.tail.prev);
        a.print(); // should show 5 7
        a.delete(a.tail);
        a.print(); // should show 5
        a.delete(a.head);
        a.print(); // should show nothing

        LinkedList b = new LinkedList();
        b.print(); // should show nothing
        // We use push because insert is already sorted
        b.push(new LinkedListNode(3));
        b.push(new LinkedListNode(2));
        b.push(new LinkedListNode(6));
        b.push(new LinkedListNode(12));
        b.bubbleSort();
        b.print();

    }

}
