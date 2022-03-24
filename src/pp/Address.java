package pp;

public class Address {
private int hno;
private String street;
private String city;
public void setHno(int hno) {
	this.hno = hno;
}
public void setStreet(String street) {
	this.street = street;
}
public void setCity(String city) {
	this.city = city;
}
//Agar toString() method use ker rah ho to getter mat use kero because wo 
//toString se ese hi print ho jaye ga

@Override
public String toString() {
	return "Address [hno=" + hno + ", street=" + street + ", city=" + city + "]";
}

}
