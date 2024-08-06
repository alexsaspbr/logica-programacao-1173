import ada.modelos.Pessoa;
import ada.modelos.PessoaFisica;
import ada.utilitario.Util;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Alex", "alex@ada.tech");
        PessoaFisica pessoaFisica = new PessoaFisica("Alex", "alex@ada.tech");

        pessoa.getNome();
        pessoaFisica.getNome();
/*        pessoa.metodoDefault();
        pessoa.ninguemVaiAcessarSomentePessoa();
        pessoaFisica.getEmail();*/

        //Util.SELIC = 2d;

        //System.out.println(Util.leituraEscrita("Qual o seu nome?"));
        Util.escrita(Util.leitura("Qual o seu nome?"));
    }


}
