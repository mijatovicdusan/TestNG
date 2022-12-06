package annotations;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestAnnotation {

    @BeforeSuite
    public void beforeSuite(){

        System.out.println("I'm before suit*****");
    }

    @AfterSuite
    public void AfterSuite(){

        System.out.println("I'm after suite*******");
    }

    @BeforeTest
    public void BT(){

        System.out.println("I'm before test-------------------------");
    }

    @AfterTest
    public void AT(){

        System.out.println("I'm after test-------------");
    }
}
