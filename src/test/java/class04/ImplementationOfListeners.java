package class04;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ImplementationOfListeners implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result){

        System.out.println("Test case passed"+result.getName());

    }

    @Override
    public void onTestFailure(ITestResult result){

        System.out.println("Test case failed"+result.getName());

    }
}
