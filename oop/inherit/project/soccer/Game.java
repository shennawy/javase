package javase.oop.inherit.project.soccer;

import java.util.ArrayList;

public class Game {

    private int gameId;
    private Team homeTeam;
    private Team awayTeam;
    private ArrayList<Goal> goals;

    public Game(int gameId, Team homeTeam, Team awayTeam, ArrayList<Goal> goals) {
        this.gameId = gameId;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.goals = goals;
    }

    public int getGameId() {
        return gameId;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public ArrayList<Goal> getGoals() {
        return goals;
    }

    public String toString() {
        String returnText = "";
        
        for (Goal goal : goals) {
            returnText +=
                "Player: " + goal.getPlayerName() + " Of Team: " + goal.getTeamName() + " Scored at: " + goal.getTime();
        }

        return returnText;
    }

}
