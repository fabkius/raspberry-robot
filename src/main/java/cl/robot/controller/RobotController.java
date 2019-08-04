package cl.robot.controller;

import cl.robot.service.LedServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("robot")
public class RobotController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(RobotController.class);

	private LedServiceImpl LedService;

    @RequestMapping(value = "/up/{status}", method = RequestMethod.GET)
    @CrossOrigin
    public String restMethod(@PathVariable("status") boolean status) throws InterruptedException {

        LOGGER.info("[inicio]["+status+"]");

        LedService.ledFixtures(status);

        LOGGER.info("[fijn]["+status+"]");


        return "Hola "+status;
    }

}
