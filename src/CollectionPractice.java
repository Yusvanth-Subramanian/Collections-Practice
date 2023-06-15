import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionPractice {

    public static void main(String[] args) {
        Collection<String> lst = new ArrayList<>();
        lst.add("1");
        lst.add("2");
        Collections.addAll(lst,"3","4","5");
        System.out.println(lst);
        lst.remove("2");
        System.out.println(lst);
        System.out.println(lst.size());
        lst.clear();
        System.out.println(lst);
        Collection<String> newLst = new ArrayList<>();
        newLst.addAll(lst);
        System.out.println(lst==newLst);
        System.out.println(lst.equals(newLst));
    }
}
