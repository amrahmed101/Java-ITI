import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String [] args) throws IOException {

        //Reading and Creating Cities Objects From CSV File
        CityReadCSV cityReadCSV=new CityReadCSV();
        List <City> cities=cityReadCSV.readCitiesFromCSV("src/main/java/Cities.csv");

        //Reading and Creating Countries Objects From CSV File
        CountryReadCSV countryReadCSV = new CountryReadCSV();
        List<Country> countries = countryReadCSV.readCountriesFromCSV("src/main/java/Countries.csv");
        //Methods Class
        CityCountryMethods cityCountryMethods=new CityCountryMethods(countries,cities);

        //Create a map that uses the country code as keys and a list of cities as the value for
        //each country.

        HashMap countryCities=new HashMap();
        countryCities=cityCountryMethods.countryCities();
        System.out.println(" Country:Cities\n" + countryCities);

        // For a given country code (from Console) sort the cities according to the population
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Country Code");
        String s=scanner.nextLine();
        List <City> citiesSorted=cityCountryMethods.sortedCitiesByCountryCode(s);
        for(City c:citiesSorted){
            System.out.println(c.getName()+" "+c.getPopulation());}
        //Get a List of countries population
        List<Integer> populations = cityCountryMethods.populations();
        System.out.println("Populations list\n"+populations);

        //Get the average countries population
        Double average =cityCountryMethods.averageOfPopulations();
        System.out.println("Average of Population is " +average);

        //Get the maximum countries population
        Integer maximumPopulation=cityCountryMethods.maximumPopulation();
        System.out.println("Maximum Population is " + maximumPopulation);

        //Highest City Population Per Country
        List <String> highestCity=cityCountryMethods.HighestCityPopPerCountry("AFG",1);
        System.out.println(highestCity);

        //Highest Capital Population
        List <String> highestCapitalPop=cityCountryMethods.HighestCapitalPop();
        System.out.println(highestCapitalPop);








    }
}

