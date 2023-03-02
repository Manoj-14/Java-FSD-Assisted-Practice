package com.assisstedPractices.section2;

public class InnerClassess211 {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.hello();
		oc.method1();
		oc.method2();
	}
}

class OuterClass{
	class InnerClass{
		void hello() { 
			System.out.println("Hello....");
		}
	}
	
	void method1() {
		
		class ClassInMethod{			
			void print() {
				System.out.println("Class Inside the Method....");
			}
		}
		ClassInMethod cim = new ClassInMethod();
		cim.print();
				
	}
	
	void method2() {
		Interface1 anylc = new Interface1() {
			
			@Override
			public void printLine() {
				System.out.println("Anonymus class method....");
			}
		};
		
		anylc.printLine();
	}
}

interface Interface1 {
	void printLine();
}