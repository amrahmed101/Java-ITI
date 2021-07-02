import java.io.IOException;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {
        ReadFromFile titanicFile = new ReadFromFile();
        List<TitanicPassenger> passengersList = titanicFile.getPassengersFromJsonFile("src/main/java/titanic_csv.json");
        System.out.println(passengersList);
        GraphXChart graph = new GraphXChart();
        graph.graphPassengersAgesandNames(passengersList);
        GraphXChart graph1 = new GraphXChart();
        graph1.graphPassengersClasses(passengersList);
        GraphXChart graph2 = new GraphXChart();
        graph2.graphPassengersSurvived(passengersList);
        GraphXChart graph3 = new GraphXChart();
        graph3.graphPassengersSurvivedByGender(passengersList);
    }
}
