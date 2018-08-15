package javase.oop.inherit.project.soccer;

import java.util.ArrayList;

public class Team {
    
    private int teamId;
    private String teamName;
    private ArrayList<Player> players;

    public Team(int teamId, String teamName, ArrayList<Player>players) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.players = players;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

}
