
package joueures;

//group5 yacine kermame , ghourbel ayoub , merkouza abdelrahmane , mokhfi amine
class Match {
   private int tourNumber;
   private Team homeTeam;
   private Team awayTeam;
   private Referee referee;
  

    public Match(int tourNumber, Team homeTeam, Team awayTeam, Referee referee) {
        this.tourNumber = tourNumber;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.referee = referee;
       
    }

    public int getTourNumber() {
        return tourNumber;
    }

    public void setTourNumber(int tourNumber) {
        this.tourNumber = tourNumber;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }

    public Referee getReferee() {
        return referee;
    }

    public void setReferee(Referee referee) {
        this.referee = referee;
    }

   
    
public void disp(){
System.out.println("Tour Number:"+tourNumber+"\n"+homeTeam.getName()+" "+homeTeam.getRes()+"  -  "+awayTeam.getRes()+" "+awayTeam.getName()
        +"\nReferee:"+referee.getFirstName()+" "+referee.getLastName());
}

    public void dispstatic(){
System.out.println("Team:"+homeTeam.getName()+"\n his Goals  "+homeTeam.getRes()+"\n Goal on it :"+awayTeam.getRes());
System.out.println("\nTeam:"+awayTeam.getName()+"\n his Goals  "+awayTeam.getRes()+"\n Goal on it :"+homeTeam.getRes());
}
    
}
