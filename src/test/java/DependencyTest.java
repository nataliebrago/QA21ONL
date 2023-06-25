import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {
    @Test
    public void stepb(){
        System.out.println("stepb...");
    }

    @Test (dependsOnMethods = "stepb")
    public void stepa(){
        System.out.println("stepa...");
        Assert.assertTrue(false);
    }
    @Test
    public void step1(){
        System.out.println("step1...");
    }
    @Test (dependsOnMethods = "step1")
    public void stepd(){
        System.out.println("stepd...");
    }
    @Test
    public void step5(){
        System.out.println("step5...");
    }
}


