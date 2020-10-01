package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    @ParameterizedTest
    @CsvSource ({ "xxggxx", "xxgxx", "xxggyygxx", "g" , "gg", "xxgggxyz","xxgggxyg"})
    public void happy(String ghStr) {
        GHappy gHpy = new GHappy();
        boolean result = gHpy.gHappy(ghStr);
        if ( result ) {
            Assertions.assertTrue(result);
        }
        else {
            Assertions.assertFalse(result);
        }

    }


}
