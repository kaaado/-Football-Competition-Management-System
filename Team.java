
package joueures;
import java.util.*;

//group5 yacine kermame , ghourbel ayoub , merkouza abdelrahmane , mokhfi amine
class Team {
    private String name;
    private List<Player> players;
      private List<Player> subs;
     private Coach coach;
        private int Res;

    public Team(String name,int Res) {
        this.name = name;
        this.Res = Res;
    }

    public int getRes() {
        return Res;
    }

    public void setRes(int Res) {
        this.Res = Res;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Player> getSubs() {
        return subs;
    }

    public void setSubs(List<Player> subs) {
        this.subs = subs;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    

    
    
}
