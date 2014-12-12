package com.titanic.ventapasajes.modelo;

public enum TipoPlanta {
	UNA_PLANTA("1 PLANTA"), DOS_PLANTA("2 PLANTA");
	
	
	private String descripcion;

    TipoPlanta(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return descripcion;
    }
		
}
