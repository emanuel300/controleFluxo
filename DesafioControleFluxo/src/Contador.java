import java.util.Locale;
import java.util.Scanner;


class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }
}

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroum = scanner.nextInt();

        System.out.println("Digite o segundo parametro: ");
        int secondparametro = scanner.nextInt();

        try{
            contar(parametroum, secondparametro);
        }
        catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());

        }
    }

    private static void contar(int parametroum, int secondparametro) throws ParametrosInvalidosException {
        if(parametroum >= secondparametro){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

        int contagem = secondparametro - parametroum;
        for(int i = 1; i < contagem; i++){
            System.out.println("Imprimindo o número " + (parametroum + i));
        }


    }
}
