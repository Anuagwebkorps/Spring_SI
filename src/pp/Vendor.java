package pp;

import java.util.List;

public class Vendor {
private int vid;
private String vname;
private List<Custmer> custmers;
public void setVid(int vid) {
	this.vid = vid;
}
public void setVname(String vname) {
	this.vname = vname;
}
public void setCustmers(List<Custmer> custmers) {
	this.custmers = custmers;
}
public void show()
{
	System.out.println(vid+" "+vname);
	for(Custmer c:custmers)
	{
		System.out.println(c);
	}
}
}
