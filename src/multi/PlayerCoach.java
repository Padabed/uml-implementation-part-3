package multi;

import java.time.LocalDate;

public class PlayerCoach extends Coach implements IPlayer  {

    boolean exercising = false;

    public PlayerCoach(String name, LocalDate birthdate, double salary, int yearsOfCoachingExperience) {
        super(name, birthdate, salary, yearsOfCoachingExperience);
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
