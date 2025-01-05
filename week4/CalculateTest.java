package week4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculateTest {
    
    private Calculate c;

    @BeforeEach
    void setup() {
        c = new Calculate();        
    }

    @AfterEach
    void end() {
        System.out.println("Test case completed");
    }

    @Test
    void testAdd() {
        assertEquals(5, c.add(2, 3));
    }

    @Test
    void testSub() {
        assertEquals(1, c.sub(2, 1));
    }

    @Test
    void testMul() {
        assertEquals(6, c.mul(2, 3));
    }

    @Test
    void testDiv() {
        assertEquals(5.0, c.div(10, 2), 0.001); // Allow for minor precision differences
    }
}
