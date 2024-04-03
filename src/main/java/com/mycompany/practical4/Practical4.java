/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical4;
import static com.mycompany.practical4.Person.walkinMethod;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public  class Practical4 {//open of practical4
 Person newPerson=new Person();//created a new instance of the class
 //we have created a new object of the project
 
    public static void main(String[] args) {//open of main
        Person person=new Person();
                person.name= JOptionPane.showInputDialog("enter person name ");
            JOptionPane.showMessageDialog(null, "hi "+ person.name);
                   walkinMethod();
            }//close of main

    }//close practical4

              
       class Person { //this a class we have created ourselves           
             public String name;//we are declaring the variable
             public String surname;
             static void walkinMethod(){
                 JOptionPane.showMessageDialog(null,"walk walk");
             }
                     
                     
        }
