public class Main {
    public static void main(String[] args) throws Exception {
//        Node n1 = new Node("Alex");
//        Node n2 = new Node("Ben");
//        Node n3 = new Node("Jess");
//
//        n1.next = n2;
//        n2.next = n3;
//        System.out.println(n1.value);
//        System.out.println(n2.value);
//
//        System.out.println(n1.next.value);
//        System.out.println(n1.next.next.value);
//
//        SinglyLinkedList list = new SinglyLinkedList();
////        System.out.println(list.isEmpty());
//
//        list.addFirst("Alex");
//        list.addFirst("Quentin");
//        list.addFirst("Miley");
////        System.out.println(list.isEmpty());
////        list.print();
//        list.addLast("Cynthia");
//        list.addLast("Ghandi");
//        list.addLast("Brooke");
////        list.clear();
//        list.print();
//        list.deleteFirst();
//
//


        DoublyLinkedList list = new DoublyLinkedList();

        // Testing isEmpty on an empty list
//        System.out.println(list.isEmpty()); // should print true
//
//        // Adding elements to the list
//        list.addFirst("Quentin");
//        list.addLast("Cynthia");
//        list.print();
//
////        // Checking the list isn't empty
//        System.out.println(list.isEmpty());
//
////        // Removing elements from the list
//        list.deleteFirst();
//        list.print(); // should print Cynthia
//
//        list.deleteLast();
//        list.print(); // should print nothing
//
////        // Adding more elements to the list
//        list.addFirst("Randy");
//        list.addLast("Benjamin");
//        list.addLast("Trevor");
//        list.print(); // should print "Randy Benjamin Trevor"
//
////        // Removing elements by value
//        list.delete("Randy");
//        list.print(); // should print "Benjamin Trevor"
//
////        // Reversing the list
//        list.reverse();
//        list.print(); // should print "Trevor Benjamin"
//
////        // Clearing the list
//        list.clear();
//        list.print(); // should print "The list is empty"

        // Test addFirst
        list.addFirst("Alex");
        list.addFirst("Ben");
        list.addFirst("Jess");

        // At this point, the list should look like: Jess -> Ben -> Alex

        // Test addLast
        list.addLast("Cynthia");
        list.addLast("Ghandi");
        list.addLast("Brooke");

        // Now the list should look like: Jess -> Ben -> Alex -> Cynthia -> Ghandi -> Brooke

        // Print the list to verify
        list.print();

        // You should see: Jess Ben Alex Cynthia Ghandi Brooke
    }

    }


