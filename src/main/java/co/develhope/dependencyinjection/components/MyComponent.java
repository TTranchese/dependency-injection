package co.develhope.dependencyinjection.components;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {
	public String myComponentName;
	
	public MyComponent() {
	}
	
	public MyComponent(String myComponentName) {
		System.out.println("component created");
		this.myComponentName = myComponentName;
	}
	
	public String getMyComponentName() {
		System.out.println("component name called");
		return myComponentName;
	}
}
