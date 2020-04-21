package tareaarray;

public class Empleado {
    
    private String nombre;
    private String departamento;
    private int sueldoDiario;
    private int diasTrabajados;
    private int horasExtra;
    private int sueldoMensual;
    private int montoHorasExtra;
    private int salarioTotall;
    
    
    public Empleado() {
    }

    public Empleado(String nombre, String departamento, int sueldoDiario, int diasTrabajados, int horasExtra) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.sueldoDiario = sueldoDiario;
        this.diasTrabajados = diasTrabajados;
        this.horasExtra = horasExtra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getSueldoDiario() {
        return sueldoDiario;
    }

    public void setSueldoDiario(int sueldoDiario) {
        this.sueldoDiario = sueldoDiario;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }
    
    public int sueldoMensual (){
        sueldoMensual=sueldoDiario*diasTrabajados;
        return sueldoMensual;
    }
    
    public int montoHorasE(){
        montoHorasExtra=horasExtra*85;
        return montoHorasExtra;
    }
    
    public int salarioTotal(){
        salarioTotall=sueldoMensual+montoHorasExtra;
        return salarioTotall;
    }
    
    
    @Override
    public String toString() {
        return  "Nombre: " + nombre + "\nDepartamento: " + departamento + "\nSueldo diario: $" + sueldoDiario 
                + "\nDías trabajados: " + diasTrabajados + "\nHoras extra de trabajo: " 
                + horasExtra;
    }
  
}

