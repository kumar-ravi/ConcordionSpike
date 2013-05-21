package specs.example2;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import com.example.FlightSearch;

/* Run this class as a JUnit test. */

@RunWith(ConcordionRunner.class)
public class IndigoFixture {

    public String searchResults(String origin ) {

        return new FlightSearch().flightOrigin(origin);
    }


}