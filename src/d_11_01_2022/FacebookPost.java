package d_11_01_2022;

public class FacebookPost {
	String whoPosted;
	String postedTo;
	String postText;
	int likes;
	int shares;
	public void like () {
		this.likes=this.likes+1;
	}
	public void dislike () {
		this.likes=this.likes-1;
	}
	public void share () {
		this.shares=this.shares+1;
	}
	public void print() {
		System.out.print(this.whoPosted);
		System.out.println(" posted on " +this.postedTo +" profile");
		System.out.println(this.postText);
		System.out.println("Likes " + this.likes + " | Shares " +this.shares);
	}
}
