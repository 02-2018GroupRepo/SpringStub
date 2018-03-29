package passengerSide;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


@Component
public class LocationDao {


    public String getTrip(String location) {



        String tURL = "http://192.168.88.28 :8080/" + location;
        UriComponentsBuilder builder = UriComponentsBuilder.
                fromUriString(tURL);

          RestTemplate restTemplate = new RestTemplate();


        String response = restTemplate.getForObject(builder.toUriString(), String.class);
        System.out.println(response);
        return response;


    }
}
