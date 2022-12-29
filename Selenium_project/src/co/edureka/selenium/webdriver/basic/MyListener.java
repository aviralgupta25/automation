package co.edureka.selenium.webdriver.basic;


import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class MyListener implements IAnnotationTransformer {

    public int counter=3;

    @Override
    public void transform(ITestAnnotation testAnnotation, Class testClass, Constructor testConstrutor, Method testMethod)
    {
        if (testMethod.getName().equals("ChangeInvocationCountOfMethod")) {
            System.out.println("Changing invocation for the following method: " + testMethod.getName());
            testAnnotation.setInvocationCount(counter);

        }

    }
}
