package timelogger.control.operation.setprojectdatatests;

import org.junit.Assert;
import org.junit.Test;
import timelogger.control.ControlFacade;
import timelogger.domain.Progetto;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

/**
 * Created by daniele on 22/10/14.
 */
public class EditingProjectParameters {

    @Test
    public void testDoOpTitleProjectShouldBeMadeOf30AlphanumericSeq(){
        String testingString = RandomStringUtils.randomAlphanumeric(30);
        ((Progetto) ControlFacade.getInstance().getData("newProject")).setTitolo(testingString);

        Assert.assertEquals(
                testingString,
                ((Progetto) ControlFacade.getInstance().getData("newProject")).getTitolo()
        );
    }

    @Test
    public void testDoOpTitleProjectShouldBeMadeOfUpTp35Char(){
        String testingString = new String(generatePswd(30,35, 12, 8, 10));
        ((Progetto) ControlFacade.getInstance().getData("newProject")).setTitolo(testingString);

        Assert.assertEquals(
                testingString,
                ((Progetto) ControlFacade.getInstance().getData("newProject")).getTitolo()
        );
    }

    @Test
    public void testDoOpTitleProjectShouldBeMadeOfBlankChar(){
        String testingString = "Titolo Progetto";
        ((Progetto) ControlFacade.getInstance().getData("newProject")).setTitolo(testingString);

        Assert.assertEquals(
                testingString,
                ((Progetto) ControlFacade.getInstance().getData("newProject")).getTitolo()
        );
    }


    private static final String ALPHA_CAPS  = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String ALPHA   = "abcdefghijklmnopqrstuvwxyz";
    private static final String NUM     = "0123456789";
    private static final String SPL_CHARS   = "!@#$%^&*_=+-/";

    private static int getNextIndex(Random rnd, int len, char[] pswd) {
        int index = rnd.nextInt(len);
        while(pswd[index = rnd.nextInt(len)] != 0);
        return index;
    }

    public static char[] generatePswd(int minLen, int maxLen, int noOfCAPSAlpha,
                                      int noOfDigits, int noOfSplChars) {
        if(minLen > maxLen)
            throw new IllegalArgumentException("Min. Length > Max. Length!");
        if( (noOfCAPSAlpha + noOfDigits + noOfSplChars) > minLen )
            throw new IllegalArgumentException
                    ("Min. Length should be atleast sum of (CAPS, DIGITS, SPL CHARS) Length!");
        Random rnd = new Random();
        int len = rnd.nextInt(maxLen - minLen + 1) + minLen;
        char[] pswd = new char[len];
        int index = 0;
        for (int i = 0; i < noOfCAPSAlpha; i++) {
            index = getNextIndex(rnd, len, pswd);
            pswd[index] = ALPHA_CAPS.charAt(rnd.nextInt(ALPHA_CAPS.length()));
        }
        for (int i = 0; i < noOfDigits; i++) {
            index = getNextIndex(rnd, len, pswd);
            pswd[index] = NUM.charAt(rnd.nextInt(NUM.length()));
        }
        for (int i = 0; i < noOfSplChars; i++) {
            index = getNextIndex(rnd, len, pswd);
            pswd[index] = SPL_CHARS.charAt(rnd.nextInt(SPL_CHARS.length()));
        }
        for(int i = 0; i < len; i++) {
            if(pswd[i] == 0) {
                pswd[i] = ALPHA.charAt(rnd.nextInt(ALPHA.length()));
            }
        }
        return pswd;
    }


}
