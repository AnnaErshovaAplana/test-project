package calculator_OOP;
/**
 * класс для действий и типов входных чисел
 * @see #addition(Number...)
 * @see #deduction(Number...)
 * @see #multiplication(Number...)
 * @see #division(Number...)
 */

public abstract class Number {
    protected float value;

    public void setValue(float value) {
        this.value = value;
    }

    /**
     *
     * @param numbers значения введеных чисел для операции (м.б. больше 2х)
     * @return итогое число после выполнения операции
     */
    public float addition(Number ... numbers) {
        float result = this.value;
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
    public float deduction(Number ... numbers) {
        float result =  this.value;
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
    public float multiplication(Number ... numbers) {
        float result =  this.value;
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
    public float division(Number ... numbers) {
        float result =  this.value;
        for(Number num : numbers){
            result /= num.value;
        }
        return  result;
    }

}
