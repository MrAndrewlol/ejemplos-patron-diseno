import java.util.Scanner;

//Interfaz contrato que nunca se puede cambiar
interface Product {
	void display();
}

// Concretar el display que puede salir de esta forma o el proucto B
class ConcreteProductA implements Product {
	public void display() {
		System.out.println("Procesando entrega....");
		System.out.println("La entrega del Ingeniero Jo se ha entregado");

	}
}

class ConcreteProductB implements Product {
	public void display() {
		System.out.println("Procesando entrega....");
		System.out.println("La entrega del Ingeniero Prince se ha entregado");
	}
}

// Factory Interface
interface Factory {
	Product factoryMethod();
}

// El factory method lo utiliza para pasar que es lo mismo
class ConcreteFactoryA implements Factory {
	public Product factoryMethod() {
		return new ConcreteProductA();
	}
}

class ConcreteFactoryB implements Factory {
	public Product factoryMethod() {
		return new ConcreteProductB();
	}
}

// el main principal
public class FactoryMethodExample {
	public static void main(String[] args) {
		
		Scanner aquepersona = new Scanner(System.in);

		System.out.println("A que persona desea entregarle..... Persona 1 o 2?");
		String pregunta = aquepersona.nextLine();

		if (pregunta.equalsIgnoreCase("1")) {
			Factory factoryA = new ConcreteFactoryA();
			Product productA = factoryA.factoryMethod();
			productA.display();
			
		}
		else if(pregunta.equalsIgnoreCase("2")){
			Factory factoryB = new ConcreteFactoryB();
			Product productB = factoryB.factoryMethod();
			productB.display();
		}
		

	}
}


