public class Hotel{

    protected String nombre_hotel;
    protected String direccion_hotel;
    protected String telefono_hotel;
    protected String correo_hotel;
    String numero_habitaciones;
    String oe;
    string l;
    
    
    public Hotel(String hotelNombre, String hotelDireccion, String hotelTelefono, String hotelCorreo, String habitacionesnum ) {
        this.nombre_hotel = hotelNombre;
        this.direccion_hotel = hotelDireccion;
        this.telefono_hotel = hotelTelefono;
        this.correo_hotel = hotelCorreo;
        this.numero_habitaciones = habitacionesnum;
    }

    public String getNombreHotel(){return nombre_hotel;}
    public String getDireccionHotel(){return direccion_hotel;}
    public String getTelefonoHotel(){return telefono_hotel;}
    public String getCorreoHotel(){return correo_hotel;}
    public String getNumeroHabitaciones(){return numero_habitaciones;}
     
     
    public String getNombreCompleto() {
        return nombre_hotel;
    }

    public String getInfo(){
        return direccion_hotel + " " + telefono_hotel + " " + correo_hotel + " " + numero_habitaciones;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombreCompleto());
        System.out.println("Informacion hotel: " + getInfo());
    }

}

public class TiposHotel{
  private int estrellas;
    private String tipo; // Ej: "Resort", "Boutique", "Negocios"
    private double precioPorNoche;
    String oelo;
    String aveces;
    String celular;

    public TiposHotel(String nombre, String direccion, String telefono, String correo,
                      int habitaciones, int estrellas, String tipo, double precio) {
        
        super(nombre, direccion, telefono, correo, habitaciones);
        this.estrellas = estrellas;
        this.tipo = tipo;
        this.precioPorNoche = precio;
    }

    public int getEstrellas() { return estrellas; }
    public String getTipo() { return tipo; }
    public double getPrecioPorNoche() { return precioPorNoche; }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: " + tipo);
        System.out.println("Estrellas: " + estrellas);
        System.out.println("Precio por noche: $" + precioPorNoche);
    }
}


