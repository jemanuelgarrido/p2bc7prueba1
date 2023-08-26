package edu.ejercicios;

import pkgAlumnos.Alumno;
import pkgAlumnos.CursoAsignado;

public class Main {
    public static void main(String[] args) {
        CursoAsignado curso1=new CursoAsignado(101,"Programacion",500);
        CursoAsignado curso2=new CursoAsignado(105,"Derecho",1);
        CursoAsignado curso3=new CursoAsignado(10,"Programacion",500);

        Alumno al1=new Alumno("2023015","Andrea","54673452","5tacalle");
        al1.agregarCursoAsignado(curso2);
        al1.agregarCursoAsignado(curso3);
        al1.mostrarInformacion();

    }
}