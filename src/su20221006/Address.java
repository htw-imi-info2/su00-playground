package su20221006;

/**
 * This is an example for an immutable object in Java.
 * see also https://www.baeldung.com/java-immutable-object
 */
public class Address {
    private final String street;

    public String getCity() {
        return city;
    }

    private final String city;
    public Address(String street, String city){
        this.street = street; this.city = city;
    }

    public String getStreet() {
        return street;
    }

}
