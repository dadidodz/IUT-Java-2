import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {
        Scanner entr�e = new Scanner(System.in);
        System.out.println("Entrer un code d'identification de 4 chiffres : ");
        int code = entr�e.nextInt();
        int somme3PremiersChiffres = code / 1000 + (code / 100) % 10
                + (code / 10) % 10;
        if ((code % 10) == (somme3PremiersChiffres % 7)) {
            System.out.println("*** Code " + code
                    + " correct. Pr�t � photocopier.");
        } else {
            System.out.println("*** Code " + code + " incorrect.");
        }
        entr�e.close();
    }
}
