package pp;

public class Review {
private String datetime;
private String review;
private String stars;
public void setDatetime(String datetime) {
	this.datetime = datetime;
}
public void setReview(String review) {
	this.review = review;
}
public void setStars(String stars) {
	this.stars = stars;
}
@Override
public String toString() {
	return "Review [datetime=" + datetime + ", review=" + review + ", stars=" + stars + "]";
}

}
