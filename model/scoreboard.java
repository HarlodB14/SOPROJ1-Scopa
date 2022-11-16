package model;

public class scoreboard {
    private int carta;
    private int denari;
    private int settebello;
    private int primiera;
    private int scopa;
    private int gameid;
    private int playerid;

    public scoreboard(int gameid, int playerid){
        this.gameid = gameid;
        this.playerid = playerid;
    }

    public int getCarta() {
        return carta;
    }

    public int getDenari() {
        return denari;
    }

    public int getPrimiera() {
        return primiera;
    }

    public int getScopa() {
        return scopa;
    }

    public int getSettebello() {
        return settebello;
    }
}



}
