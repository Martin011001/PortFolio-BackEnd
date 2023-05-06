package com.SpringBoot.Portofolio.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Educacion {
    
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Long id;
   private String descripcion;
   private String imgInstitucion;
   //private Puesto[] puestos;
   //private Herramienta[] herramientas;
   private Long inicio;
   private Long fin;
}
