package javaClass;


public class classUsuarios {
    private Integer id;
    private String nombre;
    private String apellido;
    private String correo;
    private String fecha;
    private Integer genero;

    //<editor-fold defaultstate="collapsed" desc="Getter and Setter">
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getGenero() {
        return genero;
    }

    public void setGenero(Integer genero) {
        this.genero = genero;
    }
    
    //</editor-fold>
    
    public boolean insert(){
        return methodsSQL.execute("INSERT INTO usuarios VALUES ()", nombre, apellido, correo, fecha, genero);
    }
}
