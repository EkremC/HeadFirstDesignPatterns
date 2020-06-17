package Chapter09_TheIteratorAndCompositePattern.dinermergercafe;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
