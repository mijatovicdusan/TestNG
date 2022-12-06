package class01;

import org.testng.annotations.Test;

public class Priority {

    @Test(priority = 3,groups = "regression")
    public void ATest(){

        System.out.println("I'm A test");
    }

    @Test(priority = 2)
    public void BTest(){

        System.out.println("I'm B test");
    }

    @Test(priority = 1)
    public void CTest(){

        System.out.println("I'm C test");
    }
    @Test       //by default priority is zero
    public void DTest(){

        System.out.println("I'm D test");
    }
}
