package bt4.sapXepDoiBongTheoDiemSo;

public class ClubFootBall {
    private int footballTeamId;
    private String name;
    private int numberOfPlayer;
    private int score;

    public ClubFootBall() {
    }

    public ClubFootBall(int footballTeamId, String name, int numberOfPlayer, int score) {
        this.footballTeamId = footballTeamId;
        this.name = name;
        this.numberOfPlayer = numberOfPlayer;
        this.score = score;
    }

    public int getFootballTeamId() {
        return footballTeamId;
    }

    public void setFootballTeamId(int footballTeamId) {
        this.footballTeamId = footballTeamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayer() {
        return numberOfPlayer;
    }

    public void setNumberOfPlayer(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "ClubFootBall{" +
                "footballTeamId=" + getFootballTeamId() +
                ", name='" + name + '\'' +
                ", numberOfPlayer=" + numberOfPlayer +
                ", score=" + score +
                '}'+"\n";
    }
}
