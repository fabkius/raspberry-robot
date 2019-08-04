package cl.robot.service;

import com.pi4j.io.gpio.*;

public class LedServiceImpl{

    private LedServiceImpl(){}

    private static final LedServiceImpl instance = new LedServiceImpl();

    public static LedServiceImpl getInstance() {
        return instance;
    }

    public void ledFixtures(boolean status) throws InterruptedException {
        System.out.println("<--Pi4J--> GPIO Control Example ... started.");

        // create gpio controller
        final GpioController gpio = GpioFactory.getInstance();

        // provision gpio pin #01 as an output pin and turn on
        final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED", PinState.HIGH);


       if(status){
           // set shutdown state for this pin
           pin.setShutdownOptions(true, PinState.LOW);
           pin.toggle();
           System.out.println("--> GPIO state should be: ON");
       }else{
           // turn off gpio pin #01
           gpio.shutdown();
           gpio.unprovisionPin(pin);
       }

       /* Thread.sleep(5000);

        // toggle the current state of gpio pin #01 (should turn on)
        pin.toggle();
        System.out.println("--> GPIO state should be: ON");

        Thread.sleep(5000);

        // toggle the current state of gpio pin #01  (should turn off)
        pin.toggle();
        System.out.println("--> GPIO state should be: OFF");

        Thread.sleep(5000);

        // turn on gpio pin #01 for 1 second and then off
        System.out.println("--> GPIO state should be: ON for only 1 second");
        pin.pulse(1000, true); // set second argument to 'true' use a blocking call

        // stop all GPIO activity/threads by shutting down the GPIO controller
        // (this method will forcefully shutdown all GPIO monitoring threads and scheduled tasks)*/



        System.out.println("Exiting ControlGpioExample");
    }

}
