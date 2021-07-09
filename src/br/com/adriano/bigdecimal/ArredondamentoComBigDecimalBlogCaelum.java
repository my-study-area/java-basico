package br.com.adriano.bigdecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ArredondamentoComBigDecimalBlogCaelum {
    public static void main(String[] args) {
        //RUIM
        double d1 = 0.1;
        double d2 = 0.2;
        System.out.println(d1 + d2); // 0.30000000000000004

        //RUIM
        //Não use o contrutor BigDecimal recebendo um double como parâmetro
        BigDecimal big1 = new BigDecimal(0.1);
        BigDecimal big2 = new BigDecimal(0.2);
        System.out.println(big1.add(big2)); //0.3000000000000000166533453693773481063544750213623046875

        //BOM
        // Use o construtor de BigDecimal com String como parâmetro
        BigDecimal bigUm = new BigDecimal("0.1");
        BigDecimal bigDois = new BigDecimal("0.2");
        System.out.println(bigUm.add(bigDois)); //0.3

        //RUIM
        BigDecimal num1 = new BigDecimal("1");
        BigDecimal num2 = new BigDecimal("3");
        /*
         System.out.println(num1.divide(num2));
         Exception in thread "main" java.lang.ArithmeticException:
         Non-terminating decimal expansion; no exact representable decimal result.
         */

        //BOM
        System.out.println(num1.divide(num2, 3,RoundingMode.UP));
    }

}
