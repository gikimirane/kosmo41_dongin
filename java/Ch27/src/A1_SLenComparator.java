import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//
//인스턴스보다 기능 하나가 필요한 상황
//

class SLenComp implements Comparator<String> {
	@Override
	public int compare(String s1,String s2) {
		return s1.length() - s2.length();
	}
}

public class A1_SLenComparator {

	public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("Robot");
	list.add("Lambda");
	list.add("Box");
	
	Collections.sort(list,new SLenComp()); //정렬
	
	for (String s : list)
		System.out.println(s);
		
	}

}
