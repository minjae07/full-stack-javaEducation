package kr.or.shi;

/*
 *	1. AOP의 개요와 용어
 *		1)핵심기능과 부가기능
 *			-업무(Biz)로직을 포함하는 기능을 핵심기능(Core Concerns).
 *			-핵심기능을 도와주는 부가적인 기능(로깅,보안 등)을 부가기능(Cross-cutting Concerns)이라고 함.
 *			-객체지향의 기본 원칙을 적용하여도 핵심기능에서 부가기능을 분리해서 모듈화하는 것은 매우 어려움.
 *
 *		2)AOP(Aspect Oriented Programming)
 *			-애플리케이션에서의 관심사의 분리(기능의 분리) 즉, 부가적인 기능을 분리함.
 *			-분리한 부가기능을 애스펙트(Aspect)라는 독특한 모듈형태로 만들어서 설계하고 개발하는 방법.
 *			-OOP를 적용하여도 핵심기능에서 부가기능을 쉽게 분리된 모듈로 작성하기 어려운 문제점을 AOP가 해결해 줌.
 *
 *		3)Spring AOP의 특징
 *			-(1)Spring은 프록시(Proxy) 기반 AOP를 지원함.
 *				-Spring은 타겟(target)객체에 대한 프록시를 만들어 제공함.
 *				-타겟을 감싸는 프록시는 실행시간(runtime)에 생성됨.
 *				-프록시는 어드바이스(부가기능을 정의한 코드)를 타겟 객체에 적용하면서 생성되는 객체임.
 *			-(2)프록시(Proxy)가 호출을 가로챔(Intercept)
 *				-전처리 어드바이스
 *				-후처리 어드바이스
 *			-(3)Spring AOP는 메서드 조인 포인트만 지원함. 
 *
 *		4)AOP의 용어
 *			-(1)애스펙트(Aspect)
 *				-부가기능을 정의한 코드인 어드바이스(Advice) + 어디에 적용할지를 결정하는 포인트컷(PointCut)을 합친 개념임.
 *				 	Aspect = Advice + PointCut
 *			-(2)타겟(Target)
 *				-핵심기능을 담고 있는 모듈로, 타겟은 부가기능을 부여할 대상이 됨.
 *			-(3)어드바이스(Advice)
 *				-타겟에 제공할 부가기능을 담고 있는 모듈임.
 *			-(4)조인 포인트(Join Point)
 *				-어드바이스가 적용될수 있는 위치를 말함.
 *				-타겟 객체가 구현한 인터페이스의 모든 메서드는 조인 포인트가 됨.
 *			-(5)포인트 컷(PointCut)
 *				-어드바이스를 적용할 타겟의 메서드를 선별하는 정규표현식임.
 *			-(6)어드바이서(Advisor)
 *				- Advice + PointCut
 *			-(7)위빙(Weaving)
 *				- 포인트 컷에 의해서 결정된 타겟의 조인 포인트에 부가 기능을 삽입하는 과정을 뜻함.
 *				- 위빙은 AOP가 핵심기능(타겟)의 코드에 영향을 주지 않으면서 필요한 부가기능(어드바이스)을 추가할수 있도록 해주는 핵심적인 처리과정임.
 */

public class Calculator {
	public void add(int x, int y) {
		int result = x + y;
		System.out.println("결과 : " + result);
	}
	
	public void subtract(int x, int y) {
		int result = x - y;
		System.out.println("결과 : " + result);
	}
	
	public void multiply(int x, int y) {
		int result = x * y;
		System.out.println("결과 : " + result);
	}
	
	public void divide(int x, int y) {
		int result = x / y;
		System.out.println("결과 : " + result);
	}
	
}





























