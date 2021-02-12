package com.arpit.oops;

 abstract class Vehicle_Abstract {
	int noOfTyres;
	abstract void start();
}

 //Few important points for abstract class
// 1.Abstract class can achieve are 0 to 100% abstraction
// 2. if any method is declared as Abstract then the class must be declared as Abstract class else it will through
// 	compile time error.
// 3. If class is abstract then it may have abstract or normal methods
// 4. If any class inherits or extends Abstract class then it must define the implementation of all inherited Abstract methods
// 	else it will give compile time error.
// 5. We cannot create an object of interface but can create reference variable for an interface