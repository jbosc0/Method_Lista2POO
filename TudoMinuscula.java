public class TudoMinuscula extends ProcessadorTexto {

    public static String converterTextoEmMinusculo(String entrada) {
        return new TudoMinuscula().processar(entrada);
    }

    @Override
    protected char[] converterCaracteres(char[] chars) {
        char[] resultado = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            resultado[i] = Character.toLowerCase(chars[i]);
        }
        return resultado;
    }
}
