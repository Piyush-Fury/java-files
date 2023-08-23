/*
        Exercise 6: You have to create a custom calculator with following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid input Exception ex: 8 & 9
        2. Cannot divide by 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
*/
class InvalidInputException extends Exception{
    @Override
    public String toString(){
        return "cannot add 8 & 9";
    }
}

class MaxInputException extends Exception{
    @Override
    public String toString(){
        return "Input cannot be greater then 100000";
    }
}

class CannotDivindeByZero extends Exception{
    @Override
    public String toString(){
        return "you cannot divide it by zero";
    }
}

class maxMultipleInputException extends Exception{
    @Override
    public String toString(){
        return "input cannot be greater then 7000";
    }
}

class customCalculator {
    public double add(double a, double b) throws InvalidInputException, MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        if(a==8 && b==9){
            throw new InvalidInputException();
        }
        return a+b;
    }

    public double subtract(double a, double b) throws MaxInputException{
        if(a>100000 || b>100000){
            throw new MaxInputException();
        }
        return a-b;
    }

    public double multiplication(double a, double b)throws MaxInputException, maxMultipleInputException{
        if(a>100000||b>100000){
            throw new MaxInputException();
        }
        if(a>7000||b>7000){
            throw new maxMultipleInputException();
        }
        return a*b;
    }

    public double division(double a, double b) throws CannotDivindeByZero,MaxInputException{
        if(a>100000||b>100000){
            throw new MaxInputException();
        }
        if(b==0){
            throw new CannotDivindeByZero();
        }
        return a/b;
    }
}


public class calculator{
    public static void main(String[] args) throws MaxInputException, InvalidInputException, CannotDivindeByZero, maxMultipleInputException {
        customCalculator c = new customCalculator();
        c.add(1,2);
    }
}