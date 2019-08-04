package cl.robot;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class RobotTest {

    private Robot eurekaClientApplication;

    @Test
    public void greetingTest(){
        eurekaClientApplication = new Robot();
        Assert.assertNotNull(eurekaClientApplication.greeting());
    }

}