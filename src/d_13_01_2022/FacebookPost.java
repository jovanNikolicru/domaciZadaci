package d_13_01_2022;

public class FacebookPost {
	private String whoPosted;
	private String postedTo;
	private String postText;
	private int likes;
	private int shares;
	
	public FacebookPost() {
		
	}
	public FacebookPost(String whoPosted,String postedTo,String postText) {
		this.whoPosted=whoPosted;
		this.postedTo=postedTo;
		this.postText=postText;
	}
	public String getWhoPosted() {
		return this.whoPosted;
	}
	
	public void setWhoPosted(String whoPosted) {
		this.whoPosted = whoPosted;
	}
	public String getPostedTo() {
		return this.postedTo;
	}
	
	public void setPostedTo(String postedTo) {
		this.postedTo = postedTo;
	}
	public String getPostText() {
		return this.postText;
	}
	
	public void setPostText(String postText) {
		this.postText = postText;
	}
	public int getLikes() {
		return this.likes;
	}
	public int getShares() {
		return this.shares;
	}
	
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