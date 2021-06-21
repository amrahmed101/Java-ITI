package Lab1;

import java.util.List;

public class Player extends Person {
    private int playerID;
    private int numMedal;
    private Coach coach;
    private List <Medal> medalList ;
    private Team team;
    public Player(String name, String address, int playerID, int numMedal) {
        super(name, address);
        this.playerID = playerID;
        this.numMedal = numMedal; }
    public int getPlayerID() {
        return playerID; }
    public void setPlayerID(int playerID) {
        this.playerID = playerID; }
    public int getNumMedal() {
        return medalList.size(); }
    public Coach getCoach() {
        return coach; }
    public void assignCoach(Coach co){
        this.coach=co;
        System.out.println(this.playerID+" is assigned to "+this.coach+" coach"); }
    public void assignTeam(Team te){
        this.team=te;
        System.out.println(this.playerID+" is assigned to "+this.team+" team"); }
    public void addMedal(Medal med){
        this.medalList.add(med);
        System.out.println(this.playerID+" has a total "+getNumMedal()+" Medals");}
}
