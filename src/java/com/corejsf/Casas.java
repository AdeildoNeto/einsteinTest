/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class Casas implements Serializable{
    
     private List<Casa> casas = new ArrayList<>();

    // private Casa casa = new Casa();
    private Casa primeiraCasa = new Casa();
    
    private Casa segundaCasa = new Casa();
    
    private Casa terceiraCasa = new Casa();
    
    private Casa quartaCasa = new Casa();
    
    private Casa quintaCasa = new Casa();
    
    private Casa foraDoBairro = new Casa();
    
    
    
    public Casas(){
        
        primeiraCasa.setVizinhoEsquerdo(foraDoBairro);
        primeiraCasa.setVizinhoDireito(segundaCasa);
        
        segundaCasa.setVizinhoDireito(terceiraCasa);
        segundaCasa.setVizinhoEsquerdo(primeiraCasa);
        
        terceiraCasa.setVizinhoDireito(quartaCasa);
        terceiraCasa.setVizinhoEsquerdo(segundaCasa);
        
        quartaCasa.setVizinhoDireito(quintaCasa);
        quartaCasa.setVizinhoEsquerdo(terceiraCasa);
        
        quintaCasa.setVizinhoDireito(foraDoBairro);
        quintaCasa.setVizinhoEsquerdo(quartaCasa);
        
        casas.add(primeiraCasa);
        casas.add(segundaCasa);
        casas.add(terceiraCasa);
        casas.add(quartaCasa);
        casas.add(quintaCasa);
    }

    public List<Casa> getCasas() {
        return casas;
    }

    public void setCasas(List<Casa> casas) {
        this.casas = casas;
    }

    public Casa getPrimeiraCasa() {
        return primeiraCasa;
    }

    public void setPrimeiraCasa(Casa primeiraCasa) {
        this.primeiraCasa = primeiraCasa;
    }

    public Casa getSegundaCasa() {
        return segundaCasa;
    }

    public void setSegundaCasa(Casa segundaCasa) {
        this.segundaCasa = segundaCasa;
    }

    public Casa getTerceiraCasa() {
        return terceiraCasa;
    }

    public void setTerceiraCasa(Casa terceiraCasa) {
        this.terceiraCasa = terceiraCasa;
    }

    public Casa getQuartaCasa() {
        return quartaCasa;
    }

    public void setQuartaCasa(Casa quartaCasa) {
        this.quartaCasa = quartaCasa;
    }

    public Casa getQuintaCasa() {
        return quintaCasa;
    }

    public void setQuintaCasa(Casa quintaCasa) {
        this.quintaCasa = quintaCasa;
    }
    
}
