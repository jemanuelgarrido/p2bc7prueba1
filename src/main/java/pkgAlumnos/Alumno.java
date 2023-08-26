package pkgAlumnos;

import java.util.ArrayList;

public class Alumno {
    private String carnet;
    private String nombre;
    private String telefono;
    private String direccion;

    private ArrayList<CursoAsignado>cursoAsignados;
    //constructor
    public Alumno (String carnet, String nombre,String telefono, String direccion ){
        this.nombre=nombre;
        this.carnet=carnet;
        this.telefono=telefono;
        this.direccion=direccion;
        this.cursoAsignados= new ArrayList<>();
    }
    public  void agregarCursoAsignado(CursoAsignado curso){
        cursoAsignados.add(curso);
    }
    @Override
    public String toString (){
        return "Carnet:"+this.carnet+"Nombre:"+this.nombre+"telefono"+this.telefono+"direccion"+this.direccion;

    }
    public void mostrarInformacion(){
        System.out.println("nombre:"+nombre);
        System.out.println("Cursos Asignados");
        for (CursoAsignado curso : cursoAsignados){
            System.out.println("Curso:"+curso.getNombreCurso());
            System.out.println("precio"+curso.getCostoCurso());
            System.out.println("------------------------");

        }

    }
    //getters and setters

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<CursoAsignado> getCursoAsignados() {
        return cursoAsignados;
    }

    public void setCursoAsignados(ArrayList<CursoAsignado> cursoAsignados) {
        this.cursoAsignados = cursoAsignados;
    }
}
