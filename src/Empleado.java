public class Empleado {
    private int id;
    private String nombre;
    private String apellido;
    private String departamento;
    private double salario;

    public Empleado() {}

    public Empleado(int pId, String pNombre, String pApellido, String pDepartamento, double pSalario) {
        this.id = pId;
        this.nombre = pNombre;
        this.apellido = pApellido;
        this.departamento = pDepartamento;
        this.salario = pSalario;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Apellido: " + apellido + ", Departamento: " + departamento + " Salario: " + salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

