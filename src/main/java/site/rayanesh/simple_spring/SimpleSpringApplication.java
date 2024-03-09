package site.rayanesh.simple_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringApplication.class, args);
	}

	@RequestMapping(value = "/sum")
	public String hello(@PathVariable("x") Integer x, @PathVariable("y") Integer y) {
		Integer sum = x + y;
		return "Sum of " + x + " and " + y + " is " + sum;
	}

	@RequestMapping(value = "/mult")
	public String multiply(@PathVariable("x") Integer x, @PathVariable("y") Integer y) {
		Integer product = x * y;
		return "Product of " + x + " and " + y + " is " + product;
	}

	@RequestMapping(value = "/div")
	public String divide(@PathVariable("x") Integer x, @PathVariable("y") Integer y) {
		if (y == 0) {
			return "Cannot divide by zero";
		}
		Integer quotient = x / y;
		return "Quotient of " + x + " and " + y + " is " + quotient;
	}

	@RequestMapping(value = "/sub")
	public String subtract(@PathVariable("x") Integer x, @PathVariable("y") Integer y) {
		Integer difference = x - y;
		return "Difference of " + x + " and " + y + " is " + difference;
	}

}