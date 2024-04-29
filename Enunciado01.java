package PracticaCalificada;

import java.text.DecimalFormat; // Importa la clase DecimalFormat para formatear números
import java.util.Scanner;

public class Enunciado01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();

        // Solicita al usuario la cantidad de unidades adquiridas
        System.out.print("Ingrese la cantidad de unidades adquiridas: ");
        int cantidad = scanner.nextInt();

        // Calcula el importe de la compra
        double importeCompra = calcularImporteCompra(precio, cantidad);
        // Calcula el importe del primer descuento
        double primerDescuento = calcularPrimerDescuento(importeCompra);
        // Calcula el importe del segundo descuento como el 7% del primer descuento
        double segundoDescuento = calcularSegundoDescuento(primerDescuento);
        // Calcula el importe del descuento total sumando el primer y segundo descuento
        double descuentoTotal = calcularDescuentoTotal(primerDescuento, segundoDescuento);
        // Calcula el importe a pagar restando el descuento total del importe de la compra
        double importePagar = calcularImportePagar(importeCompra, descuentoTotal);

        // Crea un objeto DecimalFormat para formatear números con dos decimales
        DecimalFormat df = new DecimalFormat("#.##");

        // Imprime los resultados con un máximo de dos decimales
        System.out.println("Importe de la compra: " + df.format(importeCompra));
        System.out.println("Importe del primer descuento: " + df.format(primerDescuento));
        System.out.println("Importe del segundo descuento: " + df.format(segundoDescuento));
        System.out.println("Importe del descuento total: " + df.format(descuentoTotal));
        System.out.println("Importe a pagar: " + df.format(importePagar));
    }

    // Método para calcular el importe de la compra
    static double calcularImporteCompra(double precio, int cantidad) {
        return precio * cantidad; // Multiplica el precio por la cantidad para obtener el importe total
    }

    // Método para calcular el importe del primer descuento
    static double calcularPrimerDescuento(double importeCompra) {
        return 0.07 * importeCompra; // Calcula el 7% del importe de la compra
    }

    // Método para calcular el importe del segundo descuento
    static double calcularSegundoDescuento(double primerDescuento) {
        return 0.07 * primerDescuento; // Calcula el 7% del primer descuento
    }

    // Método para calcular el importe del descuento total
    static double calcularDescuentoTotal(double primerDescuento, double segundoDescuento) {
        return primerDescuento + segundoDescuento; // Suma los dos descuentos para obtener el descuento total
    }

    // Método para calcular el importe a pagar
    static double calcularImportePagar(double importeCompra, double descuentoTotal) {
        return importeCompra - descuentoTotal; // Resta el descuento total del importe de la compra para obtener el importe a pagar
    }
}