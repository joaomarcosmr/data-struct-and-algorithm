package chall_66_plusOne;

import java.math.BigInteger;

public class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int n : digits) {
            sb.append(String.valueOf(n));
        }

        BigInteger resultado = new BigInteger(sb.toString());
        resultado = resultado.add(BigInteger.ONE);

        String resultadoStr = String.valueOf(resultado);
        int[] array = new int[resultadoStr.length()];

        for (int counte = 0; counte < resultadoStr.length(); counte++) {
            array[counte] = Character.getNumericValue(resultadoStr.charAt(counte));
        }

        return array;
    }

    // better solution using a for loop with a pointer
    public int[] plusOneBetter(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] resultado = new int[digits.length + 1];
        resultado[0] = 1;
        return resultado;
    }
}