# OOP

OOP(Object-Oriented-Programming)을 정리합니다.
OOP하면 '5원칙과 4가지 특성'이 자동적으로 튀어 나와야합니다.:star:
OOP를 사용하면 코드의 재사용성을 높이고, 유지보수를 쉽게해주며, 간결한 코드를 작성할 수 있습니다.
대신, 간단한 프로그램에서는 처리 시간이 절차지향적 언어보다 비교적 오래 걸릴 수 있고, 프로그램을 설계할 때 많은 고민과 시간을 투자해야합니다.

# Index
1. [OOP 4가지 특징(기본)](#oop-4가지-특징)
2. [SOLID 원칙(5원칙)](#solid-원칙)

## OOP 4가지 특징
1. 추상화 (Abstraction)
2. 캡슐화 (Encapsulation)
3. 상속 (Inheritance)
4. 다형성 (Polymorphism)

### 1. 추상화 - Abstraction
 현실 세계의 사실에서 주어진 문제의 중요한 측면을 주목하여 설명하는 방식.
실세계의 객체에서 불필요한 부분을 제거하여 필요한 부분만을 간결하고 이해하기 쉬운 클래스로 만드는 작업.
속성과 행동으로 추상화를 실현.

### 2. 캡슐화 - Encapsulation
 객체와 객체 간의 의사 소통을 위한 정보만을 노출. 실제 내부 구현 정보는 숨기는 원리.
추상화 과정에서 행위를 클래스 단위로 하나로 묶고, 실제 내부 구현. 객체의 자료와 행위를 클래스 단위로 하나로 묶고, 실제 내부 구현. 내부 내용을 외부에 감추는 것.

 정보 은닉(information hiding)이 발생. 캡슐화 과정에서 클래스 내부 구현을 외부에 숨김.
내부에서 일어나는 일은 관심없음.

### 3. 상속 - Inheritance
 '물려받는다'라는 특징의 상속
객체지향의 가장 핵심이 되는 개념
프로그램을 쉽게 확장할 수 있도록 해주는 강력한 수단
상위 클래스와 하위 클래스 간의 관계: 계층도
상속 장점. 공통의 특성을 하위 클래스마다 반복적으로 기술하지 않고 한 번만 기술하기 때문에 중복을 줄여 재사용성의 효과.

<image src="./image/inheritance.png" alt="inheritance zero-base">

### 4. 다형성 - Polymorphism
 원래 생물학적 용어로 여러(poly) 형태(morphy)를 의미.
외부에 보이는 모습은 한 가지 형태이지만 실질적으로 쓰이는 기능은 여러 가지 역할을 수행한다는 의미.


다형성의 예. 
    오버로딩(overloading) : 하나의 클래스에서 메소드이름은 같지만, 파라미터 타입이 다른 것.(순서가 달라도 다른것).
    
    오버라이딩(overriding) : 부모 클래스의 메소드를 자식 클래스의 용도에 맞게 재정의하여 코드의 재사용성을 높임.

---

## SOLID 원칙
> [Clean Code]의 저자 로버트 마틴이 객체 지향 프로그래밍 및 설계의 다섯 가지 가본 원칙을 마이클 패더스가 SOLID라는 약어로 소개한 것입니다.

- S (SRP: Single Responsibility Principle)
  
  한 클래스는 하나의 책임만 가져야 한다.

- O (OCP: Open/Closed Principle)
  
  확장에는 열려 있으나, 변경에는 닫혀 있어야 한다.

- L (LSP: Liskov's Substitution Principle)
  
  프로그램의 객체는 프로그램의 정확성을 깨뜨리지 않으면서 하위 타입의 인스턴스로 바꿀 수 있어야 한다.

- I (ISP: Interface Segregation Principle)
  
  특정 클라이언트를 위한 인터페이스 여러 개가 범용 인터페이스 하나보다 낫다.

- D (DIP: Dependency Inversion Principle)
  
  추상화에 의존한다. 구체화에 의존하면 안된다.


참고할 만한 글
- [넥스트리](https://www.nextree.co.kr/p6960/)
- [카일님 기술블로그](https://velog.io/@kyle/%EA%B0%9D%EC%B2%B4%EC%A7%80%ED%96%A5-SOLID-%EC%9B%90%EC%B9%99-%EC%9D%B4%EB%9E%80)
