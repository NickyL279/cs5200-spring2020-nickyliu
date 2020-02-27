package edu.northeastern.cs5200.models;

public class Address {
	private int id;
    private String street1;
    private String street2;
    private String city;
    private String state;
    private String zip;
    private Boolean primary;
    private int personId;
    private Person person;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getStreet1() {
        return street1;
    }
    public void setStreet1(String street1) {
        this.street1 = street1;
    }
    public String getStreet2() {
        return street2;
    }
    public void setStreet2(String street2) {
        this.street2 = street2;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getZip() {
        return zip;
    }
    public void setZip(String zip) {
        this.zip = zip;
    }
    public boolean getPrimary() {
        if (primary) {
            return true;
        }
        return false;
    }
    public void setPrimary(boolean Primary) {
    	primary = Primary;
    }
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    
    public Address(String street1, String street2, String city, String state, String zip, boolean primary, int personId) {
        super();
    	this.street1 = street1;
        this.street2 = street2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.primary = primary;
        this.setPersonId(personId);
    }
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
}