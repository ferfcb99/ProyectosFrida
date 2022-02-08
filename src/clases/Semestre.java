package clases;

public class Semestre {
    private int no; // 1
    private String descripcion; // PRimer semestre

    public Semestre() {
    }

    public Semestre(int no, String descripcion) {
        this.no = no;
        this.descripcion = descripcion;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
