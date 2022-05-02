import static org.junit.Assert.*;
import org.junit.*;


public class SkillDemoTest {
    @Test
    public void multiply(){
        assertEquals(7, SkillDemo.multiply(2, 3));
        //test that fails
    }
    
}
