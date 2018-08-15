package javase.oop.inherit.project.soccer;

import java.util.ArrayList;

public class ProjectSoccer {
    public static void main(String[] args) {

        Player p1 = new Player(1, 10, "Abo Treika", 20);
        Player p2 = new Player(2, 15, "Muhammad", 18);

        Player p3 = new Player(3, 19, "Ahmed", 21);
        Player p4 = new Player(4, 9, "Khaled", 28);

        ArrayList<Player> homePlayers = new ArrayList<Player>();
        homePlayers.add(p1);
        homePlayers.add(p2);

        ArrayList<Player> awayPlayers = new ArrayList<Player>();
        awayPlayers.add(p3);
        awayPlayers.add(p4);

        Team homeTeam = new Team(1, "Asman Assuit", homePlayers);
        Team awayTeam = new Team(2, "Ghazl Elmahala", awayPlayers);

        Goal g1 = new Goal(1, homeTeam, p1, 60.35);
        Goal g2 = new Goal(2, homeTeam, p2, 70.10);
        Goal g3 = new Goal(3, awayTeam, p3, 85.0);

        ArrayList<Goal> goals = new ArrayList<Goal>();

        goals.add(g1);
        goals.add(g2);
        goals.add(g3);

        Game game = new Game(0, homeTeam, awayTeam, goals);

        // System.out.println("Match Results: Home 2-1 Away" + "First Goal Scored by: " + g1.getPlayerName() +
        //                 " Second goal scored by: " + g2.getPlayerName());

        System.out.println("Game to string: " + game.toString());

    }
}
