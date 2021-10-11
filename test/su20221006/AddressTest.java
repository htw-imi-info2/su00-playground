package su20221006;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {
    @Test
public void testGetThings(){
        Address a = new Address("Wilhelminenhofstr. 75A", "Berlin");
        assertEquals("Wilhelminenhofstr. 75A",a.getStreet());
    }
}