package Calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    List<String> history = new ArrayList<>();

    public double add(double left, double right) {
        return left + right;
    }

    public double multiply(double left, double right) {
        return left * right;
    }

    public double divide(double left, double right) {
        return left / right;
    }

    public double subtract(double left, double right) {
        return left - right;
    }

    public double remainder(double left, double right) {
        return left % right;
    }
    public void clearHistory (){
         history.clear();
    }
    public void addHistory(String calculation){
        history.add(calculation);
    }

    public List<String> getHistory() {
        return history;
    }
}




