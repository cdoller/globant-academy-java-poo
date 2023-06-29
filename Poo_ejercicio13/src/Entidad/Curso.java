package Entidad;

public class Curso {

    private String nombreCurso;
    private int cantHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, int cantHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora) {
        this.nombreCurso = nombreCurso;
        this.cantHorasPorDia = cantHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantHorasPorDia() {
        return cantHorasPorDia;
    }

    public void setCantHorasPorDia(int cantHorasPorDia) {
        this.cantHorasPorDia = cantHorasPorDia;
    }

    public int getCantDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "nombreCurso=" + nombreCurso + ", cantHorasPorDia=" + cantHorasPorDia + ", cantidadDiasPorSemana=" + cantidadDiasPorSemana + ", turno=" + turno + ", precioPorHora=" + precioPorHora + ", alumnos=" + alumnos + '}';
    }

}
