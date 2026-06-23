Lab 2 Assignment 1 - DSA - Collections

Q.1. What is the difference between array and collection?

Ans.

Size: An array is fixed in size, meaning you cannot change its length once created. A collection is dynamic in size, meaning it can grow or shrink automatically as elements are added or removed.

Data Types: An array can hold both primitive data types (like int, char) and objects. A collection can only hold object references, not primitives (though autoboxing handles this automatically).

Memory Efficiency: Arrays are highly memory-efficient and faster because they store elements in contiguous memory locations. Collections have more overhead because they use complex data structures and objects.

Built-in Methods: Arrays do not have built-in methods for manipulation, requiring manual logic or the Arrays utility class. Collections come with rich built-in methods like add, remove, search, and sort.

Code Example:

Java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Array example
        int[] fixedArray = new int;
        fixedArray = 10;
        
        // Collection example
        ArrayList<Integer> dynamicList = new ArrayList<>();
        dynamicList.add(10);
        dynamicList.add(20);
    }
}

Q.2. What are the difference between Comparable and Comparator interface?

Ans.

Sorting Logic: Comparable is used to define the default or natural sorting order of an object. Comparator is used to define custom sorting attributes or multiple sorting logic sequences.

Implementation: Comparable requires modifying the actual class whose objects you want to sort by implementing the Comparable interface inside that class. Comparator is implemented in a separate class, leaving the original class unmodified.

Method Used: Comparable uses the compareTo method to sort objects. Comparator uses the compare method to sort objects.

Package: Comparable belongs to the java.lang package. Comparator belongs to the java.util package.

Code Example:

Java
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Comparable example (Natural sorting by ID)
class Student implements Comparable<Student> {
    int id;
    String name;
    
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int compareTo(Student s) {
        return this.id - s.id;
    }
}

// Comparator example (Custom sorting by Name)
class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

Q.3. What is the difference between ArrayList and LinkedList?

Ans.

Underlying Data Structure: ArrayList uses a dynamic resizable array to store elements. LinkedList uses a doubly linked list structure where every element contains data and pointers to previous and next elements.

Manipulation Speed: ArrayList is slow for addition or removal of elements in the middle because it requires shifting elements in memory. LinkedList is fast for manipulation because it only requires updating pointers.

Retrieval Speed: ArrayList is very fast for fetching data because it supports random access using index positions. LinkedList is slow for retrieval because it must traverse the list from the beginning or end to find an item.

Memory Overhead: ArrayList uses less memory because it only stores the data and index. LinkedList requires more memory because it must store the data along with two pointers for every node.

Code Example:

Java
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple"); // Fast append, slow middle insert
        
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Banana"); // Fast insert/delete anywhere
    }
}

Q.4. What is the difference between ArrayList and Vector?

Ans.

Synchronization: ArrayList is non-synchronized, meaning it is not thread-safe and multiple threads can access it simultaneously. Vector is synchronized, meaning it is thread-safe and safe for multi-threaded applications.

Performance: ArrayList is faster because there is no overhead of synchronization locks. Vector is slower because of the performance cost of thread safety locks.

Data Growth: ArrayList increases its size by 50 percent of its current capacity when it runs out of space. Vector doubles its size (100 percent growth) when it runs out of space.

Framework History: ArrayList was introduced in Java 1.2 as a core part of the Collection framework. Vector is a legacy class that existed since Java 1.0 but was later updated to fit into the Collection framework.

Code Example:

Java
import java.util.ArrayList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> nonThreadSafeList = new ArrayList<>();
        Vector<Integer> threadSafeVector = new Vector<>();
    }
}

Q.5. What is Diff between Hashset and Treeset?

Ans.

Underlying Structure: HashSet uses a hash table layout (backed by a HashMap) to store items. TreeSet uses a Red-Black tree structure to store its elements.

Element Ordering: HashSet does not guarantee any specific order of elements; the order can change over time. TreeSet keeps all elements sorted automatically according to their natural order or a custom comparator.

Performance Speed: HashSet provides constant performance time for basic operations like add, remove, and contains. TreeSet takes logarithmic time for basic operations because it needs to maintain sorted structure.

Null Values Allowed: HashSet allows one single null element. TreeSet does not allow any null elements and will throw a NullPointerException if you try to add one.

Code Example:

Java
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Zebra"); // Order is unpredictable
        
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Zebra"); 
        treeSet.add("Apple"); // Automatically sorted: Apple, Zebra
    }
}

Q.6. What is difference between Enumeration and Iterator interface?

Ans.

Framework History: Enumeration is a legacy interface introduced in Java 1.0. Iterator is a modern interface introduced in Java 1.2 to replace Enumeration.

Operations Allowed: Enumeration only allows you to read and traverse data. Iterator allows you to read data and also safely remove elements from the collection during traversal.

Collection Scope: Enumeration can only be applied to legacy collections like Vector, Stack, and Hashtable. Iterator can be applied to any standard Collection object like ArrayList, HashSet, or LinkedList.

Fail-Fast Behavior: Enumeration is fail-safe, meaning it does not throw an error if the collection is altered while reading. Iterator is fail-fast and throws a ConcurrentModificationException if the collection is modified outside the iterator during traversal.

Code Example:

Java
import java.util.Vector;
import java.util.Enumeration;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Enumeration Example
        Vector<Integer> v = new Vector<>();
        v.add(10);
        Enumeration<Integer> e = v.elements();
        
        // Iterator Example
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        Iterator<Integer> it = list.iterator();
    }
}

Q.7. What is difference between Iterator and ListIterator?

Ans.

Direction of Traversal: Iterator can only traverse elements in a forward direction. ListIterator can traverse elements in both forward and backward directions.

Collection Scope: Iterator can be used with any collection type like List, Set, or Queue. ListIterator can only be used exclusively with List implementations like ArrayList and LinkedList.

Extended Capabilities: Iterator only allows read and remove operations. ListIterator allows you to read, remove, modify elements using the set method, or insert new elements using the add method.

Index Operations: Iterator cannot find or tell you the index positions of elements. ListIterator provides methods like nextIndex and previousIndex to get the current position numbers during traversal.

Code Example:

Java
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alex");
        
        Iterator<String> it = names.iterator(); // Forward only
        ListIterator<String> lit = names.listIterator(); // Bi-directional
    }
}

Q.8. What is the difference between List and Set?

Ans.

Duplicate Elements: List allows duplicate elements to be added to the collection. Set enforces uniqueness and does not allow duplicate elements; any duplicate entry is ignored.

Insertion Order: List maintains the exact sequence order in which elements are added. Set does not guarantee insertion order (except specific implementations like LinkedHashSet).

Positional Access: List allows positional access and manipulation using an integer index value. Set does not support indexing, meaning you cannot get an item by calling a specific position number.

Null Elements: List allows multiple null elements to be added. Set typically allows only one single null element because all elements must stay unique.

Code Example:

Java
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java"); // Allowed
        
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Java"); // Rejected silently
    }
}