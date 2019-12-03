package de.travelbuddy;

public class Adress {

    private String town;
    private String street;
    private int streetNumber;
    private String ZIP;
    private String country;

    public Adress(String town, String street, int streetNumber, String ZIP, String country) {
        this.town = town;
        this.street = street;
        this.streetNumber = streetNumber;
        this.ZIP = ZIP;
        this.country = country;
    }

    public String getTown() {return town;}

    public void setTown(String town) {this.town = town;}

    public String getStreet() {return street;}

    public void setStreet(String street) {this.street = street;}

    public int getStreetNumber() {return streetNumber;}

    public void setStreetNumber(int streetNumber) {this.streetNumber = streetNumber;}

    public String getZIP() {return ZIP;}

    public void setZIP(String ZIP) {this.ZIP = ZIP;}

    public String getCountry() {return country;}

    public void setCountry(String country) {this.country = country;}
}
