package multi;

import java.time.LocalDate;

public class Player extends TeamMember implements IPlayer {

    boolean exercising = false;
    private String previouslyPlayedTeam;

    public Player(String name, LocalDate birthdate, double salary, String previouslyPlayedTeam) {
        super(name, birthdate, salary);
        setPreviouslyPlayedTeam(previouslyPlayedTeam);
    }

    public String getPreviouslyPlayedTeam() {
        return previouslyPlayedTeam;
    }

    public void setPreviouslyPlayedTeam(String previouslyPlayedTeam) {
        if (previouslyPlayedTeam == null || previouslyPlayedTeam.isBlank()) {
            this.previouslyPlayedTeam = "none";
            return;
        }
        this.previouslyPlayedTeam = previouslyPlayedTeam;
    }

    @Override
    public void doExercises(boolean exercise) {
        this.exercising = exercise;
    }

    @Override
    public boolean isExercising() {
        return exercising;
    }

}
