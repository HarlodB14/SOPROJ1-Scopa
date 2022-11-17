import java.util.ArrayList;

public class Player {

    //instance variables
    private int playerid;
    private String userName;
    private String password;
    private int team;
    private String playStatus;
    private int scopas;
    private int sequenceNumber;
    private ArrayList<Card> swipedCards = new ArrayList<>();

    //constructor
    public Player(int playerid, String userName, String password) {
        this.playerid = playerid;
        this.userName = userName;
        this.password = password;
    }

    //getters/setters
    public int getPlayerid() {
        return playerid;
    }

    public void setPlayerid(int playerid) {
        this.playerid = playerid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    public String getPlayStatus() {
        return playStatus;
    }

    public void setPlayStatus(String playStatus) {
        this.playStatus = playStatus;
    }

    public int getScopas() {
        return scopas;
    }

    public void setScopas(int scopas) {
        this.scopas = scopas;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(int sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public ArrayList<Card> getSwipedCards() {
        return swipedCards;
    }

    public void setSwipedCards(ArrayList<Card> swipedCards) {
        this.swipedCards = swipedCards;
    }
}
