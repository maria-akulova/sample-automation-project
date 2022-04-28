package net.absoft.mortalwombat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {
    @Test
    public void testAgedUseCanPlay(){
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertTrue(ageChecker.canPlayGame(19), "Wrong age" );
    }
    @Test
    public void testThatTooYongUsersCanNotPlay () {
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertFalse(ageChecker.isYongUser(19), "User can not play because of too yong age \n");
    }
}
