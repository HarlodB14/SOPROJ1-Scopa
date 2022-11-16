package model;

public class chat {
    private DatabaseConnector dbConn;
    private int gameid;
    private String messageString;
    private String timeStamp;

    public chat(int gameid, DBConn dbConn){
        this.dbConn = dbConn;
        this.gameid = gameid;
    }

    public String getMessageString(){
        return messageString;
    }

    public String getTimeStamp(){
        return timeStamp;
    }

    public String showText(){
        if ()
    }
}
