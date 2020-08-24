package gvsucis;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BaseConverterStudentTest {

  @Test
  public void convertsZero() {
    assertEquals("0", BaseConverter.convert("0", 10, 2));
  }

  @ParameterizedTest
  @CsvSource({ "0, 0",
               "1, 1",
               "2, 10",
               "5, 101" })
  public void base10ToBinary(String input, String expectedOutput) {
    assertEquals(expectedOutput, BaseConverter.convert(input, 10, 2));
  }

  @ParameterizedTest
  @CsvSource({ "0, 0",
               "1, 1",
               "10, 2", 
               "101, 5" })
  public void binaryToBase10(String input, String expectedOutput) {
    assertEquals(expectedOutput, BaseConverter.convert(input, 2, 10));
  }

  @ParameterizedTest
  @CsvSource({ "0, 0",
               "1, 1",
               "10, 3",
               "11, 4",
               "120, f",
               "121, 10" })
  public void baseThreeToHex(String input, String expectedOutput) {
    assertEquals(expectedOutput, BaseConverter.convert(input, 3, 16));
  }
}