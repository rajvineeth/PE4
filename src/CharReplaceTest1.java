import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharReplaceTest1 {
    CharReplace charReplace;

    @Before
    public void setUp() throws Exception {
        charReplace = new CharReplace();
    }

    @After
    public void tearDown() throws Exception {
        charReplace =null;
    }
    @Test
    public void replace() {
        assertEquals("failed","faity fry",charReplace.replace("daily dry"));
        assertEquals("failed","faity fry",charReplace.replace("faity fry"));
    }
    @Test
    public void replaceFailure(){
        assertNotNull("failed",charReplace.replace(""));
        assertNull("failed",charReplace.replace(null));
    }
}