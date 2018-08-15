package javase.oop.inherit.project.soccer;

public class Player {
    private int playerId;
    private int playerNo;
    private String playerName;
    private int playerAge;

    public Player(int playerId, int playerNo, String playerName, int playerAge) {
        super();
        this.playerId = playerId;
        this.playerNo = playerNo;
        this.playerName = playerName;
        this.playerAge = playerAge;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerNo(int playerNo) {
        this.playerNo = playerNo;
    }

    public int getPlayerNo() {
        return playerNo;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }

    public int getPlayerAge() {
        return playerAge;
    }
}
