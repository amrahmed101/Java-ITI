
package com.javaxox;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

}

