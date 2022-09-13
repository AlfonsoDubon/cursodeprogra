public class CL_Vehiculo {
    private Integer id;
    private String nombre;
    private String modelo;
    private Integer anho;
    private String color;

    private String Servico;

    public CL_Vehiculo(Integer id, String nombre, String modelo, Integer anho, String color, String servico) {
        this.id = id;
        this.nombre = nombre;
        this.modelo = modelo;
        this.anho = anho;
        this.color = color;
        Servico = servico;
    }

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
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Integer getAnho() {
        return anho;
    }
    public void setAnho(Integer anho) {
        this.anho = anho;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getServico() {
        return Servico;
    }

    public void setServico(String servico) {
        Servico = servico;
    }
}
