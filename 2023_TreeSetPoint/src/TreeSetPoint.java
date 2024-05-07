// Please modify this file at each line containing TODO.

// A set of 2D-points (objects of type 'Point') implemented as a binary search tree.
// There are no duplicate entries in the set (no two elements e1 and e2 for which
// e1.isEqualTo(e2) is 'true'). To find an element, the search tree uses the city block distance
// between the element and a reference point as key. See the method 'distanceTo'
// in 'Point' that defines 'city block distance' through program code. The reference point is
// specified upon construction of the 'TreeSetPoint' object. It is not specified where to find
// elements with the same city block distance in the tree (but some some decision can lead to
// a simpler implementation than another one). The reference point itself need not be an
// element of the set (unless explicitly added as an element).
//
// TODO: define further classes and methods for the implementation of the binary search tree,
//  if needed. Do NOT use the Java-Collection framework in your implementation.
//
public class TreeSetPoint {

    //TODO: Define Variables if needed

    // Initializes this set as an empty set. 'reference' is the reference point according
    // to the description of this class ('TreeSetPoint').
    // Precondition: reference != null.
    public TreeSetPoint(Point reference) {
        //TODO: Define Construktor
    }

    // Adds the specified Point object to the set. The method does nothing if the set
    // already contained an element 'e' for which e.isEqualTo(point) == true.
    // Precondition: point != null.
    public void add(Point point) {
       //TODO: Implement method
    }


    // Adds all elements of the specified set to this set. 'set' is not changed by the method.
    // Precondition: set != null.
    public void addAll(TreeSetPoint set) {
        //TODO: Implement method
    }

    // Returns the number of points in this set having a city block distance to the set's reference
    // point less or equal to the specified 'distance' (given as parameter). The method exploits
    // the structure of the binary search tree and traverses only relevant parts of the tree.
    // Precondition: distance >= 0.
    public int countWithinRange(int distance) {
        //TODO: Implement method
        return 0;
    }

    // Returns a string representation of 'this' with all points in brackets ordered ascending
    // according to their city block distance to the set's reference point, followed by the
    // reference point and its distance to the closest and most distant element.
    // (The order of two elements with the same distance is not specified.)
    // The format is as in the following example with a list of four points and the reference
    // point [0,1]:
    // "[[1,1], [1,2], [-1,2], [2,3]] ref [0,1] min 1 max 4"
    // If the set is empty the format is as follows (in this example the reference point is [0,1]):
    // "[] ref [0,1]"
    // See further examples in 'PraxisTest1.java'.
    public String toString() {
        //TODO: Implement method
        return null;
    }
}

// TODO: define further classes, if needed (either here or in a separate file).
