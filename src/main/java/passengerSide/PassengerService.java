package passengerSide;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {


    public PassengerToken getToken(){
        return new PassengerToken(40);
    }
}
