package ada.modelos;

public class Pessoa {

    private String nome;
    private String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
        ninguemVaiAcessarSomentePessoa();
    }

    public String getNome() {
        ninguemVaiAcessarSomentePessoa();
        return nome;
    }

    public String getNome(String nome) {
        ninguemVaiAcessarSomentePessoa();
        return nome;
    }

    public String getNome(String nome, String sobreNome) {
        ninguemVaiAcessarSomentePessoa();
        return nome;
    }

    protected String getEmail() {
        return email;
    }

    private void ninguemVaiAcessarSomentePessoa() {

    }

    String metodoDefault() {
        return "Metodo default";
    }

}
