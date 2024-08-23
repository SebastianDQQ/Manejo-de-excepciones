public class NumeroNegativoExcepcion extends Exception {

    public NumeroNegativoExcepcion() {
        super("Ha ocurrido un error: Se introdujo un número negativo.");
    }

    public NumeroNegativoExcepcion(String Causa) {
        super(Causa);
    }
}
