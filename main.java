public class Main {

    public static void main(String[] args) {
        System.out.println("\t\tClass Bank\n");
        ComputerGame PUBG = new ComputerGame(
                "PUBG",
                "PUBG" ,
                1,
                1500,
                2.f,
                2.194.758,
                50
        );
        ComputerGame CSGO = new ComputerGame(
                "CSGO",
                "CSGO",
                10,
                1200
        );
        ComputerGame = new PUBG();

        CSGO.setnumberOfPlayers(564.347);
        CSGO.setrating(3.f);

        System.out.println(PUBG.toString() + "\n");
        System.out.println(CSGO.toString() + "\n");
        System.out.println("Dota2".toString() + "\n");

        PUBG.printStaticComputerGamecount();
        CSGO.printStaticComputerGamecount();
    }
}

