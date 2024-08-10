package ada.tratamentoerros;

public class TratamentoErros {

    public void tratarErroChecked() throws ContaEnquadradaException {

        /*

        controller x
        business-object v
        service x
            repository x
            s3 x


         */

        String statusConta = "Enquadrado";

        try {
            if("Enquadrado".equalsIgnoreCase(statusConta)) {
                throw new ContaEnquadradaException("Cliente com conta enquadrada.");
            }
            System.out.println("Cliente realizou compra");
        } catch (Exception e) {
            throw e;
        } finally {
            System.out.println("Sempre termina aqui");
        }

    }

    public void tratarErroUnChecked() {
        int x = 0;
        int y = 10;
        int z = y / x;
    }

}
