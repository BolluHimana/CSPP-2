import java.util.Scanner;
/**************************************************************
 * 
 * 
 * To compile this file :   javac LinkedListTest.java
 * To run this file     :   java LinkedListTest
 * Dependencies         :   MyLinkedList.java
 *                          Node.java
 * 
 **************************************************************/

/**
 * The LinkedListTest class is used for testing of MyLinkedList.
 * Please don't update this LinkedListTest.java
 * 
 * @author Murthy Vemuri
 */
public class LinkedListTest {
    /**
     * The main method used for unit testing of your MyLinkedList.
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        MyLinkedList linkedlist = new MyLinkedList();
        int count = 0;

        // Test case : 1
        linkedlist.add("Hello World");
        if ("[Hello World]".equals(linkedlist.toString())) {
            System.out.println("Test case 1 passed");
            count++;
        } else {
            System.out.println("Test case 1 failed");
        }

        // Test case : 2
        linkedlist.addFirst("Linked List");
        if ("[Linked List][Hello World]".equals(linkedlist.toString())) {
            System.out.println("Test case 2 passed");
            count++;
        } else {
            System.out.println("Test case 2 failed");
        }

        // Test case : 3
        linkedlist.add("Data Structure");
        if ("[Linked List][Hello World][Data Structure]".equals(linkedlist.toString())) {
            System.out.println("Test case 3 passed");
            count++;
        } else {
            System.out.println("Test case 3 failed");
        }

        // Test case : 4
        boolean check = linkedlist.contains("Data Structur");
        if (!check) {
            System.out.println("Test case 4 passed");
            count++;
        } else {
            System.out.println("Test case 4 failed");
        }

        // Test case : 5
        String first = linkedlist.getFirst();
        if (first.equals("Linked List")) {
            System.out.println("Test case 5 passed");
            count++;
        } else {
            System.out.println("Test case 5 failed");
        }

        // Test case : 6
        String last = linkedlist.getLast();
        if (last.equals("Data Structure")) {
            System.out.println("Test case 6 passed");
            count++;
        } else {
            System.out.println("Test case 6 failed");
        }

        // Test case : 7
        int size = linkedlist.size();
        if (size == 3) {
            System.out.println("Test case 7 passed");
            count++;
        } else {
            System.out.println("Test case 7 Failed");
        }

        // Test case : 8
        String remove = linkedlist.remove();
        if ("[Hello World][Data Structure]".equals(linkedlist.toString())) {
            System.out.println("Test case 8 passed");
            count++;
        } else {
            System.out.println("Test case 8 failed");
        }       

        // Test case : 9
        if (remove.equals("Linked List")) {
            System.out.println("Test case 9 passed");
            count++;
        } else {
            System.out.println("Test case 9 failed");
        }
        
        // Test case : 10
        remove = linkedlist.removeLast();
        if ("[Hello World]".equals(linkedlist.toString())) {
            System.out.println("Test case 10 passed");
            count++;
        } else {
            System.out.println("Test case 10 failed");
        }       

        // Test case : 11
        if (remove.equals("Data Structure")) {
            System.out.println("Test case 11 passed");
            count++;
        } else {
            System.out.println("Test case 11 failed");
        }

        // Test case : 12
        size = linkedlist.size();
        if (size == 1) {
            System.out.println("Test case 12 passed");
            count++;
        } else {
            System.out.println("Test case 12 Failed");
        }

        // Test case : 13
        String element = linkedlist.get(0);
        if (element.equals("Hello World")) {
            System.out.println("Test case 13 passed");
            count++;
        } else {
            System.out.println("Test case 13 Failed");
        }

        // Test case : 14
        remove = linkedlist.remove();
        if ("LinkedList is empty".equals(linkedlist.toString())) {
            System.out.println("Test case 14 passed");
            count++;
        } else {
            System.out.println("Test case 14 failed");
        }       

        // Test case : 15
        if (remove.equals("Hello World")) {
            System.out.println("Test case 15 passed");
            count++;
        } else {
            System.out.println("Test case 15 failed");
        }

        // Test case : 16
        size = linkedlist.size();
        if (size == 0) {
            System.out.println("Test case 16 passed");
            count++;
        } else {
            System.out.println("Test case 16 Failed");
        }

        if (count == 16) {
            System.out.println("***************************************");
            System.out.println("All basic testcases passed");
            System.out.println("Great going, try edge cases below");
            System.out.println("***************************************");
        }

        ////////////////////////////////////////////////////////
        ///                    Part - 2                      ///
        ////////////////////////////////////////////////////////
        linkedlist = new MyLinkedList();
        count = 0;
        // Test case : 17
        if ("LinkedList is empty".equals(linkedlist.toString())) {
            System.out.println("Test case 17 passed");
            count++;
        } else {
            System.out.println("Test case 17 Failed");
        }

        // Test case : 18
        size = linkedlist.size();
        if (size == 0) {
            System.out.println("Test case 18 passed");
            count++;
        } else {
            System.out.println("Test case 18 Failed");
        }

        // Test case : 19
        linkedlist.add("");
        if ("[]".equals(linkedlist.toString())) {
            System.out.println("Test case 19 passed");
            count++;
        } else {
            System.out.println("Test case 19 Failed");
        }
        
        // Test case : 20
        linkedlist.add("\t");
        if ("[][\t]".equals(linkedlist.toString())) {
            System.out.println("Test case 20 passed");
            count++;
        } else {
            System.out.println("Test case 20 Failed");
        }

        // Test case : 21
        linkedlist.clear();
        if ("LinkedList is empty".equals(linkedlist.toString())) {
            System.out.println("Test case 21 passed");
            count++;
        } else {
            System.out.println("Test case 21 Failed");
        }
        
        // Test case : 22
        linkedlist.remove();
        if ("LinkedList is empty".equals(linkedlist.toString())) {
            System.out.println("Test case 22 passed");
            count++;
        } else {
            System.out.println("Test case 22 Failed");
        }

        // Test case : 23
        linkedlist.removeLast();
        if ("LinkedList is empty".equals(linkedlist.toString())) {
            System.out.println("Test case 23 passed");
            count++;
        } else {
            System.out.println("Test case 23 Failed");
        }

        // Test case : 24
        first = linkedlist.getFirst();
        if (first == null) {
            System.out.println("Test case 24 passed");
            count++;
        } else {
            System.out.println("Test case 24 Failed");
        }

        // Test case : 25
        last = linkedlist.getLast();
        if (last == null) {
            System.out.println("Test case 25 passed");
            count++;
        } else {
            System.out.println("Test case 25 Failed");
        }
        
        // Test case : 26
        if (!linkedlist.contains(null)) {
            System.out.println("Test case 26 passed");
            count++;
        } else {
            System.out.println("Test case 26 Failed");
        }
        
        // Test case : 27
        linkedlist.addFirst("1");
        linkedlist.addFirst("2");
        linkedlist.addFirst("3");
        linkedlist.addFirst("5");
        linkedlist.addFirst("1");
        if ("[1][5][3][2][1]".equals(linkedlist.toString())) {
            System.out.println("Test case 27 passed");
            count++;
        } else {
            System.out.println("Test case 27 Failed");
        }
        
        // Test case : 28
        linkedlist.add("1");
        linkedlist.add("2");
        linkedlist.add("3");
        linkedlist.add("5");
        if ("[1][5][3][2][1][1][2][3][5]".equals(linkedlist.toString())) {
            System.out.println("Test case 28 passed");
            count++;
        } else {
            System.out.println("Test case 28 Failed");
        }

        // Test case : 28
        linkedlist.removeLast();
        linkedlist.removeLast();
        linkedlist.removeLast();
        linkedlist.removeLast();
        linkedlist.removeLast();
        linkedlist.removeLast();
        linkedlist.removeLast();
        linkedlist.removeLast();
        linkedlist.removeLast();
        if ("LinkedList is empty".equals(linkedlist.toString())) {
            System.out.println("Test case 29 passed");
            count++;
        } else {
            System.out.println("Test case 29 Failed");
        }
        
        // Test case : 30
        linkedlist.removeLast();
        linkedlist.remove();
        linkedlist.remove();
        size = linkedlist.size();
        if ("LinkedList is empty".equals(linkedlist.toString()) && size == 0) {
            System.out.println("Test case 30 passed");
            count++;
        } else {
            System.out.println("Test case 30 Failed");
        }

        if (count == 14) {
            System.out.println("***************************************");
            System.out.println("Great Job");
            System.out.println("***************************************");
        }
    }
}
