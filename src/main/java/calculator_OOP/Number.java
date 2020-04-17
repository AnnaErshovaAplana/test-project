package calculator_OOP;
/**
 * класс для действий и типов входных чисел
 * @see #addition(Number...)
 * @see #deduction(Number...)
 * @see #multiplication(Number...)
 * @see #division(Number...)
 */

public abstract class Number {
    protected double value;

    public void setValue(double value) {
        this.value = value;
    }

    /**
     *
     * @param numbers значения введеных чисел для операции (м.б. больше 2х)
     * @return итогое число после выполнения операции
     */
    public double addition(Number ... numbers) {
        double result = this.value;
        for(Number num : numbers){
            result += num.value;
        }
        return  result;
    }

    /**
     *
     * @param numbers значения введеных чисел, которые будут вычитаться из исходногоо число наследного класса Rational
     * @return итогое число после выполнения операции
     */
    public double deduction(Number ... numbers) {
        double result =  this.value;
        for(Number num : numbers){
            result -= num.value;
        }
        return  result;
    }

    /**
     *
     * @param numbers значения введеных чисел, на которые будет умножаться исходное число наследного класса Rational
     * @return итогое число после выполнения операции
     */
    public double multiplication(Number ... numbers) {
        double result =  this.value;
        for(Number num : numbers){
            result *= num.value;
        }
        return  result;
    }

    /**
     *
     * @param numbers значения введеных чисел, на которые делиться исходное число наследного класса Rational
     * @return итогое число после выполнения операции
     */
    public double division(Number ... numbers) throws Exception {
        double result = this.value;

        for (Number num : numbers) {
            if (num.value == (Integer) 0) {
                throw new Exception("Невозможно выполнить деление на ноль!");
            } else {
                result = (result / num.value);
            }
        } return result;
    }
}
