package com.javaxox;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface PyramidDAO {
    public List<Pyramid> readPyramidsFromCSV(String filename) throws IOException;
    public Pyramid createPyramid(String [] metadata) throws IOException;
}
