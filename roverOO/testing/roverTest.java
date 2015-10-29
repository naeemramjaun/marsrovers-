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
                                                            rover.setcoodX(10);
                                                            Assert.assertTrue(rover.getcoodX()==10);
                                                     }

                                                        @Test
                                                        public void testSetcoodY() {
                                                            //Arrange
                                                            rover rover = new rover () ; 
                                                            rover.setcoodX(20);
                                                            Assert.assertTrue(rover.getcoodX()==20);
                                                        }

                                                        @Test
                                                        public void testGetcoodX() {
                                                            //Arrange
                                                            rover rover = new rover() ; 
                                                            int output = rover.getcoodX();
                                                            Assert.assertEquals(output, 0);
                                                        }

                                                        @Test
                                                        public void testGetcoodY() {
                                                            //Arrange
                                                            rover rover = new rover() ; 
                                                            int output = rover.getcoodX();
                                                            Assert.assertEquals(output, 0);
                                                        }

                                                        @Test
                                                        public void testSetposition() {
                                                            //Arrange
                                                            rover rover = new rover () ; 
                                                            rover.setposition("N");
                                                            Assert.assertTrue(rover.getposition()=="N");
                                                        }

                                                        @Test
                                                        public void testGetposition() {
                                                             //Arrange
                                                            rover rover = new rover() ; 
                                                            rover.getposition();
                                                            Assert.assertEquals(rover.getposition(),null);
                                                        }
    
}
