package Chapter09_TheIteratorAndCompositePattern.iterator.dinermergercafe;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
