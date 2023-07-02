import java.util.List;

// A caravan of camels implemented as a singly linked list with entries of 'Camel'.
// There are no 'null' entries in the list.
//
// TODO: define further classes and methods for the implementation of the singly linked list,
//  if needed. Do NOT use the Java-Collection framework in your implementation.
//
public class Caravan /* singly linked list */ {

    //TODO: declare variables. - [DONE]
    ListNode head;

    // Initializes this caravan as an empty list.
    public Caravan() {

        //TODO: define constructor. - [DONE]
        this.head = null;

    }

    // Adds 'camel' as the last camel to the end of this caravan.
    // Precondition: camel != null.
    /*addLast*/
    public void addLast(Camel camel) {

        // TODO: implement method. - [DONE]

        // Liste leer oder Einträge schon vorhanden?

        if (head == null) {
            head = new ListNode(camel, null);
        } else {

            ListNode trav = head;
            while (trav.getNext() != null) {
                trav = trav.getNext();
            }
            trav.setNext(new ListNode(camel, null));
        }

    }

    // Inserts a new camel into this caravan. Seen from the head of the caravan, the camel is
    // inserted just before the first camel in the caravan that has the same strength as the
    // specified 'searchStrength'. If no such camel is found, the new camel is added as the head
    // of the caravan.
    // Precondition: camel != null.
    public void insertBefore(int searchStrength, Camel camel) {

        // TODO: implement method. - [DONE]

        // Liste leer oder erster Eintrag hat gesuchte Stärke
        if (head == null || head.getValue().getStrength() == searchStrength) {
            head = new ListNode(camel, head);
        } else {

            // Liste nicht leer & Index muss ermittelt werden
            ListNode trav = head;
            boolean found = false;

            while (trav.getNext() != null) {
                if (trav.getNext().getValue().getStrength() == searchStrength) {
                    found = true;
                    break;
                }
                trav = trav.getNext();
            }

            // Fallunterscheidung gefunden oder nicht gefunden
            if (found) {
                trav.setNext(new ListNode(camel, trav.getNext()));
            } else {
                head = new ListNode(camel, head.getNext());
            }
        }
    }

    // Removes 'number' camels from the front of the caravan (the first 'number'
    // camels seen from the head of the caravan) and returns them as a new caravan in which they
    // have the same order as they had in 'this' (see examples in 'PraxisTest1.java'). If this
    // caravan is empty (this.size() == 0) or number == 0 then the result is a new empty caravan.
    // Precondition: number >= 0 && number <= this.size().
    public Caravan detachFront(int number) {

        // TODO: implement method. - [DONE]

        if (head == null || number == 0) {
            return new Caravan();
        }

        Caravan detached = new Caravan();

        ListNode trav = head;
        for (int i = 0; i < number; i++) {
            detached.addLast(trav.getValue());
            trav = trav.getNext();
        }
        head = trav;

        return detached;
    }

    // Returns the number of camels in the caravan.
    public int size() {

        //TODO: implement method. - [DONE]

        int size = 0;
        ListNode trav = head;

        while (trav != null) {
            trav = trav.getNext();
            size++;
        }

        return size;
    }

    // Returns a string representation of this caravan with all its camels in brackets
    // in corresponding order with head of the caravan on the left,
    // followed by the pace of the caravan, which corresponds to the pace of
    // the slowest camel in the caravan.
    // Example: [(10-2=8), (5-2=3), (7-3=4), (10-3=7)] pace = 3
    // Returns "[]" if the caravan is empty.
    public String toString() {

        // TODO: implement method. - [DONE]

        String toReturn = "[";

        if (this.size() != 0) {

            toReturn += head.getValue().toString();

            int minPace = head.getValue().getMaxPace();
            ListNode trav = head.getNext();

            while (trav != null) {
                toReturn += ", " + trav.getValue().toString();

                if (trav.getValue().getMaxPace() < minPace) {
                    minPace = trav.getValue().getMaxPace();
                }
                trav = trav.getNext();
            }

            return toReturn += "] pace = " + minPace;
        } else {
            return toReturn += "]";
        }
    }
}

// TODO: define further classes, if needed (either here or in a separate file). - [DONE]

class ListNode {

    private ListNode next;
    private Camel value;

    public ListNode() {

    }

    public ListNode(Camel value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public ListNode(Camel value) {
        this.value = value;
        this.next = null;
    }

    public Camel getValue() {
        return this.value;
    }

    public ListNode getNext() {
        return this.next;
    }

    public void setValue(Camel value) {
        this.value = value;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

}
