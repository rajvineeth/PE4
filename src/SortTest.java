import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortTest {
    Sort sort

    @Before
    public void setUp() throws Exception {
        sort =new Sort()
    }

    @After
    public void tearDown() throws Exception {
        sort = null;
    }

    @Test
    public void  sortString(){
        assertEquals("failure","hello is this what world",sort.SortString("hello world what is this"));
    }

    @Test
    public void sortStringFailure(){
        assertNotNull("failure","only");
        assertNull(null);

    }
}