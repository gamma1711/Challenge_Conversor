package Challenge_Convertidor;

public class Convertir_Moneda {

    private final int caso;
    private final double cantidad;

    public Convertir_Moneda(int caso, double cantidad) {
        this.caso = caso;
        this.cantidad = cantidad;
    }

    public double convertir() {

        double dolar = 18.38;
        double euro = 19.64;
        double libra = 22.12;
        double yen = 0.14;
        double won = 0.014;

        return switch (this.caso) {
            case 0 -> cantidad / dolar; //de peso a dolar
            case 1 -> cantidad / euro;  //de peso a euro
            case 2 -> cantidad / libra; //de peso a libra
            case 3 -> cantidad / yen;   //de peso a yen
            case 4 -> cantidad / won;   //de peso a won
            case 5 -> cantidad * dolar; //de dolar a peso
            case 6 -> cantidad * euro;  //de euro a peso
            case 7 -> cantidad * libra; //de libra a peso
            case 8 -> cantidad * yen;   //de yen a peso
            case 9 -> cantidad * won;   //de won a peso
            default -> 0.0;
        };
    }
}
