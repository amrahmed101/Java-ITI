public class SplitIP {
    String ip ;
    public SplitIP(String x) {
        this.ip=x;
    }
    public Integer[] ipSplit(){
        String [] ipSplitList = this.ip.split("\\.");
        Integer [] intList = new Integer[ipSplitList.length];
        for (int i = 0; i < ipSplitList.length; i++) {
            intList[i]=Integer.valueOf(ipSplitList[i]);
        }
        return intList;
    }
}
