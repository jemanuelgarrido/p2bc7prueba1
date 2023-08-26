package edu.ejercicios;

import pkgAlumnos.Alumno;
import pkgAlumnos.CursoAsignado;

public class Main {
    public static void main(String[] args) {
        CursoAsignado curso1=new CursoAsignado(101,"Programacion",500);
        CursoAsignado curso2=new CursoAsignado(105,"Derecho",1);
        CursoAsignado curso3=new CursoAsignado(10,"Estadistica",500);
        CursoAsignado curso4= new CursoAsignado(120,"Electroestatica",750);

        Alumno al1=new Alumno("2023015","Andrea","54673452","5tacalle 8-36 zona 2, Villa Nueva");
        al1.agregarCursoAsignado(curso2);
        al1.agregarCursoAsignado(curso3);
        al1.agregarCursoAsignado(curso4);
        for (CursoAsignado curso : al1.getCursoAsignados()){
            System.out.println("Nombre del curso"+curso.getNombreCurso());
            System.out.println("Costo"+curso.getCostoCurso());
        }
//        Alumno al2=new Alumno("2020055","Monica","097675434","5tacalle zona 4,Santa Cruz");
//        al2.agregarCursoAsignado(curso1);
//        al2.agregarCursoAsignado(curso4);
//        al2.agregarCursoAsignado(curso2);
//        al2.mostrarInformacion();

        //a. Crear 2 alumnos y asignar los cursos que queremos, al final sacar un reporte de cuanto paga cada alumno de matricula, al final cuanto es el total y el total individual de cada uno y al final cuanto paga  la universidad.

    }
}