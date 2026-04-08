public class Util {
    /**
     * metodo que recebe o cpf e verifica se ele é valido, retorna true se for valido e false caso contrario
     * @param cpf cpf - numero identificador pessoa fisica
     * @return true se cpf valido
     */
    public static boolean cpfValido(String cpf) {
        // remove pontos e traço, caso venham no CPF
        cpf = cpf.replaceAll("\\D", "");

        // verifica se tem 11 digitos
        if (cpf.length() != 11) {
            return false;
        }

        // verifica se todos os numeros sao iguais
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // calcula o primeiro digito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }

        int primeiroDigito = 11 - (soma % 11);
        if (primeiroDigito >= 10) {
            primeiroDigito = 0;
        }

        // calcula o segundo digito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }

        int segundoDigito = 11 - (soma % 11);
        if (segundoDigito >= 10) {
            segundoDigito = 0;
        }

        // compara com os digitos informados no CPF
        return primeiroDigito == (cpf.charAt(9) - '0') &&
               segundoDigito == (cpf.charAt(10) - '0');
    }
}