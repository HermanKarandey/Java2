public class ComputerGame {

    private String name;
    private int nameOfGame;
    private int numberOfHeroes;
    private int averageValue;
    private float rating; // from 0 to 10
    private static int ComputerGamecount = 0;
    protected String numberOfPlayers;
    protected int numberOfProffesionalTeam;

       public void resetValues(
               String name,
               int nameOfGame,
               int numberOfHeroes,
               int AvarageValue,
               float rating,
               String numberOfPlayers,
               int numberOfProffesionalTeam
       ) {
           this.name = name;
           this.nameOfGame = nameOfGame;
           this.numberOfHeroes = numberOfHeroes;
           this.averageValue = averageValue;
           this.rating = rating;
           this.numberOfPlayers = numberOfPlayers;
           this.numberOfProffesionalTeam = numberOfProffesionalTeam;
       }
       public void ptintComputerGamecount() {
           System.out.println("ComputerGamecount: " + ComputerGamecount);
       }
}     public static void printStaticComputerGamecount() {
    System.out.println("ComputerGamecount: " + ComputerGamecount);

}

      public String toString() {
    return "ComputerGame name is " + this.name + "\n"
    + "NumberOfPLayers: " + this.numberOfPlayers + "\n"
    + "Rating: " + this.rating;
      }

ComputerGame() {
    this(
            "Dota 2"
            110,
            1300,
            1.f,
            1.291.328,
            51,

    );
}

    ComputerGame(
            String name,
            int nameOfGame,
            int numberOfHeroes,
            int averageValue
    ) {

        this(
                name,
                nameOfGame,
                numberOfHeroes,
                averageValue,
                );
    }
     ComputerGame(
             String name,
             int nameOfGame,
             int numberOfHeroes,
             int averageValue,
             float rating,
             String numberOfPlayers,
             int numberOfProffesionalTeam

     );
{
        resetValues(
        name,
        nameOfGame,
        numberOfHeroes,
        averageValue,
        rating,
        numberOfPlayers,
        numberOfProffesionalTeam
        );

        ComputerGamecount++;
    }public void setName(String name) {
    this.name = name;
}
public void setnameOfGame(int nameOfGame){
    this.nameOfGame = nameOfGame;

}
public void setnumberOfHeroes(int numberOfHeroes){
    this.numberOfHeroes = numberOfHeroes;
}
public void setaverageValue(int averageValue){
    this.averageValue = averageValue;
}
public void setRating(float rating){
    this.rating = rating;
        }
        public void setnumberOfPlayers(String numberOfPlayers){
    this.numberOfPlayers = numberOfPlayers;
        }
        public void setnumberOfProffesionalTeam(int numberOfProffesionalTeam){
    this.numberOfProffesionalTeam = numberOfProffesionalTeam;
        }


        public String getName() {return name;}
        public int getNumberOfClients() {return nameOfGame;}
        public int getnumberOfHeroes() {return numberOfHeroes;}
        public int getaverageValue() {return averageValue;}
        public float getrating() {return ratinh;}
        public String getnumberOfPlayers() {return numberOfPlayers;}
        public int getnumberOfProffesionalTeam() {return numberOfProffesionalTeam;}
