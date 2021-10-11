package su20221006;

/**
 * As the refactoring in Idea correctly suggests, this might also be expressed
 * with a record which is specifically for data types since Java 14.
 *
 * This also elimnates the need to write equals (and hashCode) functions
 * that model equality for data types - they are equal iff their fields are equal.
 * see https://www.baeldung.com/java-record-keyword
 * see https://openjdk.java.net/jeps/395
 *
 */
public record AddressRecord(String street, String city) {
    public String getCity() { return city;  }
    public String getStreet() {
        return street;
    }
}
