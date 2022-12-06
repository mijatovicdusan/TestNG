package class03;

import org.testng.annotations.*;

public class Annotations {



    @BeforeClass
    public void BeforeClass(){
        System.out.println("I'm before CLASS");
    }



   @BeforeMethod
   public void BeforeMethod(){

       System.out.println("I'm before method");
   }


    @Test
    public void AfirstTest() {

        System.out.println("I'm A test");
    }

    @Test
    public void BsecondTest() {

        System.out.println("I'm B test");

    }

    @AfterMethod
    public void AfterMethod(){

        System.out.println("I'm after method");
    }

    @AfterClass
    public void AfterClass(){

        System.out.println("I'm after CLASS");
    }


}