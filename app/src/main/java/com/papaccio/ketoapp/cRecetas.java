package com.papaccio.ketoapp;

public class cRecetas {

    //ATRIBUTOS
    private int cRidReceta;
    private String cRnombre;
    private int cRidCategory;
    private  String cRdescripcion;
    private int cRfoto;
    private int cRvaloracion;

    //CONSTRUCTOR VACIO
    public cRecetas() {
    }

    //CONSTRUCTOR CON PARAMETROS
    public cRecetas(int cRidReceta, String cRnombre, int cRidCategory, String cRdescripcion, int cRfoto, int cRvaloracion) {
        this.cRidReceta = cRidReceta;
        this.cRnombre = cRnombre;
        this.cRidCategory = cRidCategory;
        this.cRdescripcion = cRdescripcion;
        this.cRfoto = cRfoto;
        this.cRvaloracion = cRvaloracion;
    }


    //GETTERS
    public int getcRidReceta() {
        return cRidReceta;
    }

    public String getcRnombre() {
        return cRnombre;
    }

    public int getcRidCategory() {
        return cRidCategory;
    }

    public String getcRdescripcion() {
        return cRdescripcion;
    }

    public int getcRfoto() {
        return cRfoto;
    }

    public int getcRvaloracion() {
        return cRvaloracion;
    }

    //SETTERS


    public void setcRidReceta(int cRidReceta) {
        this.cRidReceta = cRidReceta;
    }

    public void setcRnombre(String cRnombre) {
        this.cRnombre = cRnombre;
    }

    public void setcRidCategory(int cRidCategory) {
        this.cRidCategory = cRidCategory;
    }

    public void setcRdescripcion(String cRdescripcion) {
        this.cRdescripcion = cRdescripcion;
    }

    public void setcRfoto(int cRfoto) {
        this.cRfoto = cRfoto;
    }

    public void setcRvaloracion(int cRvaloracion) {
        this.cRvaloracion = cRvaloracion;
    }





}
