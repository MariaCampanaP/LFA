package com.mycompany.lfa;

//Nome da aluna: Maria Rita Campana Peixoto
//2° Ano de Ciência da Computação

public class ExpressaoRegular {
    
    public String linguagem01 = "(a|b)*(aa|bb)";
    public String linguagem02 = "a(a|b)* a)";
    
    public static void confere(String exp, String sentenca){
        /*
        matches()é um método da classe String que é usado para verificar se 
        uma String corresponde a uma determinada expressão regular. Ele retorna true
        se a string inteira corresponde ao padrão especificado e false caso contrário
        */
        
        if(sentenca.matches(exp)){
        System.out.println("Sentenca: " + sentenca + " Aceita");
    }else{
          System.out.println("Sentenca: " + sentenca + " Rejeita");
        }
    }
}
