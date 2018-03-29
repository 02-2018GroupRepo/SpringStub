package passengerSide;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

 class PassengerToken {

     private int passengers;

    PassengerToken(int passengers){

        this.passengers = passengers;


    }
    public int getPassengers(){
        return passengers;
    }

/*    PassengerToken(int passengers){
        this.passengers = passengers;
    }

    public int getPassengers() {
        return passengers;
    }*/
}
