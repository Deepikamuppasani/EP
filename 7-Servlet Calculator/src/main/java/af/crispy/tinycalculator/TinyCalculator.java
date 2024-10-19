package af.crispy.tinycalculator;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Tom M. Riddle
 */
@Named
@RequestScoped
public class TinyCalculator {

    public TinyCalculator() {
    }
    
    private double param1;
    private double param2;
    private double result;

    public double getParam1() {
        return param1;
    }

    public void setParam1(double _param1) {
        this.param1 = _param1;
    }

    public double getParam2() {
        return param2;
    }

    public void setParam2(double _param2) {
        this.param2 = _param2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double _result) {
        this.result = _result;
    }
    
    public String add() {
        this.result = this.param1 + this.param2;
        return "";
    }
    
    public String subtract() {
        this.result = this.param1 - this.param2;
        return "";
    }
    
    public String multiply() {
        this.result = this.param1 * this.param2;
        return "";
    }
    
    public String divide() {
        this.result = this.param1 / this.param2;
        return "";
    }
    
}
