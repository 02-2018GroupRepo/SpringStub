package passengerSide;

import org.springframework.stereotype.Service;


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
