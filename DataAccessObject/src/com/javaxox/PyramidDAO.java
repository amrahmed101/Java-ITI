package com.javaxox;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface PyramidDAO {
    public List<Pyramid> readPyramidsFromCSV(String filename) throws IOException;
    public Pyramid createPyramid(String [] metadata) throws IOException;
    Map siteNumberOfPyramids(List<Pyramid> pyramids);
    List<Pyramid> sortPyramidsByHeight(List<Pyramid> pyramids);
}
