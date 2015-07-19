package freq_itemSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Set<String>> set = new HashSet<Set<String>>();
//		Map<Integer, Set<String>> set = new HashMap<Integer, Set<String>>();
		Set<String> ts1 = new TreeSet<String>();
		ts1.add("A");
		ts1.add("B");
		ts1.add("C");
		ts1.add("D");
		Set<String> ts2 = new TreeSet<String>();
		ts2.add("a");
		ts2.add("b");
		ts2.add("c");
		ts2.add("d");
		
		set.add(ts1);
		set.add(ts2);
		
		/*set.put(1, ts1);
		set.put(2, ts2);*/
		
//		Set<Entry<Integer, Set<String>>> entrySet = set.entrySet();
//		System.out.println(entrySet.iterator().next().getValue());
//		Iterator<Entry<Integer, Set<String>>> it = entrySet.iterator();
		/*while (it.hasNext()) {
//			Entry<Integer, Set<String>> entry = it.next();
//			System.out.println(entry);
			System.out.println(it);
			//it.remove();
		}*/
		//System.out.println(entrySet);
		
//		System.out.println(entrySet);
		
		
//		set.remove(3);
		
		
//		System.out.println(set);
		
		/*Iterator<Set<String>> it = set.iterator();
		while (it.hasNext()) {
//			System.out.println(it.next());
			if(1!=2){
				break;
			}
		}
		System.out.println(it);*/
		
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		set1.add("hello");
		set1.add("you");
		set2.add("hello");
		set2.add("me");
		
//		set1.addAll(set2);
//		set1.removeAll(set2);
//		set1.retainAll(set2);
//		System.out.println(set1);
		
		String tmp = "helle you hello me";
		String[] split = tmp.split(" ",2);
		System.out.println(split.length);
		for (String string : split) {
			System.out.println(string);
		}
	}

}
