package gvsucis;

/**
 * @author Zachary Kurmas
 */
// Created  8/26/13 at 11:17 AM
// (C) Zachary Kurmas 2013

public class BaseConverter {

   /**
    * Convert a lower-case {@code char} to its corresponding integer value (assuming 'a' -> 10, 'b' -> 11, etc.)
    * @param c The input {@code char}
    * @return the corresponding integer value.
    */
   public static int charToValue(char c) {
      if (c >= '0' && c <= '9') {
         return c - '0';
      } else {
         return (c - 'a') + 10;
      }
   }

   /**
    * Converts the given {@code input} from {@code base_in} to {@code base_out}.
    *
    * @param input    the number to be converted
    * @param base_in  the base of the given number
    * @param base_out the desired base of the output
    * @return the number {@code input} represented in {@code base_out}
    * @throws IllegalArgumentException if either (1) {@code input} is not a valid {@code base_in} number,
    *                                  (2) either {@code base_in} or {@code base_out} are not in the range {@code [2, 36]}
    */
   public static String convert(String input, int base_in, int base_out) {

      if (base_in < 2 || base_in > 36) {
         throw new IllegalArgumentException("Base must be in the range [0, 36]");
      }

      if (base_out < 2 || base_out > 36) {
         throw new IllegalArgumentException("Base must be in the range [0, 36]");
      }

      // TODO: Your work here

      return "";
   }
}
