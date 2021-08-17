import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Endereco {

    public static void main(String[] args){
        //Solicitar o nome completo do cliente
        //Solicitar o logradouro numero, bairro, cidade, estado, cep
        //Exibir as informações formatadas

        System.out.println("----Cadastro de clientes------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();//NextLine Permite que incerte varias palavras no scanner

        System.out.print("Digite seu endereço: ");
        String endereco = scanner.nextLine();

        System.out.print("Digite o numero: ");
        String numero  = scanner.nextLine();

        System.out.println("Complemento: ");
        String complemento = scanner.nextLine();

        System.out.print("Digite se CEP: ");
        String cep = scanner.nextLine();

        System.out.print("Digite seu bairro: ");
        String bairro = scanner.nextLine();

        System.out.print("Digite sua cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Digite seu estado: ");
        String estado = scanner.nextLine();


        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco + ", " + numero + ", " + complemento);
        System.out.println("CEP: " + cep);
        System.out.println("Bairro: " + bairro);
        System.out.println("Cidade: " + cidade + ", " + estado );

    }
}
