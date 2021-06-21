import java.util.Arrays;
import java.util.Scanner;
public class IpCutter {
    public static void main(String [] args) {
        Scanner scanner=new Scanner(System.in);
        String ipAddress=scanner.next();
        SplitIP ipSplit=new SplitIP(ipAddress);
        Integer[] ipInt=ipSplit.ipSplit();
        for (int i = 0; i <ipInt.length; i++) {
            System.out.println(ipInt[i]);
        };
    }}
