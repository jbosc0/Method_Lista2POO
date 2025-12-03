public abstract class ProcessadorTexto {

    // Template Method
    public final String processar(String entrada) {

        char[] caracteres = extrairCaracteres(entrada);
        char[] modificados = converterCaracteres(caracteres);
        String resultado = juntarCaracteres(modificados);

        return resultado;
    }

    protected char[] extrairCaracteres(String texto) {
        return texto.toCharArray();
    }

    // Passo variado (subclasses implementam)
    protected abstract char[] converterCaracteres(char[] caracteres);

    protected String juntarCaracteres(char[] chars) {
        return new String(chars);
    }
}
