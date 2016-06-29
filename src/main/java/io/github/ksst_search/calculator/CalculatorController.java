package io.github.ksst_search.calculator;

import io.github.ksst_search.calculator.CalculatorModel;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class CalculatorController {

    private final AtomicLong counter = new AtomicLong();

    // localhost:8080/calculator?a="1"&b="2"&op="+"
    //{"id":"1", "op":"+"...}
    @RequestMapping("/calculator")
    public CalculatorModel calculator(@RequestParam(value="op", defaultValue="+") String op,
                                      @RequestParam(value="a", defaultValue="1") String strA,
                                      @RequestParam(value="b", defaultValue="1") String strB)

    {
        return new CalculatorModel(counter.incrementAndGet(), op, Double.parseDouble(strA), Double.parseDouble(strB));
    }
}