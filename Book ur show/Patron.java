class Patron{
	String name;
	String mobileNumber;
	String ticket;
	Patron(String name, String number){
		this.name = name;
		this.mobileNumber = number;
	}

	public void setTicket(String t){
		this.ticket = t;
	}

	public String toString(){
		return this.ticket;
	}

}