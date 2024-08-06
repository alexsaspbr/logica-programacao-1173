package ada.modelos;

public class PessoaFisica extends Pessoa {
    public PessoaFisica(String nome, String email) {
        super(nome, email);
    }

    @Override
    protected String getEmail() {
        return super.getEmail();
    }
}
