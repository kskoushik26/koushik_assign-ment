package com.koushik.AssignmentRest3.information;

public class Information {
	public String City;
	public String State;
	public String Country;
	public int zipcode;

	public Information() {

	}

	public Information(String city, String state, String country, int zipcode) {
		super();
		City = city;
		State = state;
		Country = country;
		this.zipcode = zipcode;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

}
