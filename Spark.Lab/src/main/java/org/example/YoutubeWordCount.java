package org.example;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.sparkproject.jetty.util.component.LifeCycle.stop;

public class YoutubeWordCount {

    String path;

    public YoutubeWordCount(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    //Creating Spark and Configuring it
    private static final String COMMA_DELIMITER = ",";



    public void YoutubeMostUsedTags() {
        Logger.getLogger("org").setLevel(Level.ERROR);
        // CREATE SPARK CONTEXT
        SparkConf conf = new SparkConf().setAppName("wordCounts").setMaster("local[3]");
        JavaSparkContext sparkContext = new JavaSparkContext(conf);
        // LOAD DATASETS
        JavaRDD<String> videos = sparkContext.textFile("src/main/USvideos.csv");
        // TRANSFORMATIONS
        JavaRDD<String> Strings = videos
                .map(App::Extract)
                .filter(StringUtils::isNotBlank);
        JavaRDD<String> tags = Strings.flatMap(String -> Arrays.asList(String.toLowerCase()
                .trim()
                .split("\\|")).iterator());

        Map<String, Long> wordCounts = tags.countByValue();
        List<Map.Entry> sorted = wordCounts.entrySet().stream()
                .sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
        // DISPLAY
        for (Map.Entry<String, Long> entry : sorted) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}