
import java.util.ArrayList;

public class TestMain {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("first item");
        al.add("second item");
        al.add("third item");


        Adapter adapter = new Adapter(al.iterator());

        System.out.println(adapter.hasMoreElements());
        System.out.println(adapter.nextElement());
        System.out.println(adapter.nextElement());
        System.out.println(adapter.next());
        System.out.println(adapter.hasNext());



    }
}
