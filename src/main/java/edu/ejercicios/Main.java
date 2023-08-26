package edu.ejercicios;

import pkgAlumnos.Alumno;
import pkgAlumnos.CursoAsignado;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CursoAsignado>cat_cursos= new ArrayList<>();
        cat_cursos.add(new CursoAsignado(101,"Programacion",500));
        cat_cursos.add(new CursoAsignado(105,"Derecho",1));
        cat_cursos.add(new CursoAsignado(110,"Estadistica",500));
        cat_cursos.add(new CursoAsignado(112,"Electroestatica",1));

//        CursoAsignado curso1=new CursoAsignado(101,"Programacion",500);
//        CursoAsignado curso2=new CursoAsignado(105,"Derecho",1);
//        CursoAsignado curso3=new CursoAsignado(10,"Estadistica",500);
//        CursoAsignado curso4= new CursoAsignado(120,"Electroestatica",750);

        Alumno al1=new Alumno("2023015","Andrea","54673452","5tacalle 8-36 zona 2, Villa Nueva");
//        al1.agregarCursoAsignado(curso2);
//        al1.agregarCursoAsignado(curso3);
//        al1.agregarCursoAsignado(curso4);
        al1.agregarCursoAsignado(cat_cursos.get(1));
        System.out.println("Tota; del Alumno"+al1.getNombre()+"Q"+al1.getTotalCurso());

   Alumno al2=new Alumno("2020055","Monica","097675434","5tacalle zona 4,Santa Cruz");
//     al2.agregarCursoAsignado(curso1);
//        al2.agregarCursoAsignado(curso4);
//       al2.agregarCursoAsignado(curso2);
        al1.agregarCursoAsignado(cat_cursos.get(1));
        System.out.println("Tota; del Alumno"+al2.getNombre()+"Q"+al2.getTotalCurso());

    System.out.println(al1.getTotalCurso()+al2.getNombre()+al2.getTotalCurso());

        //a. Crear 2 alumnos y asignar los cursos que queremos, al final sacar un reporte de cuanto paga cada alumno de matricula, al final cuanto es el total y el total individual de cada uno y al final cuanto paga  la universidad.

    }
}