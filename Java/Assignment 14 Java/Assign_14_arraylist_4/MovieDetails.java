package Assign_14_arraylist_4;

public class MovieDetails {
		private String movieID;
		private String movieTitle;
		private String movieGenre;
		private String yearReleased;
		public String getMovieID() {
			return movieID;
		}
		public String getMovieTitle() {
			return movieTitle;
		}
		public String getMovieGenre() {
			return movieGenre;
		}
		public String getYearReleased() {
			return yearReleased;
		}
		public MovieDetails(String movieID,String movieTitle, String movieGenre, String yearReleased) {
			this.movieID=movieID;
			this.movieTitle=movieTitle;
			this.movieGenre=movieGenre;
			this.yearReleased=yearReleased;
		}
		public String toString() {
			return  "Movie ID : " +movieID+"\n"+
					"Movie Title : " +movieTitle+"\n"+
					"Movie Genre : " +movieGenre+"\n"+
					"Released Year : " +yearReleased;
		}
}
