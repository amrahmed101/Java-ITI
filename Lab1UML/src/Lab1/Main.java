package Lab1;

import java.util.List;

public class Main {
    public static void main(String[] args){
        Player ahmedAhmed=new Player("Ahmed","Alex",1,0);
        Player mohamedAhmed=new Player("Mohamed","Cairo",2,0);
        Coach ibrahimAhmed=new Coach("Ibrahim","Alex",1);
        Player amrAhmed=new Player("Amr","Alex",3,0);
        Player karimAhmed=new Player("Karim","Cairo",4,0);
        Coach ismaelAhmed=new Coach("Ismael","Alex",2);
        Team basketBall=new Team(211,ibrahimAhmed);
        Team footBall=new Team(212, ismaelAhmed);
        ahmedAhmed.assignTeam(basketBall);
        mohamedAhmed.assignTeam(basketBall);
        amrAhmed.assignTeam(footBall);
        karimAhmed.assignTeam(footBall);
        Delegate egypt=new Delegate();






    }
}