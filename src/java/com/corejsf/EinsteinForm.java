/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.corejsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author aldo_neto
 */
@ManagedBean
@SessionScoped
public class EinsteinForm implements Serializable {

    private String corDaCasa = "";
    private String nacionalidade = "";
    private String animal = "";
    private String bebida = "";
    private String cigarro = "";

    public EinsteinForm() {
    }

    public EinsteinForm(String a, String b, String c, String d, String e) {
        this.corDaCasa = a;
        this.nacionalidade = b;
        this.bebida = c;
        this.cigarro = d;
        this.animal = e;
    }

    public static Collection<SelectItem> criarCollection(String a, String b, String c, String d, String e) {
        Collection<SelectItem> x = new ArrayList<SelectItem>();
        x.add(new SelectItem(0, "--Select--"));
        x.add(new SelectItem(a));
        x.add(new SelectItem(b));
        x.add(new SelectItem(c));
        x.add(new SelectItem(d));
        x.add(new SelectItem(e));

        return x;
    }

    private static Collection<SelectItem> coresDeCasa = criarCollection("Azul", "Verde", "Vermelha", "Amarela", "Branca");

    public Collection<SelectItem> getCoresItem() {
        return getCoresDeCasa();
    }

    private static Collection<SelectItem> bebidas = criarCollection("Café", "Cerveja", "Chá", "Água", "Leite");

    public Collection<SelectItem> getBebidasItem() {
        return getBebidas();
    }

    private static Collection<SelectItem> cigarros = criarCollection("Dunhill", "Blends", "Bluemaster", "Pall Mall", "Prince");

    public Collection<SelectItem> getCigarrosItem() {
        return getCigarros();
    }

    private static Collection<SelectItem> animais = criarCollection("Cavalos", "Pássaros", "Cachorros", "Gatos", "Peixes");

    public Collection<SelectItem> getAnimaisItem() {
        return getAnimais();
    }

    private static Collection<SelectItem> nacionalidades = criarCollection("Norueguês", "Dinamarquês", "Sueco", "Inglês", "Alemão");

    public Collection<SelectItem> getNacionalidadesItem() {
        return getNacionalidades();
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

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
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

    public static Collection<SelectItem> getCoresDeCasa() {
        return coresDeCasa;
    }

    public static void setCoresDeCasa(Collection<SelectItem> aCoresDeCasa) {
        coresDeCasa = aCoresDeCasa;
    }

    public static Collection<SelectItem> getBebidas() {
        return bebidas;
    }

    public static void setBebidas(Collection<SelectItem> aBebidas) {
        bebidas = aBebidas;
    }

    public static Collection<SelectItem> getCigarros() {
        return cigarros;
    }

    public static void setCigarros(Collection<SelectItem> aCigarros) {
        cigarros = aCigarros;
    }

    public static Collection<SelectItem> getAnimais() {
        return animais;
    }

    public static void setAnimais(Collection<SelectItem> aAnimais) {
        animais = aAnimais;
    }

    public static Collection<SelectItem> getNacionalidades() {
        return nacionalidades;
    }

    public static void setNacionalidades(Collection<SelectItem> aNacionalidades) {
        nacionalidades = aNacionalidades;
    }

}
