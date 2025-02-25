package com.learnquest.demos;

/**
 * CoreJava 강의 Java를 사용하는 객체 지향 프로그래밍 소개
 * Module 2 객체 예제
 * 
 * @author 이병관
 * @since 2025.02.25
 * 
 * LocalDate와 Period 클래스를 불러와 자동차의 manufactured로부터 age를 판별.
 */
import java.time.LocalDate;
import java.time.Period;

public class Car {
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

	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	private int gasoline;
	private boolean engineState;

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

	}

}
