package cl.robot.service;

import com.pi4j.io.gpio.*;
import org.springframework.stereotype.Service;

@Service
public class LedServiceImpl implements LedService {

    public void ledFixtures(boolean status) throws InterruptedException {
        System.out.println("<--Pi4J--> GPIO Control Example ... started.");

        try {
            final GpioController gpio = GpioFactory.getInstance();

            final GpioPinDigitalOutput ledPin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01);

            /** Blink every second */
            ledPin.blink(1000, 15000);

            /** keep program running until user aborts (CTRL-C) */
            while (status) {
                Thread.sleep(500);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Exiting ControlGpioExample");
    }

}
