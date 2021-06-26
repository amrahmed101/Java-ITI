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
        Collections.sort(pyramids, new Comparator<Pyramid>() {
            @Override
            public int compare(Pyramid o1, Pyramid o2) {
                return (int) (Double.valueOf(o1.getHeight()) - Double.valueOf(o2.getHeight())); }});
        int x=0;
        for (Pyramid p : pyramids) { System.out.println("# " + (x = x + 1) + " " + p); }


        //Creating a Map(Key site name , value number of Pyramids)
        Map siteNumber = new HashMap();
        Set<String> sites = new LinkedHashSet<>();
        for (Pyramid p : pyramids) { sites.add(p.getSite()); }System.out.println(sites);
        int Frequency=0;
        for(String s:sites){
            for(Pyramid p:pyramids){
                if(s.equals(p.getSite())){;
                Frequency++;}
            }siteNumber.put(s,Frequency);
            Frequency=0;
        }System.out.println(siteNumber);
    }
}





