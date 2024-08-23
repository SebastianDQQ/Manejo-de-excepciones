public class CadenaCa {

    public static char caracterEn(String Cadena, int Posicion) throws Exception {
        if (Posicion >= 0 && Posicion < Cadena.length()) {
            return Cadena.charAt(Posicion);
        } else {
            throw new Exception("La posición se encuentra fuera del rango de la cadena.");
        }
    }
}
