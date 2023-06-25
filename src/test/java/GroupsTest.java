import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsTest {
    @Test(groups="smoke")
    public void stepb(){
        System.out.println("stepb...");
    }

    @Test (groups ="regression")
    public void stepa(){
        System.out.println("stepa...");
    }
    @Test(groups ="regression", dependsOnGroups = "smoke")
    public void step1(){
        System.out.println("step1...");
    }
    @Test (groups ="regression")
    public void stepd(){
        System.out.println("stepd...");
    }
    @Test(groups ={"regression","smoke"} )
    public void step5(){
        System.out.println("step5...");
    }
}


