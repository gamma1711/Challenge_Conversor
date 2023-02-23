package Challenge_Convertidor;

public class Convertir_Distancia {

    private final int caso;
    private final double cantidad;

    public Convertir_Distancia(int caso, double cantidad) {
        this.caso = caso;
        this.cantidad = cantidad;
    }

    public double convertir() {

        double milla = 1609.34;
        double yarda = 0.9144;
        double pie = 0.3048;
        double pulgada = 0.0254;

        return switch (this.caso) {
            case 1 -> this.cantidad / milla;    //de metro a milla
            case 2 -> this.cantidad / yarda;    //de metro a yarda
            case 3 -> this.cantidad / pie;      //de metro a pie
            case 4 -> this.cantidad / pulgada;  //de metro a pulgada
            case 5 -> this.cantidad * milla;    //de milla a metro
            case 6 -> this.cantidad * yarda;    //de yarda a metro
            case 7 -> this.cantidad * pie;      //de pie a metro
            case 8 -> this.cantidad * pulgada;  //de pulgada a metro
            default -> 0.0;
        };
    }
}