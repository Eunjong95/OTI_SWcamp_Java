package ch06.sec14;

public class CarExample {

	public static void main(String[] args) {
		//객체 생성
		
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		System.out.println(myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println(myCar.getSpeed());
		
		if(!myCar.isStop()) {
			myCar.setStop(true);
		}
		
		System.out.println(myCar.getSpeed());


	}

}
