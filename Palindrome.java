
import java.util.Scanner;

/**
 * Escribe un programa que pida una cadena al usuario y que revise si esta es un
 * palindromo o no y terminar.
 *
 * Un palindromo significa que los caracteres de la cadena son los mismos al
 * leer hacia adelante o hace atras. Debes ignorar los espacios, los acentos,
 * puntuaciones y mayusculas y minusculas.
 *
 * Ejemplos de palindromos: Amor a Roma Bob Somos o no somos Acaso hubo buhos
 * aca. Ana, la tacana catalana racecar was it a car or a cat I saw never odd or
 * even rats live on no evil star
 *
 * El programa debe imprimir true si es un palindromo y false si no lo es.
 */
class Palindrome {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below
        String ss = s.toLowerCase();
        String[] strings = s.split(" ");
        for (int i = 0; i < strings.length; i++) {
            String word = strings[i];

            if (word.contains("á")) {
                word.replace("á", "a");
            }
            if (word.contains("é")) {
                word.replace("é", "e");
            }
            if (word.contains("í")) {
                word.replace("í", "i");
            }
            if (word.contains("ó")) {
                word.replace("ó", "o");
            }
            if (word.contains("ú")) {
                word.replace("ú", "u");
            }

        }

        for (int i = 0, j = ss.length() - 1; i <= j; i++, j--) {
            if (ss.charAt(i) != ss.charAt(j)) {
                System.out.println("false");
                break;
            } else {
                System.out.println("true");
                break;
            }
        }
    }

}
