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

public class App

{ private static final String COMMA_DELIMITER = ",";
    public static void main( String[] args ) {



        YoutubeWordCount yt=new YoutubeWordCount("src/main/USvideos.csv");
        yt.YoutubeMostUsedTags();









    };
    public static String Extract(String videoLine){
        try {
            return videoLine.split (COMMA_DELIMITER)[6];
        } catch (ArrayIndexOutOfBoundsException e) {
            return "";
        }
    };


}

