package Practice;

import java.util.LinkedList;

import DataStructures.Link;
import DataStructures.MyLinkedList;

/** 
 * These are a few practice questions that involve working with LinkedLists.
 * You will need to complete Part 1 before completing this section.
 */
public class Practice {

    /**
     * A classic problem: take a linked list, and
     * reverse all of its elements.
     * 
     * It is OK to mutate the original list while doing so.
     * 
     * For example, the list 1->2->3->4->5 should become 5->4->3->2->1.
     * 
     * @param lst: A linked list of integers.
     */
    public MyLinkedList reverse(MyLinkedList lst) {
        MyLinkedList result=new MyLinkedList();
        for (int x=lst.getSize()-1; x>=0; x--){
            result.add(lst.get(x));
        }
        return result;
    }

    /**
     * Given two linked lists sorted in increasing order,
     * return a sorted linked list combining all elements in
     * both lists in O(N) time.
     * 
     * For example:
     * lst1 = 1->2->3->4->5
     * lst2 = 2->4->6
     * return value = 1->2->2->3->4->4->5->6
     */
    public MyLinkedList sortedMerge(MyLinkedList lst1, MyLinkedList lst2) {
        MyLinkedList result=new MyLinkedList();
        int totalSize=lst1.getSize()+lst2.getSize();
        int indexone=0;
        int indextwo=0;
        for (int x=0; x<totalSize; x++){
            if (lst1.getSize()!=indexone&&lst2.getSize()!=indextwo){
                if (lst1.get(indexone)>=lst2.get(indextwo)){
                    result.add(lst2.get(indextwo));
                    indextwo++;
                } else {
                    result.add(lst1.get(indexone));
                    indexone++;
                }
            } else {
                if (lst1.getSize()==indexone){
                    result.add(lst2.get(indextwo));
                    indextwo++;
                } else {
                    result.add(lst1.get(indexone));
                    indexone++;
                }
            }
        }
        return result;
    }

    /**
     * Takes a linked list as input and mutates it so that every pair is flipped.
     * For example:
     * 1->2->3->4->5 would become:
     * 2->1->4->3->5
     */
    public void flipTwo(MyLinkedList lst) {
        for (int x=0; x<lst.getSize()-1;x+=2){
            int temp=lst.get(x);
            lst.set(x, lst.get(x+1));
            lst.set(x+1, temp);
        }
    }
}
