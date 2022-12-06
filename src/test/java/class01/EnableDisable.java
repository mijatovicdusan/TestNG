package class01;

import org.testng.annotations.Test;

public class EnableDisable {

    @Test(enabled = false)
    public void ATest(){

        System.out.println("I'm A test");
    }

    @Test
    public void BTest(){

        System.out.println("I'm B test");
    }

    @Test(enabled = false)
    public void CTest(){

        System.out.println("I'm C test");
    }
}
