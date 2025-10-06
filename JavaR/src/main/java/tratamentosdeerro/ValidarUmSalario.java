package tratamentosdeerro;

public class ValidarUmSalario {
    public static String validateSalary(int salary, boolean strict) {

        if(salary < 0){
            throw new IllegalArgumentException("Salary cannot be negative");
        }

        if (salary > 1000000){
            throw new IllegalArgumentException("Salary cannot be greater than 1000000");
        }

        if(strict && salary == 0){
            throw new IllegalArgumentException("Salary cannot be zero in strict mode");
        }

        String salario = String.valueOf(salary);

        return salario;
    }
    public static void main(String[] args) {


    }
}
