package pp;

public class Custmer {
private int cid;
private String cname;
private String address;
public void setCid(int cid) {
	this.cid = cid;
}
public void setCname(String cname) {
	this.cname = cname;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Custmer [cid=" + cid + ", cname=" + cname + ", address=" + address + "]";
}

}
