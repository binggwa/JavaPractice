# **2. 클래스 예제**
***
## 교통시스템
***
> 자동차에 대한 정보로 자동차를 표현할 방법이 필요함.
> 달리고 있는지, 손님이 몇명인지, 속도는 어떤지, 등
> 속도조절시 속도제한보다 커지지 않게 하고싶을수도있음
> 차가 말할 수 있게 설정하고픔. 차가 어느 속도에 도달하고 싶은데 너무 무거워서 못하겟어요 하고 속도제한을 걸수도있음 등

* 단순히 속성에 값을 집어넣는 식으로 코드를 설정하는게 아니라 실제로 그 파라미터와 관련된 코드를 불러와서 스스로 속도제어가 가능하게 설정.

해당 강의에선 당분간 디자인에만 치중
***
### 자동차라는 클래스.
***
* 속도, 가솔린, 엔진상태라는 attributes 모두 private이라 가정
* setspeed(), getspeed()라는 method
이 메서드는 속도를 설정하고, 속도를 얻는 두가지만 있음.

setSpeed를 통해 그 속도가 무엇인지 받아들일 수 있는 파라미터가 필요.
```java
setSpeed(int newSpeed)
```
여기서 이 이름(newSpeed)이 메서드가 받아들이는 이름이며 int가 된다.
***
모든 메서드가 값을 반환할 필요는 없다.
```java
int getSpeed()
```
* getSpeed의 값이 int값이며, ()의 void 는 메서드가 아무것도 반환하지 않는다는 뜻
***
Java Beans에 관한 읽기자료 
Link : [Java Beans](https://download.oracle.com/otndocs/jcp/7224-javabeans-1.01-fr-spec-oth-JSpec/) 
JavaBeans를 마스터하고 싶다면 사양을 읽고 검토 필요
***
	/**
	 * 읽기 전용 property를 만드는 방법에 대해서 학습
	 * 
	 * 자동차의 age property를 다른 age attribute 없이 만드는 방법
	 * 
	 * 읽을 수 있는 property를 만들기 위해서는, getter method가 필요하다. getter인 int getAge()는 값을 계산하거나 검색하는 방법을 보여주지 않는다.
	 * 
	 * LocalDate 클래스를 이용해 자동차의 생산일을 manufactured attribute에 저장하고, java 8의 new Time 패키지를 이용해 age property를 구현한다. 
	 * 
	 */
