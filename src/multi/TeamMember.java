package multi;

import java.time.LocalDate;
import java.time.Period;

public class TeamMember {

    private String name;
    private LocalDate birthdate;
    private double salary;

    public TeamMember(String name,  LocalDate birthdate, double salary) {
        setName(name);
        setBirthdate(birthdate);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        if (birthdate == null) {
            throw new IllegalArgumentException("Birthdate is required");
        }
        if (birthdate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Birthdate cannot be from the future");
        }
        if (Period.between(birthdate, LocalDate.now()).getYears() < 16) {
            throw new IllegalArgumentException("Player should be at least 16 years old");
        }
        this.birthdate = birthdate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("It can be no salary by not less than 0");
        }
        this.salary = salary;
    }
}
