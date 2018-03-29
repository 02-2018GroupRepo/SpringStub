package passengerSide;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PassengerController {

    @Autowired
   private PassengerService service;

    @RequestMapping("/requestPassengers")
    public PassengerToken index() {
        return new PassengerToken(40);
        //return service.getToken();
    }
    
}
