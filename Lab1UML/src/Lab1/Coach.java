package Lab1;
public class Coach extends Person {
    private int coachID;
    public Coach(String name, String address, int coachID) {
        super(name, address);
        this.coachID = coachID;
    }

    public int getCoachID() {
        return coachID; }

    public void setCoachID(int coachID) {
        this.coachID = coachID; }
}

