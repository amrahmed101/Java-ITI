package Lab1;
public class Team {
    private int teamID;
    private Coach coach;

    public Team(int teamID, Coach coach) {
        this.teamID = teamID;
        this.coach = coach; }
    public int getTeamID() {
        return teamID;
    }
    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public void getCoach() {
        System.out.println("This team is coached by "+this.coach);
    }}
