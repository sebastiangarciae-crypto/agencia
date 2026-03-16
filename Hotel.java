
public class Hotel{

    protected String nombre;
    protected String ciudad;
    protected int estrellas;
    protected double precioPorNoche;

    public Hotel(String nombre, String ciudad, int estrellas, double precioPorNoche){
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.estrellas = estrellas;
        this.precioPorNoche = precioPorNoche;
    }

    public String getNombre(){return nombre;}
    public String getCiudad(){return ciudad;}
    public int getEstrellas(){return estrellas;}
    public double getPrecioPorNoche(){return precioPorNoche;}

    public void mostrarInfo(){
        System.out.println("Hotel: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Estrellas: " + estrellas);
        System.out.println("Precio por noche: " + precioPorNoche);
    }
}
