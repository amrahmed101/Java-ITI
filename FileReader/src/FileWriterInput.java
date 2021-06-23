import java.io.*;

public class FileWriterInput {
    public static void main(String [] args) throws IOException {
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader brr = new BufferedReader(r);
            FileWriter fw = new FileWriter("D:\\test.txt");
            BufferedWriter brw = new BufferedWriter(fw);
            String input = brr.readLine();

            do{input = brr.readLine();
                brw.write(input);}
            while (!input.equals("stop"));
            brw.close();
            fw.close();
            brr.close();
        }}
