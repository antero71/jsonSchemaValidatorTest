package fi.antero.json.model;

public class Address {
    private Long counter;

    private String street;
    private String postalCode;
    private String city;

    public Long getCounter() {
        return counter;
    }

    public String getStreet() {
        return street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public Address(long counter, String street, String postalCode, String city) {
        this.counter = counter;
        this.street=street;
        this.postalCode=postalCode;
        this.city=city;
    }
}
