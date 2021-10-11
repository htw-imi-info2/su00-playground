package su20221006;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressRecordTest {
    AddressRecord a1 = new AddressRecord("Wilhelminenhofstr. 75A", "12459 Berlin");

    @Test
    void getCity() {
        assertEquals("12459 Berlin", a1.getCity());
    }

    @Test
    void getStreet() {
        assertEquals("Wilhelminenhofstr. 75A",a1.getStreet());
    }

    @Test
    void street() {
        assertEquals("Wilhelminenhofstr. 75A",a1.street());
    }

    @Test
    void city() {
        assertEquals("12459 Berlin", a1.city());
    }
    @Test
    void equals(){
        AddressRecord a2 = new AddressRecord("Wilhelminenhofstr. 75A", "12459 Berlin");
        AddressRecord b1 = new AddressRecord("Rathenaustr. 1", "12459 Berlin");
        assertEquals(true,a1.equals(a2));
        assertEquals(false,a1.equals(b1));

    }
}