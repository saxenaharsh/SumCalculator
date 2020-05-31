package com.HarshSaxena;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;


    public void setFirstNumber(double firstNumber){
        if(firstNumber == 0.0){
            this.firstNumber = 0;
        }else{
            this.firstNumber = firstNumber;
        }

    }
    public double getFirstNumber(){
        return this.firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        if(secondNumber == 0.0){
            this.secondNumber = 0.0;
        }else{
            this.secondNumber = secondNumber;
        }

    }
    public double getSecondNumber(){
        return this.secondNumber;
    }
    public double getAdditionResult(){
        return (this.firstNumber + this.secondNumber) ;


    }
    public double getSubtractionResult(){
       return (this.firstNumber - this.secondNumber);


    }
    public double getMultiplicationResult(){
        return (this.firstNumber * this.secondNumber);

    }
    public double getDivisionResult(){
        if(this.secondNumber == 0 ){
            return 0;
        }else{
          return (this.firstNumber / this.secondNumber);

        }

    }


}


