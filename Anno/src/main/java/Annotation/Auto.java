package Annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Auto {
	
	public Auto() {
		System.out.println(" auto created");
	}
private Wheel wheel; 
	
public void printAuto () { 
	System.out.println(" this is a beautiful Car!" + wheel.getType());
}

public Wheel getWheel() {
	return wheel;
}

public void setWheel(Wheel wheel) {
	this.wheel = wheel;
}

}