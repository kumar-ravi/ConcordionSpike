package specs.flightSearch;

import com.example.FlightSearch;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import support.TestRunner;

@RunWith(ConcordionRunner.class)
public class IndigoFixture extends TestRunner {

    public String searchResults(String origin, String destination) {
        return new FlightSearch().searchForFlights(origin, destination);
    }

}
