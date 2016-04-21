package model;

import model.enumPerso.Rank;

public class Police implements Comparable<Police> {
	private String firstname;
	private String lastname;
	private Rank rank;

	
	
	
	public Police(String firstname, String lastname, Rank rank) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.rank = rank;
	}
	
	
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	@Override
	public int compareTo(Police o) {
		//if (o.rank.compareTo(this.rank) == 0) {
			return this.lastname.compareTo(o.getLastname());
	}



	@Override
	public String toString() {
		return "Police [firstname=" + firstname + ", lastname=" + lastname + ", rank=" + rank + "]";
	}


	public Rank getRank() {
		return rank;
	}


	public void setRank(Rank rank) {
		this.rank = rank;
	}
	
	
	
}
