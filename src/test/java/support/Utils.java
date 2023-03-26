package support;

import runner.RunCucumber;

import java.security.SecureRandom;
import java.util.Random;

public class Utils extends RunCucumber {


    public static String getRandomEmail() {
        String email_init = "qazando_";
        String email_final = "@qazando.com.br";

        Random random = new Random();
        int minimo = 1;
        int maximo = 999999999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return email_init + resultado + email_final;
    }

//    public static String generateRandomPassword(){
//        // intervalo ASCII – alfanumérico (0-9, a-z, A-Z)
//        final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
//        int len = 10;
//
//        SecureRandom random = new SecureRandom();
//        StringBuilder sb = new StringBuilder();
//
//        // cada iteração do loop escolhe aleatoriamente um caractere do dado
//        // intervalo ASCII e o anexa à instância `StringBuilder`
//
//        for (int i = 0; i < len; i++)
//        {
//            int randomIndex = random.nextInt(chars.length());
//            sb.append(chars.charAt(randomIndex));
//        }
//
//        return sb.toString();
//    }
}
