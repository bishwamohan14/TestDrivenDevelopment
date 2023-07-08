import org.example.PopulationSearch;
import org.junit.Assert;
import org.junit.Test;

public class PopulationSearchTest {


    @Test
    public void findPopulation() {
        String city = "Bangalore";
        int expectedPopulationCount = 200000;
        PopulationSearch ps = new PopulationSearch();
        int count = ps.getPopulation(city);
        Assert.assertEquals(expectedPopulationCount, count);
    }

    @Test(expected = NullPointerException.class)
    public void findPopulationWithEmptyValueOfCity() {
        String city = "";
        int expectedPopulationCount = 0;
        PopulationSearch ps = new PopulationSearch();
        int count = ps.getPopulation(city);
        Assert.assertEquals(expectedPopulationCount, count);
    }

    @Test(expected = NullPointerException.class)
    public void findPopulationWithInvalidInput() {
        String city = "xyz";
        int expectedPopulationCount = 0;
        PopulationSearch ps = new PopulationSearch();
        int count = ps.getPopulation(city);
        Assert.assertEquals(expectedPopulationCount, count);

    }

}