import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Pessoa pessoa = new Pessoa();
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome:");
            pessoa.setNome(sc.next());
            System.out.print("Idade:");
            pessoa.setIdade(sc.nextInt());
            System.out.print("Altura: ");
            pessoa.setAltura(sc.nextDouble());

            pessoas.add(pessoa);
        }

        double somaAltura = 0.0;

        for(Pessoa pessoa: pessoas){
            somaAltura+= pessoa.getAltura();
        }

        System.out.printf("Altura média: %.2f%n", somaAltura/n);

        ArrayList<String> guardaNome = new ArrayList<>();

        for(Pessoa pessoa: pessoas){
            if(pessoa.getIdade()<16){
                guardaNome.add(pessoa.getNome());
            }
        }
        System.out.println("Pessoas com menos de 16 anos: "+guardaNome.size()/n*100 +"%");
        guardaNome.forEach(nome ->{
            System.out.println(nome);
        });

        sc.close();
    }
}
