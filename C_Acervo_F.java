/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasesacervo;

/**
 *
 * @author Sala1
 */
public class C_Acervo_F {
    
    public String IdAcervo;
    public String Titulo;
    public String Autor;
    public String FechaPubli;
    public String FechaReg;
    public String Pais;



C_Acervo_F (String Id,String T,String A,String FP,String FR,String P){

IdAcervo = Id;
Titulo = T;
Autor = A;
FechaPubli = FP;
FechaReg = FR;
Pais = P;

}

void consultaA(){
   System.out.println("Id Producto: "+IdAcervo);
   System.out.println("Titulo: "+Titulo);
   System.out.println("Autor: "+Autor);
   System.out.println("Fecha de Publicacion: "+FechaPubli);
   System.out.println("Fecha de Registro: "+FechaReg);
   System.out.println("Pais: "+Pais);
   
}
}

    

