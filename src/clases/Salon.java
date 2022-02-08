
package clases;


public class Salon {
    
    private int idSalon;
    private String nombreSalon;

    public Salon() {
    }

    public Salon(int idSalon, String nombreSalon) {
        this.idSalon = idSalon;
        this.nombreSalon = nombreSalon;
    }

    public int getIdSalon() {
        return idSalon;
    }

    public void setIdSalon(int idSalon) {
        this.idSalon = idSalon;
    }

    public String getNombreSalon() {
        return nombreSalon;
    }

    public void setNombreSalon(String nombreSalon) {
        this.nombreSalon = nombreSalon;
    }
    
    
    
}
