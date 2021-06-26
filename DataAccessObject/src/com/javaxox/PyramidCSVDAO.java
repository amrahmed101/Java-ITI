
package com.javaxox;

import java.io.*;
import java.util.*;

public class PyramidCSVDAO extends Thread implements PyramidDAO {
    public PyramidCSVDAO(){ }
    @Override
    public List<Pyramid> readPyramidsFromCSV(String filename) throws NullPointerException, IOException {
        BufferedReader br= null;
        try { br = new BufferedReader(new FileReader(filename)); } catch (FileNotFoundException e) {
            e.printStackTrace(); }
        String [] attribute;
        String line;
        List<Pyramid> pyramids = new ArrayList<Pyramid>();
        while((line=br.readLine())!=null){
            attribute=line.split(",");
            if(attribute[7].equals("")){attribute[7]="0";}
            Pyramid pyramid = new Pyramid(attribute[7], attribute[2], attribute[0], attribute[4]);
            pyramids.add(pyramid); }
        pyramids.remove(0);
        return pyramids; }

    @Override
    public Pyramid createPyramid(String [] metadata) throws IOException {
        Pyramid pyramid=new Pyramid(metadata[0],metadata[1],metadata[2],metadata[3]);
           return pyramid;
        }

    @Override
    public Map siteNumberOfPyramids(List <Pyramid> pyramids) {
        Map siteNumber = new HashMap();
        Set<String> sites = new LinkedHashSet<>();
        for (Pyramid p : pyramids) { sites.add(p.getSite()); };
        int Frequency=0;
        for(String s:sites){
            for(Pyramid p:pyramids){
                if(s.equals(p.getSite())){;
                    Frequency++;}
            }siteNumber.put(s,Frequency);
            Frequency=0; };
        return siteNumber;
    }

    @Override
    public List<Pyramid> sortPyramidsByHeight(List <Pyramid> pyramids) {
        Collections.sort(pyramids, new Comparator<Pyramid>() {
            @Override
            public int compare(Pyramid o1, Pyramid o2) {
                return (int) (Double.valueOf(o1.getHeight()) - Double.valueOf(o2.getHeight())); }});
        return pyramids;
    }


}

