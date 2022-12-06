package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNgAnnotations {

    //first test case

    @Test
    public void AfirstTestCase(){

        System.out.println("I'm first test case");
    }
    @Test
    public void BsecondTestCase(){

        System.out.println("I'm second test case");
    }

    @Test
    public void ThirdTestCase(){

        System.out.println("I'm third test case");
    }

    @BeforeMethod
    public void beforeMethod(){

        System.out.println("I'm before method");
    }

    @AfterMethod
    public void AfterMethod(){

        System.out.println("I'm after method");
    }

}
