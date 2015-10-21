
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
                

                                
                                
                                //user input coordinate X of rover
                                while(true){
                                    System.out.println(constant.messageroverX);
                                try{
                                    int xaxis = Integer.parseInt(scanner.next());
                                    rover.setcoodX(xaxis);
                                    break;
                                }catch(NumberFormatException e){
                                    System.err.println("Invalid X-Coordinate");
                                }
                            }
                    
                    

                                //user input from user for Coordinate Y
                                while(true){
                                    System.out.println(constant.messageroverY); 
                                try{
                                    int yaxis = Integer.parseInt(scanner.next());
                                    rover.setcoodY(yaxis);
                                    break;
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
                                    movement.move(rover,plateau);
                                    break;
                                }catch(NumberFormatException e){
                                    System.err.println("Enter a valid Plateau length for its Y Length");
                            }
                        }
                    
                                
                                movement.move(rover, plateau);
                    
                  
                                
                                loop:while(true){ 
                                 System.out.println("Do you want to send another rover on Mars ? (yes/no)");
                                 String response = scanner.next();
                                    if(response.equals("yes")){
                                        main(args);
                                        break loop;
                                    }else if(response.equals("no")){
                                        break ;
                                    }else{
                                         System.err.println("Please Enter Either yes or no");
                                 }
                        }
                    
                  }
            }
                     
    

