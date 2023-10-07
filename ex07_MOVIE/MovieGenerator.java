package ex07_MOVIE;

class Movie{
	String title;
	String genre;
	double rating;
	void playit(){
		System.out.println(title + " is now plaing");
	}
	Movie(String title, String genre, double rating){
		this.title = title;
		this.genre = genre;
		this.rating = rating;
	}
}

public class MovieGenerator {
	public static void main(String[] args){
		Movie movie1 = new Movie("Bleach", "Comics", 3.5);
		Movie movie2 = new Movie("Onepiece", "Comics", 5);
		Movie movie3 = new Movie("Inception", "Sci-fi", 4);
		movie1.playit();
		movie3.playit();
	}	
}
