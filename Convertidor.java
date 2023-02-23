package Challenge_Convertidor;

import javax.swing.*;

public class Convertidor {

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ex) {
            System.out.println("Error");
        }

        int tipoConversion;
        double cantidad;
        int continuar;

        String[] conversionMoneda = {"De peso a dolar", "De peso a euro", "De peso a libra", "De peso a yen", "De peso a won", "De dolar a peso", "De euro a peso", "De libra a peso", "De yen a peso", "De won a peso"};
        String[] conversionTemperatura = {"De celsius a farenheit", "De celsius a kelvin", "De farenheit a celcius", "De kelvin a celsius", "De kelvin a farenheit", "De farenheit a kelvin"};
        String[] convertidorDistacia = {"De metro a milla", "De metro a yarda", "De metro a pie", "De metro a pulgada", "De milla a metro", "De yarda a metro", "De pie a metro", "De pulgada a metro"};
        String[] conversor = {"Conversor de moneda", "Conversor de temperatura", "Conversor de distacia"};

        do {
            int seleccionConversor = dialogOptions("Seleccione una opción de conversión", conversor);

            switch (seleccionConversor) {
                case 0 -> {
                    tipoConversion = dialogOptions("Elige la moneda a la que desea convertir su dinero", conversionMoneda);
                    try {
                        cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir:"));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Ingrese los valores correctamente", "Error :(", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                    new Convertidor().mostrarResultado(new Convertir_Moneda(tipoConversion, cantidad).convertir());
                }
                case 1 -> {
                    tipoConversion = dialogOptions("Seleccione el tipo de conversión", conversionTemperatura);
                    try {
                        cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a convertir"));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Ingrese los valores correctamente", "Error :(", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                    new Convertidor().mostrarResultado(new Convertir_Temperatura(tipoConversion, cantidad).convertir());
                }
                case 2 -> {
                    tipoConversion = dialogOptions("Seleccione el tipo de conversión", convertidorDistacia);
                    try {
                        cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a convertir"));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Ingrese los valores correctamente", "Error :(", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                    new Convertidor().mostrarResultado(new Convertir_Distancia(tipoConversion, cantidad).convertir());
                }
            }

            continuar = JOptionPane.showConfirmDialog(null, "¿Desea hacer otra accion?", "Continuar",JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
        } while(continuar == 0);
        JOptionPane.showMessageDialog(null, "Programa finalizado, Gracias :D","Finalizado" ,JOptionPane.INFORMATION_MESSAGE);
    }

    public static int dialogOptions(String mensage, String[] items) {

        String opcion = (String) JOptionPane.showInputDialog(null, mensage, "Menu", JOptionPane.QUESTION_MESSAGE, null, items, items[0]);

        for (int index=0; index<items.length; index++) {
            if (items[index].equals(opcion))
                return index;
        }
        return -1;
    }

    public void mostrarResultado(double resultado) {
        JOptionPane.showMessageDialog(null, "Total convertido: " + String.format("%.2f", resultado), "Resulatado", JOptionPane.INFORMATION_MESSAGE);
    }
}