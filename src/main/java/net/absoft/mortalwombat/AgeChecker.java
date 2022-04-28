package net.absoft.mortalwombat;

public class AgeChecker {
    private static final int MIN_AGE = 21 ;

    public boolean canPlayGame (int age) {
        return age >= MIN_AGE;
    }

    public boolean isYongUser(int age) {
        return age < MIN_AGE;
    }
}

