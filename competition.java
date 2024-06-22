
package joueures;
import java.util.*;
//group5 yacine kermame , ghourbel ayoub , merkouza abdelrahmane , mokhfi amine
public class competition {
    private String name;
    private List<Team> teams;
    private List<Match> matches;
     public competition(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }
 

public static void main(String args[]){
competition k=new competition("Konami Cup 2023");
Team r=new Team("Real Madrid CF",3);
Team b=new Team("FC Barcelona",1);
Referee z=new Referee("Mostafa","Ghourbel",40);
Match match=new Match(5,r,b,z);
match.disp();
match.dispstatic();

}
}
    //group5 yacine kermame , ghourbel ayoub , merkouza abdelrahmane , mokhfi amine
    
        
    
    

   
   
   
    
    

