package javase.oop.inherit.project.soccer;

public class Goal {
    
    private int goalId;
    private Team team;
    private Player player;
    private double time;

    public Goal(int goalId, Team team, Player player, double time) {
        super();
        this.goalId = goalId;
        this.team = team;
        this.player = player;
        this.time = time;
    }

    public int getGoalId() {
        return goalId;
    }

    public String getTeamName() {
        return team.getTeamName();
    }

    public String getPlayerName() {
        return player.getPlayerName();
    }

    public double getTime() {
        return time;
    }
}
