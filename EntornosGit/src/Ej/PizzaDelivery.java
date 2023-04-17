package Ej;

class PizzaDelivery {

	  // ...

	  int getRating() {

	    return moreThanFiveLateDeliveries() ? 2 : 1;

	  }

	  boolean moreThanFiveLateDeliveries() {

	    int numberOfLateDeliveries = 0;
		return numberOfLateDeliveries  > 5;

	  }

	}
