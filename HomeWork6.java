import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HomeWork6 {
    public static void main(String[] args) {
        HashAdd<Integer> hashList = new HashAdd<>();
        hashList.add(222);
        hashList.add(222);
        hashList.add(12222);
        hashList.add(5755);
        hashList.add(93844);
        hashList.add(56785);
        hashList.add(56785);

        System.out.println(hashList.toString());

        hashList.remove(222);
        hashList.remove(56785);

        System.out.println(hashList.toString());

        Iterator<Integer> printkey = hashList.printkey();
        while (printkey.hasNext()){
            System.out.println(printkey.next());
        }
    }
}
class HashAdd<Integer> {
    private HashMap<Integer, Object> hasmap = new HashMap<>();
    private static final Object myQ = new Object();
    public boolean add (Integer value){
        return hasmap.put(value, myQ) == null;
    }
    public boolean remove(Integer value) {
        return hasmap.remove(value) == myQ;
        }
    public String toString(){
        return hasmap.keySet().toString();
    }
    public Iterator<Integer> printkey(){
        return hasmap.keySet().iterator();
    }
}