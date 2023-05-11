/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasesacervo;

/**
 *
 * @author Sala1
 */
public class C_Libro extends C_Acervo_F {
    
    public String Editorial;
    public int NoPag;
    public String Edicion;
    
  C_Libro(String Ed,int NP,String Edic ){
      
     super(Id,T,A,FP,FR,P);
              
      Editorial = Ed;
      NoPag = NP;
      Edicion = Edic;
      
      
  }  
  
  void consultaL (){
      
 
      
   System.out.println("Editorial: "+Editorial);
   System.out.println("Numero de Paginas: "+NoPag);
   System.out.println("Edicion: "+Edicion);
    
  }
}
