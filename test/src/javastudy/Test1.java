package javastudy;
import base.Animal;
import base.Mammal;
import base.Reptile;
import utility.Cat;
import utility.Crocodile;
import utility.Dog;
import utility.Monkey;
import utility.Person;
import utility.Snake;

public class Test1 {
	public static void main(String[] args) {
		Animal [] animal= new Animal[6];
		animal[0] = new Cat("mammal","cat");
		animal[1] = new Crocodile("reptile","crocodile");
		animal[2] = new Dog("mammal","dog");
		animal[3] = new Monkey("mammal","monkey");
		animal[4] = new Person("mammal","person");
		animal[5] = new Snake("reptile","snake");
		for(int i=0;i<6;i++) {
			animal[i].show();
			animal[i].eat();
			animal[i].sleep();
			if(animal[i] instanceof Mammal)
            {
                Mammal b=(Mammal)animal[i];
                b.milk();

            }else
            {
                Reptile b=(Reptile)animal[i];
                b.crawl();
            }
		}
	}
}
