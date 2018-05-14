/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ch.hegarc.ig.ido.fizzbuzztdd.Fizzbuzz;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mael.voyame
 */
public class FizzbuzzTest {
    Fizzbuzz fb;
    
    public FizzbuzzTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        fb = new Fizzbuzz();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test.

    //Test que la liste contient bien les 100 chiffres attendus
    @Test
    public void listeContientCentChiffre(){
        ArrayList maListe = new ArrayList();
        maListe = fb.getListe();
        for(int i = 1; i < 100; i++){
            assertEquals("Le nombre suit la séquence", i, maListe.get(i-1));
        }
    }
    
    //Test que la liste n'est pas vide
    @Test
    public void listeVide(){
        ArrayList maListe = new ArrayList();
        maListe = fb.getListe();
        assertTrue("La liste est vide",maListe.get(0)!=null);
    }
    
    @Test
    public void listeContientFizz(){
        ArrayList maListe = new ArrayList();
        maListe = fb.getListe();
        fb.setFizz();
        for(int i = 1; i<100; i++){
            if(i%3 == 0){
                assertEquals("emplacement ne contient pas Fizz","Fizz", maListe.get(i-1));
            }
        }
    }
    
    @Test
    public void listeContientBuzz(){
        ArrayList maListe = new ArrayList();
        maListe = fb.getListe();
        fb.setBuzz();
        for(int i = 1; i<100; i++){
            if(i%5 == 0){
                assertEquals("emplacement ne contient pas Buzz","Buzz", maListe.get(i-1));
            }
        }
    }
    
    @Test
    public void listeContientFizzBuzz(){
        ArrayList maListe = new ArrayList();
        maListe = fb.getListe();
        fb.setFizzBuzz();
        for(int i = 1; i<100; i++){
            if(i%3 == 0){
                if(i%5 == 0){
                    assertEquals("emplacement ne contient pas FizzBuzz","FizzBuzz", maListe.get(i-1));
                }
            }
        }
    }
    
    
}
