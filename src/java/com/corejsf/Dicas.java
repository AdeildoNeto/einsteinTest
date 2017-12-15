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

@ManagedBean
@SessionScoped
public class Dicas implements Serializable{
    
  
    
    public Collection<SelectItem> criaDicas() {

        Collection<SelectItem> dicas = new ArrayList();

       
        dicas.add(new SelectItem(1, "O Norueguês vive na primeira casa.", "", true));
        dicas.add(new SelectItem(2, "O Inglês vive na casa Vermelha.", "", true));
        dicas.add(new SelectItem(3, "O Sueco tem Cachorros como animais de estimação.", "", true));
        dicas.add(new SelectItem(4, "O Dinamarquês bebe Chá.", "", true));
        dicas.add(new SelectItem(5, "A casa Verde fica do lado esquerdo da casa Branca.", "", true));
        dicas.add(new SelectItem(6, "O homem que vive na casa Verde bebe Café.", "", true));
        dicas.add(new SelectItem(7, "O homem que fuma Pall Mall cria Pássaros.", "", true));
        dicas.add(new SelectItem(8, "O homem que vive na casa Amarela fuma Dunhill.", "", true));
        dicas.add(new SelectItem(9, "O homem que vive na casa do meio bebe Leite.", "", true));
        dicas.add(new SelectItem(10, "O homem que fuma Blends vive ao lado do que tem Gatos.", "", true));
        dicas.add(new SelectItem(11, "O homem que cria Cavalos vive ao lado do que fuma Dunhill.", "", true));
        dicas.add(new SelectItem(12, "O homem que fuma Bluemaster bebe Cerveja.", "", true));
        dicas.add(new SelectItem(13, "O homem que fuma Blends é vizinho do que bebe Água.", "", true));
        dicas.add(new SelectItem(14, "O Norueguês vive ao lado da casa Azul.", "", true));
        dicas.add(new SelectItem(15, "O alemão fuma Prince", "", true));

        return dicas;
    }

    private Collection<SelectItem> dicas = criaDicas();

 

    public Collection<SelectItem> getDicas() {
        return dicas;
    }

    public void setDicas(Collection<SelectItem> dicas) {
        this.dicas = dicas;
    }

   
}
