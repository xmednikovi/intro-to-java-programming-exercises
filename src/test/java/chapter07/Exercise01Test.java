package chapter07;


import org.junit.Assert;
import org.junit.Test;

import static chapter07.Exercise01.*;

public class Exercise01Test {

    public static int[] scores = {40, 55, 70, 58};

    @Test
    public void findBestScoreTest(){
        int result = findBestScore(scores);
        Assert.assertEquals(70, result);
    }

    @Test
    public void getGradeTest(){
        /*
        Student 0 score is 40 and grade is F
        Student 1 score is 55 and grade is C
        Student 2 score is 70 and grade is A
        Student 3 score is 58 and grade is C
         */
        Assert.assertEquals('F', getGrade(40, 70));
        Assert.assertEquals('C', getGrade(55, 70));
        Assert.assertEquals('A', getGrade(70, 70));
        Assert.assertEquals('C', getGrade(58, 70));
    }
}
