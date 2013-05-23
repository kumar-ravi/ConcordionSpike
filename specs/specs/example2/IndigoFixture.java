package specs.example2;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import com.example.FlightSearch;
import utils.SetUp;

/* Run this class as a JUnit test. */

@RunWith(ConcordionRunner.class)
public class IndigoFixture {

    public String searchResults(String origin, String destination ) {
        return new FlightSearch().SearchForFlights(origin, destination);
    }


}