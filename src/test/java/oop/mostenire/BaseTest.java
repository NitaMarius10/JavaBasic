package oop.mostenire;


public class BaseTest {
    //@BeforeClass
    public void setUp(){
        System.out.println("Set-up-ul din clasa Base Test");
    }

    //@BeforeMethod
    public void baseTest(){
        System.out.println("Executare BaseTest");
    }
}
