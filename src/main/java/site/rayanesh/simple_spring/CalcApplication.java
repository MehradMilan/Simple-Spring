package site.rayanesh.simple_spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalcApplication {

    @RequestMapping(value = "/")
    public String hello() {
        return "Welcome to Calc!";
    }

    @GetMapping("/sum/{x}/{y}")
    public String sum(@PathVariable("x") Integer x, @PathVariable("y") Integer y) {
        int sum = x + y;
        return "Sum of " + x + " and " + y + " is " + sum;
    }

    @RequestMapping(value = "/mult/{x}/{y}")
    public String multiply(@PathVariable("x") Integer x, @PathVariable("y") Integer y) {
        int product = x * y;
        return "Product of " + x + " and " + y + " is " + product;
    }

    @RequestMapping(value = "/div/{x}/{y}")
    public String divide(@PathVariable("x") Integer x, @PathVariable("y") Integer y) {
        if (y == 0) {
            return "Cannot divide by zero";
        }
        int quotient = x / y;
        return "Quotient of " + x + " and " + y + " is " + quotient;
    }

    @RequestMapping(value = "/sub/{x}/{y}")
    public String subtract(@PathVariable("x") Integer x, @PathVariable("y") Integer y) {
        int difference = x - y;
        return "Difference of " + x + " and " + y + " is " + difference;
    }
}
