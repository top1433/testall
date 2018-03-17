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

public class Test {

	public static void main(String[] args) {

		Animal[] ani =new Animal[6];
		
		ani[0] = new Cat("mao",1);
		ani[1] = new Crocodile("crocodile",2);
		ani[2] = new Dog("dog",3);
		ani[3] = new Monkey("monkey",4);
		ani[4] = new Person("person",5);
		ani[5] = new Snake("snake",6);
		
		for(int i = 0;i<ani.length;i++) {
			Animal a = ani[i];
				a.eat();
				a.sleep();
				a.show();
			if(ani[i] instanceof Mammal ) {
				Mammal mam =(Mammal)a;
				mam.milk();
			}
			else
			{
				Reptile r = (Reptile)ani[i];
				r.carwl();
			}
			
		}
				
	}

}
