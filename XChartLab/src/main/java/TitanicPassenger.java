public class TitanicPassenger {
    private String pclass;
    private String survived;
    private String name;
    private String sex;
    private float age;
    private String sibsp;
    private String parch;
    private String ticket;
    private float fare;
    private String cabin;
    private String embarked;
    private String boat;
    private String body;
    private String home_dist;

    public TitanicPassenger() {
    }

    public TitanicPassenger(String pclass, String survived, String name, String sex, float age, String sibsp, String parch, String ticket, float fare, String cabin, String embarked, String boat, String body, String home_dist) {
        this.pclass = pclass;
        this.survived = survived;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.sibsp = sibsp;
        this.parch = parch;
        this.ticket = ticket;
        this.fare = fare;
        this.cabin = cabin;
        this.embarked = embarked;
        this.boat = boat;
        this.body = body;
        this.home_dist = home_dist;
    }

    public String toString() {
        return "TitanicPassenger{pclass='" + this.pclass + "', survived='" + this.survived + "', name='" + this.name + "', sex='" + this.sex + "', age=" + this.age + ", sibsp='" + this.sibsp + "', parch='" + this.parch + "', ticket='" + this.ticket + "', fare=" + this.fare + ", cabin='" + this.cabin + "', embarked='" + this.embarked + "', boat='" + this.boat + "', body='" + this.body + "', home_dist='" + this.home_dist + "'}";
    }

    public String getPclass() {
        return this.pclass;
    }

    public void setPclass(String pclass) {
        this.pclass = pclass;
    }

    public String getSurvived() {
        return this.survived;
    }

    public void setSurvived(String survived) {
        this.survived = survived;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public float getAge() {
        return this.age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public String getSibsp() {
        return this.sibsp;
    }

    public void setSibsp(String sibsp) {
        this.sibsp = sibsp;
    }

    public String getParch() {
        return this.parch;
    }

    public void setParch(String parch) {
        this.parch = parch;
    }

    public String getTicket() {
        return this.ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    public float getFare() {
        return this.fare;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }

    public String getCabin() {
        return this.cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    public String getEmbarked() {
        return this.embarked;
    }

    public void setEmbarked(String embarked) {
        this.embarked = embarked;
    }

    public String getBoat() {
        return this.boat;
    }

    public void setBoat(String boat) {
        this.boat = boat;
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getHome_dist() {
        return this.home_dist;
    }

    public void setHome_dist(String home_dist) {
        this.home_dist = home_dist;
    }
}
