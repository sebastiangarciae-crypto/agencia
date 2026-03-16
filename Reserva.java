

public class Reserva{

    protected Cliente cliente;
    protected Hotel hotel;
    protected Vuelo vuelo;
    protected String fechaReserva;

    public Reserva(Cliente cliente, Hotel hotel, Vuelo vuelo, String fechaReserva){
        this.cliente = cliente;
        this.hotel = hotel;
        this.vuelo = vuelo;
        this.fechaReserva = fechaReserva;
    }

    public Cliente getCliente(){return cliente;}
    public Hotel getHotel(){return hotel;}
    public Vuelo getVuelo(){return vuelo;}
    public String getFechaReserva(){return fechaReserva;}

    public void mostrarInfo(){
        System.out.println("=== Reserva ===");
        System.out.println("Fecha de reserva: " + fechaReserva);
        cliente.mostrarInfo();
        hotel.mostrarInfo();
        vuelo.mostrarInfo();
    }
}

