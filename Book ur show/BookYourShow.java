class BookYourShow{

	Show[] shows;
	int noOfMovies;
	BookYourShow(){
		shows = new Show[5];
		noOfMovies = 0;
	}

	public void addAShow(Show show){
		shows[noOfMovies++] = show;
	}

	public Show getAShow(String movieName, String dateT){
		for(int i = 0; i < noOfMovies;i++){
			if(shows[i].getMovieName().equals(movieName) && shows[i].getDateTime().equals(dateT)){
				return shows[i];
			}
		}
		return null;
	}
}