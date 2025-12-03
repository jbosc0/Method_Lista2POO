public class TudoMaiuscula extends ProcessadorTexto {

    public static String converterTextoEmMaiusculo(String entrada) {
        return new TudoMaiuscula().processar(entrada);
    }

    @Override
    protected char[] converterCaracteres(char[] chars) {
        char[] resultado = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            resultado[i] = Character.toUpperCase(chars[i]);
        }
        return resultado;
    }
}
