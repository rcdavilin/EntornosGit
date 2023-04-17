package Ej;

class PizzaDelivery {

	  private int numberOfLateDeliveries;

	  int getRating() {

		  return numberOfLateDeliveries  > 5 ? 2 : 1;

	  }

	  

	}
