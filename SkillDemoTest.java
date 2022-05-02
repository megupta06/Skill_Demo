import static org.junit.Assert.*;
import org.junit.*;


public class SkillDemoTest {
    @Test
    public void multiply(){
        assertEquals(7, SkillDemo.multiply(1, 7));
        //test that fails
    }
    
}
