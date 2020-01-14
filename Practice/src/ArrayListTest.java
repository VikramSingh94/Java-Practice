import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayListTest {
	
	int num;

	public static void main(String[] args) {
		ArrayList<Integer> ls = new ArrayList<Integer>();
		ls.add(1);
		ls.add(2);
		ls.add(1);
		ls.add(3);
		System.out.println(ls);
		
		Set<Integer> st = new HashSet<Integer>();
		st.add(1);
		st.add(2);
		st.add(1);
		st.add(3);
		System.out.println(st);
		
		Map<String, String> mp = new HashMap<String, String>();
		mp.put("first", "Priyana");
		System.out.println(mp.get("first"));
	}
}
