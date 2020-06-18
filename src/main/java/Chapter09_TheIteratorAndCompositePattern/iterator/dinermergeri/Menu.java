package Chapter09_TheIteratorAndCompositePattern.iterator.dinermergeri;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
