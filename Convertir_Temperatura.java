package Challenge_Convertidor;

public class Convertir_Temperatura {

    private final int caso;
    private final double cantidad;

    public Convertir_Temperatura(int caso, double cantidad) {
        this.caso = caso;
        this.cantidad = cantidad;
    }

    public double convertir() {
        return switch (this.caso) {
            case 0 -> (this.cantidad * 9/5) + 32;           //de celcius a farenheit
            case 1 -> this.cantidad + 273.15;               //de celsius a kelvin
            case 2 -> (this.cantidad - 32) * 9/5;           //de farenheit a celsius
            case 3 -> this.cantidad + 237.15;               //kelvin a celsius
            case 4 -> (this.cantidad - 273.15) * 9/5 + 32;  //de kelvin a farenheit
            case 5 -> (this.cantidad - 32) * 5/9 + 273.15;  //de farenheit a kelvin
            default -> 0.0;
        };
    }
}
