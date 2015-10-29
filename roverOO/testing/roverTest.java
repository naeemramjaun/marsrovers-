/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author nramjaun
 */
public class roverTest {
    
    public roverTest() {
    }
                                                        //NORMAL TEST
                                                        @Test
                                                        public void testSetcoodX() {
                                                            //Arrange
                                                            rover rover = new rover () ;
                                                            //Act
                                                            rover.setcoodX(10);
                                                            //Assert
                                                            Assert.assertTrue(rover.getcoodX()==10);
                                                     }

                                                        @Test
                                                        public void testSetcoodY() {
                                                            //Arrange
                                                            rover rover = new rover () ; 
                                                            //Act
                                                            rover.setcoodX(20);
                                                            //Assert
                                                            Assert.assertTrue(rover.getcoodX()==20);
                                                        }

                                                        @Test
                                                        public void testGetcoodX() {
                                                            //Arrange
                                                            rover rover = new rover() ; 
                                                            //Act
                                                            int output = rover.getcoodX();
                                                            //Assert
                                                            Assert.assertEquals(output, 0);
                                                        }

                                                        @Test
                                                        public void testGetcoodY() {
                                                            //Arrange
                                                            rover rover = new rover() ; 
                                                            //Act
                                                            int output = rover.getcoodX();
                                                            //Assert
                                                            Assert.assertEquals(output, 0);
                                                        }

                                                        @Test
                                                        public void testSetposition() {
                                                            //Arrange
                                                            rover rover = new rover () ;
                                                            //Act
                                                            rover.setposition("N");
                                                            //Assert
                                                            Assert.assertTrue(rover.getposition()=="N");
                                                        }

                                                        @Test
                                                        public void testGetposition() {
                                                             //Arrange
                                                            rover rover = new rover() ; 
                                                            //Act
                                                            rover.getposition();
                                                            //Assert
                                                            Assert.assertEquals(rover.getposition(),null);
                                                        }
                                                        
                                                        
                                                        
                                                        
                                                        //ABNORMAL TEST
                                                        @Test
                                                        public void testSetcoodXAbnormal (){
                                                             //Arrange 
                                                             rover rover = new rover () ; 
                                                             //Act 
                                                             rover.setcoodX(999999999);
                                                             //Assert
                                                             Assert.assertTrue(rover.getcoodX()== 999999999);
                                                        }
    
                                                        @Test(expected =NumberFormatException .class)
                                                         public void testSetcoodXAbnormal2 (){
                                                             //Arrange 
                                                             rover rover = new rover () ; 
                                                             //Act 
                                                             int a =Integer.parseInt("abc") ;
                                                             rover.setcoodX(a);
                                                             //Assert
                                                             Assert.assertTrue( rover.getcoodX()== a);
                                                        }
                                        
                                                         @Test(expected = NumberFormatException.class)
                                                                public void testSetcoodXAbnormal2Symbol(){
                                                                //Arrange
                                                                rover rover = new rover () ; 
                                                                //Act 
                                                                int a = Integer.parseInt("#%$^&^%$^%");
                                                                //Assert
                                                                Assert.assertTrue(rover.getcoodX()== a);
                                                        }
                                                         







}