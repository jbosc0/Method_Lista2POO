public class Main {
    public static void main(String[] args) {

        String entrada = "Texto de Exemplo ABC xyz";

        String maiusculo = TudoMaiuscula.converterTextoEmMaiusculo(entrada);
        String minusculo = TudoMinuscula.converterTextoEmMinusculo(entrada);

        System.out.println("Original:  " + entrada);
        System.out.println("Maiúsculo: " + maiusculo);
        System.out.println("Minúsculo: " + minusculo);
    }
}
