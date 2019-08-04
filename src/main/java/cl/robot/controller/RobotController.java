package cl.robot.controller;

import cl.robot.service.LedServiceImpl;
import com.pi4j.io.gpio.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("robot")
public class RobotController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RobotController.class);


    @RequestMapping(value = "/up/{status}", method = RequestMethod.GET)
    @CrossOrigin
    public String restMethod(@PathVariable("status") boolean status) throws InterruptedException {

        LOGGER.info("[inicio]["+status+"]");

        System.out.println("GPIO Digital Output Example ... started.");

        final GpioController gpio = GpioFactory.getInstance();

        final GpioPinDigitalOutput pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01);

        if(status==false){
            pin.low();
            gpio.shutdown();
        }else{
            pin.high();
        }

        gpio.unprovisionPin(pin);

        LOGGER.info("[fijn]["+status+"]");

        return "Hola "+status;
    }

}
