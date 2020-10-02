package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tudelft.ghappy.GHappy;

public class CaesarShiftCipherTest {

    @ParameterizedTest
    @CsvSource({ "xyz, 3", "deef, 2", "abcd, 4"})
    public void cShiftCiper(String shiftMessage, int shift) {
        CaesarShiftCipher cShift = new CaesarShiftCipher();
        String result = cShift.CaesarShiftCipher(shiftMessage, shift);

        Assertions.assertNotNull(result);


    }

}
