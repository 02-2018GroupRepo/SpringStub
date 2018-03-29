package passengerSide

import org.springframework.web.client.RestTemplate
import spock.lang.Specification
import org.springframework.web.util.UriComponentsBuilder;
import static org.mockito.ArgumentMatchers.*;


class getTripsTest extends Specification {

    def "send a location and get times back"() {

        given: "a location"
        String location = "Atanta"
        LocationService locationService = new LocationService()
        String returnedLocation = "Boston, Austin, Denver"

        and: "a service that returns outgoing train destinations"
        LocationDao locationDao = Stub(LocationDao.class)
        locationDao.getTrip(anyString()) >> returnedLocation
        locationService.setLocationDao(locationDao)


        when: "the location is sent to that service"
        locationService.getLocation(location)

        then: "trains are returned"
        returnedLocation.contains("Bostn")

    }


}
