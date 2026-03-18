import java.time.LocalTime;
public class Vuelo {
    protected int idVuelos;
    protected String aerolinea;
    protected String destino;
    protected String origen;
    protected String fecha;
    protected String sillas;
    protected LocalTime horaLocalTime;
    protected float precio;

    public Vuelo(int idVuelos, String aerolinea, String destino, String origen,  String fecha, String sillas, LocalTime horaLocalTime, float precio) {
        this.idVuelos = idVuelos;
        this.aerolinea = aerolinea;
        this.destino = destino;
        this.origen = origen;
        this.fecha = fecha;
        this.sillas = sillas;
        this.horaLocalTime = horaLocalTime;
        this.precio = precio;
    }

public int getIdVuelos() {return idVuelos;}
public String getDestino() {return destino;}
public String getOrigen() {return origen;}
public String getFecha() {return fecha;}
public String getSillas() {return sillas;}
public LocalTime getHoraLocalTime() {return horaLocalTime;}
public float getPrecio() {return precio;}

    void obtenerVuelo() {
        System.out.println("----- INFORMACIÓN DEL VUELO -----");
        System.out.println("ID:" idVuelos + "Aerolínea:" aerolinea +"Destino :"+destino+ " Origen:"
        +origen + "Fecha:" + fecha +"Numero de asientos: "+ sillas +" Hora:" + horaLocalTime  +" Precio: $" + precio);
    }
}
