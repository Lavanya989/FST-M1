package Activities;


abstract class Book{
	String title;
	
	public void setTitle(String title) {}
	public String getTitle() {
		return title;
		}
	
}

class MyBook extends Book{
	
	public void setTitle(String s) {
		title = s;
	}
	
}

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String title = "The Adventures of Tom Sawyer";
		MyBook newNovel = new MyBook();
		
		newNovel.setTitle(title);
		
		System.out.println("Title of the Book is :" +newNovel.getTitle());

	}

}
