package com.mycompany.lfa;
 
//Nome da Aluna: Maria Rita Campana Peixoto
//2° Ano de Ciência da Computação

public class LFA {

    public static void main(String[] args) {
        ExpressaoRegular ER = new ExpressaoRegular();
        ER.confere(ER.linguagem01, "aba");
        ER.confere(ER.linguagem02, "ab");
    }
}
