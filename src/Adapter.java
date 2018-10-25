import java.util.Enumeration;
import java.util.Iterator;

public class Adapter implements Enumeration<Object>, Iterator<Object> {

    Iterator<?> adaptee;

    public Adapter(Iterator<?> adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public boolean hasMoreElements() {
        return adaptee.hasNext();
    }

    @Override
    public Object nextElement() {
        return adaptee.next();
    }

    @Override
    public boolean hasNext() {
        return adaptee.hasNext();
    }

    @Override
    public Object next() {
        return adaptee.next();
    }
}
