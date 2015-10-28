
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Naeem Ramjaun
 */
public class console {

    public static void main(String [] args) throws IOException{
                    
        
                                //Creating Objects from class
                                rover rover = new rover() ;
                                plateau plateau = new plateau () ; 
                                movement movement = new movement () ;
                                Constant constant = new Constant() ; 

                                //Scanner to get input from ser 
                                Scanner scanner = new Scanner (System.in) ;
                
                                

                                //user input plateau size X
                                while(true){
                                    System.out.println(constant.plateauXlength);
                                try{
                                    int plateausizeX = Integer.parseInt(scanner.next());
                                    plateau.setplateauXlength(plateausizeX);
                                    break;
                                }catch(NumberFormatException e){
                                    System.err.println("Enter a valid Plateau length for its X Length");
                            }
                        }
                                
                                
                              
                                

                                //user input plateau size Y
                                while(true){
                                    System.out.println(constant.plateauYlength);
                                try{
                                    int plateausizeY = Integer.parseInt(scanner.next());
                                    plateau.setplateauYlength(plateausizeY);
                                    break;
                                }catch(NumberFormatException e){
                                    System.err.println("Enter a valid Plateau length for its Y Length");
                            }
                        }                              
                                
                              
                                
                              do{  

                                //user input coordinate X of rover
                                while(true){
                                    System.out.println(constant.messageroverX);
                                try{
                                    int xaxis = Integer.parseInt(scanner.next());
                                    if(xaxis == movement.CodX){
                                        System.err.println("a Rover is already in the position");
                                    }else{
                                        
                                    if(xaxis > plateau.getplateauXlength() ){
                                        System.err.println("Out of bound");
                                    }else{
                                        
                                       
                                    rover.setcoodX(xaxis);
                                    break;
                                    }}
                                }catch(NumberFormatException e){
                                    System.err.println("Invalid X-Coordinate");
                                }
                            }
                    
                    
                                




                                //user input from user for Coordinate Y for the rover
                                while(true){
                                    System.out.println(constant.messageroverY); 
                                try{
                                    int yaxis = Integer.parseInt(scanner.next());
                                    if(yaxis == movement.CodY){
                                        System.err.println("a Rover is already in the position");
                                    }else{
                                    
                                     if(yaxis > plateau.getplateauYlength() ){
                                        System.err.println("Out of bound");
                                     }else{
                                    rover.setcoodY(yaxis);
                                    break;
                                     }}
                                }catch(NumberFormatException e){
                                    System.err.println("Invalid Y-Coordinate");
                            }
                        }
                     
                  
                    

                                
                                
                                //user input where the rover is facing 
                                while(true){
                                    System.out.println(constant.roverdirection); 
                                    String roverfacing = scanner.next();
                                    if( roverfacing.equals("N")||roverfacing.equals("S")||roverfacing.equals("E")||roverfacing.equals("W")){
                                    rover.setposition(roverfacing);
                                    break;
                                }else{
                                    System.err.println("Enter Valid Position (i.e) N,S,E,W");
                            }
                        }
         
                                
                                //rover movement on the plateau
                                movement.move(rover, plateau);
                                
                                
                                
                                //wish to send another rover 
                                System.out.println("Do you want to send another rover on Mars? (yes/no)");
                              }while(scanner.next().equals("yes"));
                                
                            
                    
                  }
            }
                     
    

