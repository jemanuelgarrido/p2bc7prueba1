package pkgAlumnos;

public class CursoAsignado {
    private int codigocurso;
    private  String nombreCurso;
    private double costoCurso;

    public int getCodigocurso() {
        return codigocurso;
    }

    public void setCodigocurso(int codigocurso) {
        this.codigocurso = codigocurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public double getCostoCurso() {
        return costoCurso;
    }

    public void setCostoCurso(double costoCurso) {
        this.costoCurso = costoCurso;
    }

    public  CursoAsignado(int codigo, String nombre, double costo){
        this.codigocurso=codigo;
        this.nombreCurso=nombre;
        this.costoCurso=costo;
    }

}
