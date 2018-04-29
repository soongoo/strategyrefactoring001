package kr.pe.soongoo;

import java.util.ArrayList;

public class PlayZoo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Tiger");
		aList.add("Lion");
		aList.add("Eagle");
		aList.add("Drone");
		aList.add("Tuna");
		aList.add("Seal");
		
		Animal a1= null;
		String animalType = "";
		
		for (String s: aList){
		
			animalType = s;
						
			if (animalType == "Tiger") {
				 a1 = new Tiger();
			} else if (animalType == "Lion"){
				 a1 = new Lion();
			} else if (animalType == "Eagle"){
				 a1 = new Eagle();
			} else if (animalType == "Drone"){
				 a1 = new Drone();
			} else if (animalType == "Tuna"){
				 a1 = new Tuna();
			} else if (animalType == "Seal"){
				 a1 = new Seal();
			}
				
		a1.display();
		a1.fly();
		a1.cry();
		
		
		}
	}
}
