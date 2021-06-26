package com.javaxox;
import java.io.IOException;
import java.util.*;

public class main {
    public static void main(String[] args) throws IOException {

        //creating a list of pyramid objects and printing it.
        PyramidCSVDAO pyramidReader = new PyramidCSVDAO();
        List<Pyramid> pyramids = pyramidReader.readPyramidsFromCSV("src/com/javaxox/pyramids.csv");
        int i = 0;
        for (Pyramid p : pyramids) { System.out.println("# " + (i = i + 1) + " " + p); }
        System.out.println(pyramids.size());

        //Sorting Pyramids By Height
        List <Pyramid> pyramidsByHeight=pyramidReader.sortPyramidsByHeight(pyramids);
        int x=0;
        for (Pyramid p : pyramidsByHeight) { System.out.println((x = x + 1) + " " + p); }

        //Creating a Map(Key site name , value number of Pyramids)
        Map siteNumber = pyramidReader.siteNumberOfPyramids(pyramids);
        System.out.println(siteNumber);
    }
}





