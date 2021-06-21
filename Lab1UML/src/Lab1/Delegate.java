package Lab1;
import java.util.List;
public class Delegate {
    public String country;
    private List <Coach> coaches;
    private List<Player> players;
    public Delegate(String country, Coach coach, List<Player> players) {
        this.country = country;
        this.coaches = coaches;
        this.players = players;
    }
    public void addCoach(Coach coaches){

        this.coaches.add(coaches);
    }
    public void addPlayers(Player player){
        this.players.add(player); }
    public int getNumberOfPlayers(){
        return this.players.size();
    }




}
