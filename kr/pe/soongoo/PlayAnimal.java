package kr.pe.soongoo;

//import java.util.Scanner;
import java.util.ArrayList;

public class PlayAnimal {
	
	
	public static void main(String[] args){

/* ****
		//화면 입력 처리
		String animalType;
		Scanner sc = new Scanner(System.in);  
		// 문자 입력을 인자로 Scanner 생성
        
        System.out.println("동물명을 영어로 입력하세요: (예:Tiger,Lion,Eagle...)");
        
        // 제대로 입력할 때까지
        // 되풀이하여 입력받기
        while (!sc.hasNextLine()) {
          sc.next(); // 잘못된 입력 값 버리기
          System.err.print("에러! 다시 입력바랍니다: ");
        }

 
        animalType = sc.nextLine();     
        
**** */		
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Tiger");
		aList.add("Lion");
		aList.add("Eagle");
		
		String animalType = aList.get(2);
		// output animal type.
		if (animalType == "Tiger") {
			System.out.println("호랑이입니다.");
		} else if (animalType == "Lion") {
			System.out.println("사자입니다");
		} else if (animalType == "Eagle"){
			System.out.println("독수리입니다");
		}
		// output animal sound.
		if (animalType == "Tiger") {
			System.out.println("어흥!");
		} else if (animalType == "Lion") {
			System.out.println("크르응!");
		} else if (animalType == "Eagle"){
			System.out.println("까악!");
		}
		// output flying skill
		if (animalType == "Tiger") {
			System.out.println("나는 못날아요.");
		} else if (animalType == "Lion") {
			System.out.println("나는 못날아요.");
		} else if (animalType == "Eagle"){
			System.out.println("나는 잘 날아요.");
		}
	}
  
}
