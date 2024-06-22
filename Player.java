
package joueures;
//group5 yacine kermame , ghourbel ayoub , merkouza abdelrahmane , mokhfi amine
class Player  {
    private int jerseyNumber;
    private String position;
     private String firstName ;
    private String lastName ;
    private int age ;

    public Player(int jerseyNumber, String position,String firstName, String lastName, int age) {
        
        this.jerseyNumber = jerseyNumber;
        this.position = position;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
   public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
 public  void  displayTeamPlayers(Team team) {
    System.out.println("Joueurs de l'équipe " + team.getName() + " :");
    for (Player player : team.getPlayers()) {
        System.out.println(player.getFirstName() + player.getLastName() + " numéro de maillot : " + player.getJerseyNumber() + ", poste : " + player.getPosition() + ")");
    }
}


}

