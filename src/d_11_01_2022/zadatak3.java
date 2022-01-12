package d_11_01_2022;

public class zadatak3 {

	public static void main(String[] args) {
		FacebookPost jovan = new FacebookPost();
		jovan.whoPosted="Jovan Nikolic";
		jovan.postedTo="Nikola Jovanovic";
		jovan.postText="Pravda za Djokovica";
		jovan.likes=2;
		jovan.like();
		jovan.shares=1;
		jovan.print();
		System.out.println();
		
		FacebookPost nikola = new FacebookPost();
		nikola.whoPosted="Nikola Jovanovic";
		nikola.postedTo="Jovan Nikolic";
		nikola.postText="Pravda za Australiju";
		nikola.likes=2;
		nikola.dislike();
		nikola.shares=3;
		nikola.print();

	}

}
