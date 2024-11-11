import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        //Adding elements to map
        map.put(1,"Amit");
        map.put(5,"Rahul");
        map.put(2,"Jai");
        map.put(6,"Amit");
        //Traversing Map
        Set set=map.entrySet();//Converting to Set so that we can traverse
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        String name = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
        String s = name.replaceAll("Z","Q");
        System.out.println(s);
}

static void New1(){

    Map<Integer,String> map=new HashMap<Integer,String>();
    map.put(100,"Amit");
    map.put(101,"Vijay");
    map.put(102,"Rahul");
    //Returns a Set view of the mappings contained in this map
    map.entrySet()
            //Returns a sequential Stream with this collection as its source
            .stream()
            //Sorted according to the provided Comparator
            .sorted(Map.Entry.comparingByKey())
            //Performs an action for each element of this stream
            .forEach(System.out::println);
}
}
