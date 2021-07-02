import java.awt.Color;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.CategoryStyler;
import org.knowm.xchart.style.PieStyler;
import org.knowm.xchart.style.Styler.LegendPosition;

public class GraphXChart {
    public String chartName;
    List<TitanicPassenger> passengerList;

    public GraphXChart() {
    }

    public void graphPassengersAgesandNames(List<TitanicPassenger> passengerList) {
        List<Float> pAges = (List)passengerList.stream().map(TitanicPassenger::getAge).limit(8L).collect(Collectors.toList());
        List<String> pNames = (List)passengerList.stream().map(TitanicPassenger::getName).limit(8L).collect(Collectors.toList());
        CategoryChart chart = ((CategoryChartBuilder)((CategoryChartBuilder)((CategoryChartBuilder)(new CategoryChartBuilder()).width(1024)).height(768)).title("Age Histogram")).xAxisTitle("Names").yAxisTitle("Age").build();
        ((CategoryStyler)chart.getStyler()).setLegendPosition(LegendPosition.InsideNW);
        ((CategoryStyler)chart.getStyler()).setHasAnnotations(true);
        chart.addSeries("Passenger Ages", pNames, pAges);
        (new SwingWrapper(chart)).displayChart();
    }

    public void graphPassengersClasses(List<TitanicPassenger> passengerList) {
        Map<String, Long> result = (Map)passengerList.stream().collect(Collectors.groupingBy(TitanicPassenger::getPclass, Collectors.counting()));
        PieChart chart = ((PieChartBuilder)((PieChartBuilder)((PieChartBuilder)(new PieChartBuilder()).width(800)).height(600)).title(this.getClass().getSimpleName())).build();
        Color[] sliceColors = new Color[]{new Color(180, 68, 50), new Color(130, 105, 120), new Color(80, 143, 160)};
        ((PieStyler)chart.getStyler()).setSeriesColors(sliceColors);
        chart.addSeries("First Class", (Number)result.get("1"));
        chart.addSeries("Second Class", (Number)result.get("2"));
        chart.addSeries("Third Class", (Number)result.get("3"));
        (new SwingWrapper(chart)).displayChart();
    }

    public void graphPassengersSurvived(List<TitanicPassenger> passengerList) {
        Map<String, Long> result = (Map)passengerList.stream().collect(Collectors.groupingBy(TitanicPassenger::getSurvived, Collectors.counting()));
        PieChart chart = ((PieChartBuilder)((PieChartBuilder)((PieChartBuilder)(new PieChartBuilder()).width(800)).height(600)).title(this.getClass().getSimpleName())).build();
        Color[] sliceColors = new Color[]{new Color(180, 68, 50), new Color(130, 105, 120)};
        ((PieStyler)chart.getStyler()).setSeriesColors(sliceColors);
        chart.addSeries("Did Not Survive", (Number)result.get("0"));
        chart.addSeries("Survived", (Number)result.get("1"));
        (new SwingWrapper(chart)).displayChart();
    }

    public void graphPassengersSurvivedByGender(List<TitanicPassenger> passengerList) {
        Integer maleSurvived = Math.toIntExact(passengerList.stream().filter((passenger) -> {
            return passenger.getSex().equals("male");
        }).filter((passenger) -> {
            return passenger.getSurvived().equals("1");
        }).count());
        Integer femaleSurvived = Math.toIntExact(passengerList.stream().filter((passenger) -> {
            return passenger.getSex().equals("female");
        }).filter((passenger) -> {
            return passenger.getSurvived().equals("1");
        }).count());
        PieChart chart = ((PieChartBuilder)((PieChartBuilder)((PieChartBuilder)(new PieChartBuilder()).width(800)).height(600)).title(this.getClass().getSimpleName())).build();
        Color[] sliceColors = new Color[]{new Color(180, 68, 50), new Color(130, 105, 120)};
        ((PieStyler)chart.getStyler()).setSeriesColors(sliceColors);
        chart.addSeries("Survived Males", maleSurvived);
        chart.addSeries("Survived Females", femaleSurvived);
        (new SwingWrapper(chart)).displayChart();
    }
}
