import java.beans.Transient;

import static org.junit.Assert.*;
import org.junit.*;
public class TestMethod {
    @Test
    public void testMethod(){
        assertEquals(2,Method.theDouble(2));//this should fail
    }
}
