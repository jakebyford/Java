public class Team {
   // TODO: Declare private fields - teamName, teamWins, teamLosses
   private String teamName;
   private int teamWins;
   private int teamLosses;
   
   // TODO: Define mutator methods - 
   //       setTeamName(), setTeamWins(), setTeamLosses()
   public void setTeamName(String userName) {
      teamName = userName;
   }
   
   public void setTeamWins(int userWins) {
      teamWins = userWins;   
   }
   
   public void setTeamLosses(int userLosses) {
      teamLosses = userLosses;
   }
   // TODO: Define accessor methods - 
   //       getTeamName(), getTeamWins(), getTeamLosses()
   public String getTeamName() {
      return teamName;
      }
   
   public int getTeamWins() {
      return teamWins;
      }
   
   public int getTeamLosses() {
      return teamLosses;
      }
   // TODO: Define getWinPercentage()
   public double getWinPercentage() {
      double winningPercentage;
      
      winningPercentage = (double) teamWins / (double) (teamWins + teamLosses);
      
      return winningPercentage;
   }
}