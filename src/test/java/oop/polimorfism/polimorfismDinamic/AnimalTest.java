package oop.polimorfism.polimorfismDinamic;

public class AnimalTest {

    //@Test
    public void suneteAnimale() {
        Caine Azorel = new Caine();
        Azorel.scoateSunet();

        Pisica Toulouse = new Pisica();
        Toulouse.scoateSunet();

        Arici Tony = new Arici();
        Tony.scoateSunet();

        Animal animal= new Animal();
        animal.scoateSunet();
    }
}
