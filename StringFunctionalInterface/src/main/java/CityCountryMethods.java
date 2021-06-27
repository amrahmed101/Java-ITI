import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class CityCountryMethods {
    List<Country> countries;
    List<City> cities;

    public CityCountryMethods(List<Country> countries, List<City> cities) {
        this.countries = countries;
        this.cities = cities;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    //
    public List<Integer> populations() {
        return this.countries.stream().map(Country::getPopulation).collect(Collectors.toList());
    }

    public Double averageOfPopulations() {
        return countries.stream().mapToDouble(Country::getPopulation).average().getAsDouble();
    }

    public Integer maximumPopulation() {
        return countries.stream().mapToInt(Country::getPopulation).max().getAsInt();
    }

    public List<City> sortedCitiesByCountryCode(String s) {
        return cities.stream().filter(city -> city.getCountryCode().equals(" " + s)).sorted(Comparator.comparing(City::getPopulation)).collect(Collectors.toList());

    }
}