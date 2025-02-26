package com.learnquest.demos;

/**
 * CoreJava 강의 Java를 사용하는 객체 지향 프로그래밍 소개
 * Module 2 객체 예제
 * 
 * @author 이병관
 * @since 2025.02.25
 * 
 * LocalDate와 Period 클래스를 불러와 자동차의 manufactured로부터 age를 판별
 */
import java.time.LocalDate;
import java.time.Period;
/**
 * java.lang.Math.min을 미리 정적 임포트로 불러와둠으로써 이후 Math.min이 아닌, min만으로 사용할 수 있음을 학습함
 */
import static java.lang.Math.min;

public class Car {
	/**
	 * 생성자를 만드는 방법에 대해 학습함
	 */
	public Car() { }
	
	/**
	 * 1개의 매개변수로 4개의 속성에 할당할 수 있는 생성자
	 */
	public Car(String name) {
		this(name, 0, 0, false);
	}
	/**
	 * 서명이 다르면 서로 다른 생성자도 공존할 수 있다
	 */
	public Car(String name, int speed, int fuel, boolean running) {
		setName(name);
		setSpeed(speed);
		setGasoline(fuel);
		setEngineState(running);
	}
	/**
	 * static, 정적 키워드에 관해 학습함
	 */
	private static final int MAX_SPEED = 100;
		
	private String name;

	/**
	 * name 속성에 대한 getter와 setter 설정
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int speed;

	/**
	 * speed 속성에 대한 getter와 setter 설정
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * 삼항연산자를 이용해 자동차의 스피드가 maxSpeed보다 큰 경우, maxSpeed로 설정하도록 제한을 걸어둔다
	 */
	/* 
	public void setSpeed(int newSpeed) {
		speed = newSpeed <= MAX_SPEED ? newSpeed : MAX_SPEED;
	}
	 */
	/**
	 * Javadocs의 Math 클래스를 통해 간단하게 나타내는 방법에 대해 알아봄
	 * import한 Math의 사용처
	 */
	public void setSpeed(int newSpeed) {
		speed = min(newSpeed, MAX_SPEED);
	}
	
	private int gasoline;
	/**
	 * gasoline 속성에 대한 getter와 setter 설정
	 */
	public int getGasoline() {
		return gasoline;
	}

	public void setGasoline(int gasoline) {
		this.gasoline = gasoline;
	}
	/**
	 * engineState 속성에 대한 getter와 setter 설정
	 */
	private boolean engineState;

	public boolean isEngineState() {
		return engineState;
	}

	public void setEngineState(boolean engineState) {
		this.engineState = engineState;
	}
	
	private LocalDate manufactured;

	/**
	 * manufactured 속성에 대한 getter와 setter 설정
	 */
	public LocalDate getManufactured() {
		return manufactured;
	}

	public void setManufactured(LocalDate manufactured) {
		this.manufactured = manufactured;
	}

	/**
	 * manufactured 속성에 입력된 값과 현재의 LocalDate를 가져와 그 차이를 통해 자동차의 age를 얻는다.
	 */
	public int getAge() {
		return Period.between(getManufactured(), LocalDate.now()).getYears();
	}

	/**
	 * main method 시작
	 * 
	 * Car 클래스에 대한 인스턴스 car54와 mach5를 만들어 이름, 속도, 제조일자를 설정한다.
	 * 
	 * 이후 Car에 대한 일시적인 배열을 만들어 printf 구문을 통해 %s로 string name을, %d로 int age를, %d로 int
	 * speed를 출력하는 방법에 대해 배운다.
	 */
	public static void main(String[] args) {
		Car car54 = new Car();

		car54.setName("Car 54");
		car54.setSpeed(20);
		car54.setManufactured(LocalDate.of(1961, 9, 17));

		Car mach5 = new Car();

		mach5.setName("Mach V");
		mach5.setSpeed(250);
		mach5.setManufactured(LocalDate.of(1967, 4, 2));

		for (Car car : new Car[] { car54, mach5 }) {
			System.out.printf("%s is %d years old and is traveling at %d mph%n", car.getName(), car.getAge(), car.getSpeed());
		}
		/**
		 * 생성자 학습 후, 새로운 인스턴스 형성 시 생성자의 형태로 만들어보는 것을 학습함
		 */
		Car boost1 = new Car("Boost 1", 500, 100, true);
		boost1.setManufactured(LocalDate.of(2025, 02, 26));

	}

}
