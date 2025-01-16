package exercisepgm_1;
import java.util.*;

public class ArrayInsertDeleteRand {
	public static boolean insert(Map m,int element,List list)
	{
		
		if(m.containsKey(element))
		{
			return false;
		}
		m.put(element,m.size());
		list.add(element);
		return true;
	}
	public static void getrand(Map m,List list)
	{
		Random random=new Random();
		int rand=random.nextInt(list.size());
	    System.out.println(list.get(rand));
		
        
	}
	  public static boolean remove(Map<Integer, Integer> m, int element) {
	     
	        if(m.containsKey(element))
	        {
	        
	           m.remove(element);
	           return true;
	        }
	        return false;
	    }


	public static void main(String[] args) {
		Map<Integer,Integer> m=new HashMap<Integer,Integer>();
		List<Integer> list=new ArrayList<Integer>();
		int element=2;
		boolean insertres=insert(m,element,list);
		System.out.println(insertres);
		int element1=5;
		boolean insertres1=insert(m,element1,list);
		System.out.println(insertres1);
		getrand(m,list);
		int element2=5;
		boolean removeres=remove(m,element2);
		System.out.println(removeres);
		
		for(Map.Entry<Integer,Integer> set:m.entrySet())
		{
			System.out.println(set.getKey()+" "+set.getValue());
		}
		
	}

}
