package pp;

public class Customer {
private int carno;
private String name;
private String owncar;
public void setCarno(int carno) {
	this.carno = carno;
}
public void setName(String name) {
	this.name = name;
}
public void setOwncar(String owncar) {
	this.owncar = owncar;
}
@Override
public String toString() {
	return "Customer [carno=" + carno + ", name=" + name + ", owncar=" + owncar + "]";
}

}
