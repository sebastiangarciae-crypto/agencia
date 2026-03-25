public class Reserva {
    private String nombreCliente;
    private int dias;
    private double precioPorNoche;

    public Reserva(String nombreCliente, int dias, double precioPorNoche) {
        this.nombreCliente = nombreCliente;
        this.dias = dias;
        this.precioPorNoche = precioPorNoche;
    }

    public double calcularCostoTotal() {
        return dias * precioPorNoche;
    }

    public void mostrarDetalles() {
        System.out.println("===== DETALLES DE LA RESERVA =====");
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Días de estadía: " + dias);
        System.out.println("Precio por noche: $" + precioPorNoche);
        System.out.println("Total a pagar: $" + calcularCostoTotal());
    }
}