package pp;

import java.util.Iterator;

import java.util.Map;
import java.util.Map.Entry;

public class Cars {
private int mno;
private String cname;
private Map<Customer,Review> details; //setter injection using collection Map with user defined objects
public void setMno(int mno) {
	this.mno = mno;
}
public void setCname(String cname) {
	this.cname = cname;
}
public void setDetails(Map<Customer, Review> details) {
	this.details = details;
}
public void show()
{

	System.out.println(mno+""+cname);                       //method
	// Iterator<Entry<Customer,Review>> it=details.entrySet().iterator();
	 Iterator<Entry<Customer,Review>> it=details.entrySet().iterator();
	 while(it.hasNext())
	 {
		 Entry<Customer,Review> e=it.next();
		 Customer c=e.getKey();
		 Review r=e.getValue();

			System.out.println(c);
			System.out.println(r);
	 }
}

//    ----  by forEach() loop---
/*public void show()
{
	System.out.println(mno+" "+cname);
	//for(Entry<Customer, Review> i:details.entrySet())
  for(Map.Entry<Customer, Review> i:details.entrySet())

	{
		Customer w=i.getKey();
		System.out.println(w);
		Review s=i.getValue();
		System.out.println(s);
		//System.out.println(i.getKey()+": MI MI MI");

	}
}*/
/* Using iterators over Map.Entry<K, V> has it’s own advantage,i.e. we can 
 * remove entries from the map during iteration by calling iterator.remove() 
 * method.*/
}
