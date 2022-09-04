/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package impar;

import java.util.Scanner;

public class Impar {
    
//estou importando ferramentas para esta classe;

    public static void main(String[] args) {
Scanner input = new Scanner (System.in);
        
double total = 0;
double contador = 0;
double notaMaior = 0;
double notaMenor = 100;
int alunos;

        System.out.println("insira a quantidade de alunos: ");
alunos = input.nextInt();

        while (contador != alunos){
    System.out.println("insira a "+(contador+1)+"º nota");
        double nota = input.nextDouble();
        if (nota>notaMaior){
        notaMaior = nota;
        }if (nota<notaMenor){
            notaMenor = nota;
        }
        if (nota <0 || nota >100 ){
                        System.out.println("valor inválido!");
        }else{
        total = nota + total;
        contador++;
        }if(total<1 && contador>= alunos){
                System.out.println("nenhuma nota inserida!");}
        if (contador >= alunos){
            double media;
            media = total / contador;
            System.out.println("media: "+media);
            System.out.println("a maior nota foi:"+notaMaior);
            System.out.println("a menor nota foi:"+notaMenor);}        
         } 
      }     
   }
