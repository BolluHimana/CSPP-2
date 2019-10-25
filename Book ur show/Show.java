class Show{
	String movieName;
	String dateTime;
	String[] seats;
	Show(String movie, String dateTime, String[] seats){
		this.movieName = movie;
		this.dateTime = dateTime;
		this.seats = seats;
	}

	public String getMovieName(){
		return this.movieName;
	}

	public String getDateTime(){
		return this.dateTime;
	}

	public void bookAShow(Patron p, String[] seatsBooked){
		String ticket = "";
		for(int i = 0; i < seats.length;i++){
			for(int j = 0; j < seatsBooked.length;j++){
				// System.out.println(seats[i]);

				if(seats[i] != null && seats[i].equals(seatsBooked[j])){
					ticket += seats[i] +" ";
					seats[i] = null;
				}
			}
		}
		p.setTicket(ticket);
	}

	public void printTickets(Patron p){
		System.out.println(this.movieName +" : "+this.dateTime);
		System.out.println(p);
	}

	public String toString(){
		String temp = this.movieName +" : "+this.dateTime+"\n"+"Available seats:-";
		for(int i = 0; i < seats.length;i++){
			if(seats[i] != null){
				temp += seats[i] + " ";
			}
		}
		return temp;
	}
}
