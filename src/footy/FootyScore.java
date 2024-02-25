package footy;

public class FootyScore {

    private int goal;
    private int behind;
    private int score;

    public FootyScore() {
        score = 0;
    }

    public int getPoints() {
        return score;
    }

    public void kickGoal() {
        this.goal += 1;
        this.score += 6;
    }

    public void kickBehind() {
        this.behind += 1;
        this.score += 1;
    }


    public String sayScore() {

        String commentatedScore = String.format("%2d, %2d, %2d", goal, behind, score);

        return commentatedScore;
    }

    public boolean inFrontOf(FootyScore otherTeam) {

        if (otherTeam.score > this.score) {
            return true;
        }

        return false;

    }






}
