import org.junit.Assert;
import org.junit.Test;



public class AnimalTests {
    @Test
    public void TestCatSound(){

        Cat cat = new Cat("Meow", "Food");

        String Cat = cat.cat();
        Assert.assertEquals(Cat, "The Cat Meow\n" +
                "The Cat eat Food");

    }
    @Test
    public void TestCatEats(){

        Cat cat = new Cat("Meow", "Food");

        String Cat = cat.cat();
        Assert.assertEquals(Cat, "The Cat Meow\n" +
                "The Cat eat Food");

    }
    @Test
    public void TestDogSound(){

        Dog dog = new Dog("Bark", "Food");

        String Dog = dog.dog();
        Assert.assertEquals(Dog, "The Dog Bark\n" +
                "The Dog eat Food");

    }
    @Test
    public void TestDogEats(){

        Dog dog = new Dog("Bark", "Food");

        String Dog = dog.dog();
        Assert.assertEquals(Dog, "The Dog Bark\n" +
                "The Dog eat Food");

    }
}

