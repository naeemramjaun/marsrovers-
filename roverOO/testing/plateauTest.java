/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nramjaun
 */
public class plateauTest {
    
    public plateauTest() {
    }
                                                                //NORMAL TEST
                                                                @Test
                                                                public void testSetplateauXlength() {
                                                                    //Arrange 
                                                                    plateau plateau = new plateau () ;
                                                                    //Act
                                                                    plateau.setplateauXlength(5);
                                                                    //Assert
                                                                    Assert.assertTrue(plateau.getplateauXlength()==5);
                                                                }

                                                                @Test
                                                                public void testGetplateauXlength() {
                                                                    //Arrange 
                                                                    plateau plateau = new plateau () ;
                                                                    //Act 
                                                                    plateau.getplateauXlength();
                                                                    //Assert 
                                                                    Assert.assertTrue(plateau.getplateauXlength()== 0 );
                                                                }

                                                                @Test
                                                                public void testSetplateauYlength() {
                                                                    //Arrange 
                                                                    plateau plateau = new plateau () ;
                                                                    //Act
                                                                    plateau.setplateauYlength(15);
                                                                    //Assert
                                                                    Assert.assertTrue(plateau.getplateauYlength()==15);
                                                                }

                                                                @Test
                                                                public void testGetplateauYlength() {
                                                                    //Arrange 
                                                                    plateau plateau = new plateau () ;
                                                                    //Act 
                                                                    plateau.getplateauYlength();
                                                                    //Assert 
                                                                    Assert.assertTrue(plateau.getplateauYlength()== 0 );
                                                                }
                                                                
                                                                
                                                                //ABNORMAL TEST
                                                                @Test
                                                                public void testSetcoodXAbnormal (){
                                                                     //Arrange 
                                                                     plateau plateau = new plateau () ; 
                                                                     //Act 
                                                                    plateau.setplateauXlength(999999999);
                                                                     //Assert
                                                                     Assert.assertTrue(plateau.getplateauXlength()==999999999);
                                                                }

                                                                @Test(expected =NumberFormatException .class)
                                                                 public void testSetcoodXAbnormalString (){
                                                                     //Arrange 
                                                                     plateau plateau = new plateau () ; 
                                                                     //Act 
                                                                     int a =Integer.parseInt("abc") ;
                                                                     plateau.setplateauXlength(a);
                                                                     //Assert
                                                                     Assert.assertTrue( plateau.getplateauXlength()==a);
                                                                }

                                                                 @Test(expected = NumberFormatException.class)
                                                                        public void testSetcoodXAbnormalSymbol(){
                                                                        //Arrange
                                                                        plateau plateau = new plateau () ; 
                                                                        //Act 
                                                                        int a = Integer.parseInt("#%$^&^%$^%");
                                                                        plateau.setplateauXlength(a);
                                                                        //Assert
                                                                        Assert.assertTrue(plateau.getplateauXlength()==a);
                                                                }

                                                                 @Test(expected = NumberFormatException.class)
                                                                  public void testSetcoodXAbnormalIsNull(){
                                                                        //Arrange
                                                                        plateau plateau = new plateau () ;
                                                                        //Act 
                                                                        int a = Integer.parseInt(null);
                                                                        plateau.setplateauXlength(a);
                                                                        //Assert
                                                                        Assert.assertTrue(plateau.getplateauXlength()==a);

                                                                  }
                                                                  
                                                                 @Test 
                                                                 public void CreatePlateau (){
                                                                 //Arrange 
                                                                 plateau plateau = new plateau() ;
                                                                 //Assert
                                                                 Assert.assertNotNull(plateau);
                                                               }

    
    
}
