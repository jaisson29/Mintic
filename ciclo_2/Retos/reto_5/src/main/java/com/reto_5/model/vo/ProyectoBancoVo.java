package com.reto_5.model.vo;

public class ProyectoBancoVo {
    private Integer id;
    private String constructora;
    private String ciudad;
    private String clasificacion;
    private Integer estrato;
    private String lider;
    
    //CONSULTORES
    //GETTERS
    public Integer getId() {
        return id;
    }
    public String getConstructora() {
        return constructora;
    }
    public String getCiudad() {
        return ciudad;
    }
    public String getClasificacion() {
        return clasificacion;
    }
    public Integer getEstrato() {
        return estrato;
    }
    public String getLider() {
        return lider;
    }
    
    //MODIFICADORES
    //SETTERS
    public void setId(Integer id) {
        this.id = id;
    }
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }
    public void setLider(String lider) {
        this.lider = lider;
    }

    @Override
    public String toString() {
        return String.format("%3d %-25s %-20s %-15s %7d %-30s", id, constructora, ciudad,
        clasificacion, estrato, lider);
    }
}
