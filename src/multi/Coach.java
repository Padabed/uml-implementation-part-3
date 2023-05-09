package multi;

import java.time.LocalDate;

public class Coach extends TeamMember {

    private int yearsOfCoachingExperience;

    public Coach(String name, LocalDate birthdate, double salary, int yearsOfCoachingExperience) {
        super(name, birthdate, salary);
        setYearsOfCoachingExperience(yearsOfCoachingExperience);
    }

    public int getYearsOfCoachingExperience() {
        return yearsOfCoachingExperience;
    }

    public void setYearsOfCoachingExperience(int yearsOfCoachingExperience) {
        if (yearsOfCoachingExperience < 5) {
            throw new IllegalArgumentException("Small experience error");
        }
        this.yearsOfCoachingExperience = yearsOfCoachingExperience;
    }

}
