package passengerSide;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;


@Service
public class LocationService {

    //@Autowired
    private LocationDao locationDao;

    public String getLocation(String location){
        return locationDao.getTrip(location);

    }

    public void setLocationDao(LocationDao locationDao) {
        this.locationDao = locationDao;
    }
}
