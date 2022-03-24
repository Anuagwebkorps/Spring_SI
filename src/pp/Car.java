package pp;

import java.util.Map;

public class Car {
private int cno;
private String cname;
private Map<String,String> details;
public void setCno(int cno) {
	this.cno = cno;
}
public void setCname(String cname) {
	this.cname = cname;
}
public void setDetails(Map<String, String> details) {
	this.details = details;
}
public void show()
{
	System.out.println(cno+" "+cname);
	for(Map.Entry<String, String> i:details.entrySet())
	{
		System.out.println(i.getKey()+" "+i.getValue());
	}
}
}
