package specs.flightSearch;

import com.example.FlightSearch;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.Before;
import org.junit.runner.RunWith;
import support.TestCaseHelper;

@RunWith(ConcordionRunner.class)
public class IndigoFixture extends TestCaseHelper {

    @Before
    public void setUp() throws Exception {

        super.setup();
    }

    public String searchResults(String origin, String destination) {
        return new FlightSearch().searchForFlights(testWebDriver, origin, destination);
    }

    public void tearDown() throws Exception {

    }
}
