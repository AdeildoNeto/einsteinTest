package com.corejsf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CoreBean implements Serializable {

    private List<Integer> checkboxes = new ArrayList<>();

    private Casas casas = new Casas();
    private  String venceu;
    
    Gatilho gatilho1 = new Gatilho();
    Gatilho gatilho2 = new Gatilho();
    Gatilho gatilho3 = new Gatilho();
    Gatilho gatilho4 = new Gatilho();
    Gatilho gatilho5 = new Gatilho();
    Gatilho gatilho6 = new Gatilho();
    Gatilho gatilho7 = new Gatilho();
    Gatilho gatilho8 = new Gatilho();
    Gatilho gatilho9 = new Gatilho();
    Gatilho gatilho10 = new Gatilho();
    Gatilho gatilho11 = new Gatilho();
    Gatilho gatilho12 = new Gatilho();
    Gatilho gatilho13 = new Gatilho();
    Gatilho gatilho14 = new Gatilho();
    Gatilho gatilho15 = new Gatilho();

    public void remover(Integer a) {
        for (Integer checkbox : checkboxes) {
            if (checkbox == a) {
                checkboxes.remove(checkbox);
                break;
            }
        }
    }
    public void acionaGatilho(Gatilho gatilho, Integer checkbox) {
        if (gatilho.isExiste() == false) {
            checkboxes.add(checkbox);
            gatilho.setExiste(true);
            verificaVitoria();
        }
    }
    public void verificaVitoria() {

        if (checkboxes.size() == 15) {
            venceu = "true";
        }
    }

    public void removeGatilho(Gatilho gatilho, Integer checkbox) {
        remover(checkbox);
        gatilho.setExiste(false);
    }

    public void realizarVerificacao() {

        //Dica numero 1
        if ("Norueguês".equals(this.getCasas().getPrimeiraCasa().getNacionalidade())) {
            if (gatilho1.isExiste() == false) {
                acionaGatilho(gatilho1, 1);
            }
        } else {
            if (gatilho1.isExiste()) {
                removeGatilho(gatilho1, 1);
            }
        }
        //Dica numero 2
        for (Casa casa : casas.getCasas()) {
            if ("Inglês".equals(casa.getNacionalidade()) && "Vermelha".equals(casa.getCorDaCasa())) {
                if (gatilho2.isExiste() == false) {
                    acionaGatilho(gatilho2, 2);
                }
                break;
            } else if ("Inglês".equals(casa.getNacionalidade()) || "Vermelha".equals(casa.getCorDaCasa())) {
                if (gatilho2.isExiste()) {
                    removeGatilho(gatilho2, 2);
                }
                break;
            }
        }
        //Dica 3 
        for (Casa casa : casas.getCasas()) {
            if ("Cachorros".equals(casa.getAnimal()) && "Sueco".equals(casa.getNacionalidade())) {
                if (gatilho3.isExiste() == false) {
                    acionaGatilho(gatilho3, 3);
                }
                break;
            } else if ("Cachorros".equals(casa.getAnimal()) || ("Sueco".equals(casa.getNacionalidade()))) {
                if (gatilho3.isExiste()) {
                    removeGatilho(gatilho3, 3);
                }
                break;
            }
        }
        //Dica 4
        for (Casa casa : casas.getCasas()) {
            if ("Dinamarquês".equals(casa.getNacionalidade()) && "Chá".equals(casa.getBebida())) {
                if (gatilho4.isExiste() == false) {
                    acionaGatilho(gatilho4, 4);
                }
                break;
            } else if ("Dinamarquês".equals(casa.getNacionalidade()) || "Chá".equals(casa.getBebida())) {
                if (gatilho4.isExiste()) {
                    removeGatilho(gatilho4, 4);
                }
                break;
            }
        }
        //Dica 5
        for (Casa casa : casas.getCasas()) {
            if ("Verde".equals(casa.getCorDaCasa()) && "Branca".equals(casa.getVizinhoDireito().getCorDaCasa()) || "Branca".equals(casa.getCorDaCasa()) && "Verde".equals(casa.getVizinhoEsquerdo().getCorDaCasa())) {
                if (gatilho5.isExiste() == false) {
                    acionaGatilho(gatilho5, 5);
                }
                break;
            } else if ("Verde".equals(casa.getCorDaCasa()) || ("Branca").equals(casa.getVizinhoEsquerdo().getCorDaCasa()) || "Branca".equals(casa.getCorDaCasa()) && "Verde".equals(casa.getVizinhoEsquerdo().getCorDaCasa())) {
                if (gatilho5.isExiste()) {
                    removeGatilho(gatilho5, 5);
                }
                break;
            }
        }
        //Dica 6
        for (Casa casa : casas.getCasas()) {
            if ("Verde".equals(casa.getCorDaCasa()) && casa.getBebida().equals("Café")) {
                if (gatilho6.isExiste() == false) {
                    acionaGatilho(gatilho6, 6);
                }
                break;
            } else if ("Verde".equals(casa.getCorDaCasa()) || casa.getBebida().equals("Café")) {
                if (gatilho6.isExiste()) {
                    removeGatilho(gatilho6, 6);
                }
                break;
            }
        }
        //Dica 7
        for (Casa casa : casas.getCasas()) {
            if ("Pássaros".equals(casa.getAnimal()) && casa.getCigarro().equals("Pall Mall")) {
                if (gatilho7.isExiste() == false) {
                    acionaGatilho(gatilho7, 7);
                }
                break;

            } else if ("Pássaros".equals(casa.getAnimal()) || casa.getCigarro().equals("Pall Mall")) {
                if (gatilho7.isExiste()) {
                    removeGatilho(gatilho7, 7);
                }
                break;
            }
        }
        //Dica 8
        for (Casa casa : casas.getCasas()) {
            if ("Amarela".equals(casa.getCorDaCasa()) && casa.getCigarro().equals("Dunhill")) {
                if (gatilho8.isExiste() == false) {
                    acionaGatilho(gatilho8, 8);
                }
                break;

            } else if ("Amarela".equals(casa.getCorDaCasa()) || casa.getCigarro().equals("Dunhill")) {
                if (gatilho8.isExiste()) {
                    removeGatilho(gatilho8, 8);
                }
                break;
            }
        }
        //Dica numero 9
        if ("Leite".equals(this.getCasas().getTerceiraCasa().getBebida())) {
            acionaGatilho(gatilho9, 9);
        } else {
            removeGatilho(gatilho9, 9);
        }
        //Dica 10
        for (Casa casa : casas.getCasas()) {
            if (casa.getCigarro().equals("Blends") && casa.getVizinhoDireito().getAnimal().equals("Gatos")) {
                {
                    if (gatilho10.isExiste() == false) {
                        acionaGatilho(gatilho10, 10);
                    }
                    break;
                }
            } else {
                if (gatilho10.isExiste()) {
                    removeGatilho(gatilho10, 10);
                }
            }
            if (casa.getCigarro().equals("Blends") && casa.getVizinhoEsquerdo().getAnimal().equals("Gatos")) {
                if (gatilho10.isExiste() == false) {
                    acionaGatilho(gatilho10, 10);
                }
                break;
            } else {
                if (gatilho11.isExiste()) {
                    removeGatilho(gatilho11, 11);
                }
            }
        }
        //Dica 11
        for (Casa casa : casas.getCasas()) {
            if (casa.getCigarro().equals("Dunhill") && casa.getVizinhoDireito().getAnimal().equals("Cavalos")) {
                {
                    if (gatilho11.isExiste() == false) {
                        acionaGatilho(gatilho11, 11);
                    }
                    break;
                }
            } else {
                if (gatilho11.isExiste()) {
                    removeGatilho(gatilho11, 11);
                }
            }
            if (casa.getCigarro().equals("Dunhill") && casa.getVizinhoEsquerdo().getAnimal().equals("Cavalos")) {
                if (gatilho11.isExiste() == false) {
                    acionaGatilho(gatilho11, 11);
                }
                break;
            } else {
                if (gatilho11.isExiste()) {
                    removeGatilho(gatilho11, 11);
                }
            }
        }
        //Dica 12
        for (Casa casa : casas.getCasas()) {
            if ("Cerveja".equals(casa.getBebida()) && casa.getCigarro().equals("Bluemaster")) {
                if (gatilho12.isExiste() == false) {
                    acionaGatilho(gatilho12, 12);
                }
                break;

            } else if ("Cerveja".equals(casa.getBebida()) || casa.getCigarro().equals("Bluemaster")) {
                if (gatilho12.isExiste()) {
                    removeGatilho(gatilho12, 12);
                }
                break;
            }
        }
        //Dica 13
        for (Casa casa : casas.getCasas()) {
            if (casa.getCigarro().equals("Blends") && casa.getVizinhoDireito().getBebida().equals("Água")) {
                {
                    if (gatilho13.isExiste() == false) {
                        acionaGatilho(gatilho13, 13);
                    }
                    break;
                }
            } else {
                if (gatilho13.isExiste()) {
                    removeGatilho(gatilho13, 13);
                }
            }
            if (casa.getCigarro().equals("Blends") && casa.getVizinhoEsquerdo().getBebida().equals("Água")) {
                if (gatilho13.isExiste() == false) {
                    acionaGatilho(gatilho13, 13);
                }
                break;
            } else {
                if (gatilho13.isExiste()) {
                    removeGatilho(gatilho13, 13);
                }
            }
        }
        //Dica 14
        for (Casa casa : casas.getCasas()) {
            if (casa.getCorDaCasa().equals("Azul") && casa.getVizinhoDireito().getNacionalidade().equals("Norueguês")) {
                {
                    if (gatilho14.isExiste() == false) {
                        acionaGatilho(gatilho14, 14);
                    }
                    break;
                }
            } else {
                if (gatilho14.isExiste()) {
                    removeGatilho(gatilho14, 14);
                }
            }
            if (casa.getCorDaCasa().equals("Azul") && casa.getVizinhoEsquerdo().getNacionalidade().equals("Norueguês")) {
                if (gatilho14.isExiste() == false) {
                    acionaGatilho(gatilho14, 14);
                }
                break;
            } else {
                if (gatilho14.isExiste()) {
                    removeGatilho(gatilho14, 14);
                }
            }
        }

        //Dica 15
        for (Casa casa : casas.getCasas()) {
            if ("Alemão".equals(casa.getNacionalidade()) && casa.getCigarro().equals("Prince")) {
                if (gatilho15.isExiste() == false) {
                    acionaGatilho(gatilho15, 15);
                }
                break;
            } else if ("Alemão".equals(casa.getNacionalidade()) || casa.getCigarro().equals("Prince")) {
                if (gatilho15.isExiste()) {
                    removeGatilho(gatilho15, 15);
                }
                break;
            }
        }

    }

    public List<Integer> getCheckboxes() {
        return checkboxes;
    }

    public void setCheckboxes(List<Integer> checkboxes) {
        this.checkboxes = checkboxes;
    }

    public Casas getCasas() {
        return casas;
    }

    public String getVenceu() {
        return venceu;
    }
}
