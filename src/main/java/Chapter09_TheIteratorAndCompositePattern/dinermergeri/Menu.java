package Chapter09_TheIteratorAndCompositePattern.dinermergeri;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
