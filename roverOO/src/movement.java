
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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


public class movement {
            
            public int CodX ; 
            public int CodY;
        
        
        
        public void move(rover rover,plateau plateau) throws IOException{
                                   
            
                                    //Call the values x , y , and position thr rover is facing by creating an their objects 
            
                                    int coordinateXrover = rover.getcoodX();
                                    int coordinateYrover = rover.getcoodY();
                                    CodX = coordinateXrover;
                                    CodY = coordinateYrover ;
                                    String roverfacingposition = rover.getposition();
                                    
                                    
                                    //Call the values of the plateau 
                                    int lengthXplateau = plateau.getplateauXlength();
                                    int lengthYplateau = plateau.getplateauYlength();
                                    
                                  
                                    //declare a boolean that will contain TRUE or FALSE to be use in a while loop 
                                    boolean stop = false ; 
                                    
                                    
                                   loop:while( stop != true){
                                    
                                   
                                    //continue to prompt user to enter command till stop is not equal to true 
                                    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
                                    System.out.println("Enter your Command"); 
                                    String command = bufferRead.readLine();
                                    
                                    
                                    
                                    //switch statment to check values 1 by 1 
                                    switch(command){
                                                
                                                                  case "M" :        
                                                                  {   if(roverfacingposition.equals("N")){
                                                                                    if(coordinateYrover < lengthYplateau ){
                                                                                       coordinateYrover++;
                                                                                       }else{
                                                                                       System.err.println("Error out of bound");
                                                                                            }
                                                                  
                                                                                }else if(roverfacingposition.equals("E")){
                                                                                    if(coordinateXrover < lengthXplateau){
                                                                                            coordinateXrover++;
                                                                                        }else{
                                                                                                System.err.println("Error out of bound");
                                                                                             }
                                                                                
                                                                                 }else if(roverfacingposition.equals("S")){
                                                                                     if(coordinateYrover > 0 ){
                                                                                         coordinateYrover -- ;
                                                                                        }else{
                                                                                                System.err.println("Error out of bound");
                                                                                             }
                                                                                 }else if(roverfacingposition.equals("W")){
                                                                                      if(coordinateXrover > 0 )  
                                                                                          coordinateXrover -- ;
                                                                                          }else{
                                                                                                System.err.println("Error out of bound");
                                                                                               }
                                                                                 
                                                                                 break ;
                                                                                }
                                                                  
                                                                  case "L": {            if(roverfacingposition.equals("N")){
                                                                                        roverfacingposition = "W" ;
                                                                                        }else if(roverfacingposition.equals("E")){
                                                                                        roverfacingposition = "N" ;
                                                                                        }else if(roverfacingposition.equals("S")){
                                                                                        roverfacingposition = "E" ;
                                                                                        }else if(roverfacingposition.equals("W")){
                                                                                        roverfacingposition = "S" ;
                                                                                        }  
                                                                  
                                                                                    break ;
                                                                  }
                                                                      
                                                                  case "R":          {    if(roverfacingposition.equals("N")){
                                                                                        roverfacingposition = "E" ;
                                                                                        }else if(roverfacingposition.equals("E")){
                                                                                        roverfacingposition = "S" ;
                                                                                        }else if(roverfacingposition.equals("S")){
                                                                                        roverfacingposition = "W" ;
                                                                                        }else if(roverfacingposition.equals("W")){
                                                                                        roverfacingposition = "N" ;
                                                                                        }  
                                                                  
                                                                                    break ;
                                                                  }
                                                                  case "Q":     stop = true ;
                                                                                break loop ;
                                                                                    
                                                                  
                                                                  default :  System.err.println("Enter valid Command(i.e) Either R or L or M " );
                                    
                                                                }
                                    
                                                        System.out.println("rover is @ point (" +coordinateXrover+ ","+coordinateYrover+ " and facing "+roverfacingposition+" )");
                                                                    	 
                                                        
                                                        

                                                        
                                                                         
                                                                        
                                                        }
                                                
                                                }
        
            
                                                    
                                        }
        
    
    

