/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public final class Casa implements Serializable {

    private String nomeDaCasa = "";
    private Casa vizinhoEsquerdo;
    private Casa vizinhoDireito;
    private String corDaCasa = "";
    private String nacionalidade = "";
    private String bebida = "";
    private String cigarro = "";
    private String animal = "";
    private int indexDica = 0;

    public Casa() {
    }

    public Casa(String a, String b, String c, String d, String e) {
        Casa casa1;
        casa1 = new Casa();

        Casa casa2;
        casa2 = new Casa();

        this.corDaCasa = a;
        this.nacionalidade = b;
        this.bebida = c;
        this.cigarro = d;
        this.animal = e;
        this.setVizinhoDireito(casa1);
        this.setVizinhoEsquerdo(casa2);

    }

    public String getNomeDaCasa() {
        return nomeDaCasa;
    }

    public void setNomeDaCasa(String nomeDaCasa) {
        this.nomeDaCasa = nomeDaCasa;
    }

    public Casa getVizinhoEsquerdo() {
        return vizinhoEsquerdo;
    }

    public void setVizinhoEsquerdo(Casa vizinhoEsquerdo) {
        this.vizinhoEsquerdo = vizinhoEsquerdo;
    }

    public Casa getVizinhoDireito() {
        return vizinhoDireito;
    }

    public void setVizinhoDireito(Casa vizinhoDireito) {
        this.vizinhoDireito = vizinhoDireito;
    }

    public String getCorDaCasa() {
        return corDaCasa;
    }

    public void setCorDaCasa(String corDaCasa) {
        this.corDaCasa = corDaCasa;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getCigarro() {
        return cigarro;
    }

    public void setCigarro(String cigarro) {
        this.cigarro = cigarro;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getIndexDica() {
        return indexDica;
    }

    public void setIndexDica(int indexDica) {
        this.indexDica = indexDica;
    }

}
