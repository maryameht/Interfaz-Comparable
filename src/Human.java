
//nombre
//salario
//clasificar a los humanos segun el salario
// del más grande a ,as pequeño

public class Human implements Comparable<Human> {

    //cremoas las variables
    private String name;
    private float salary;

    public Human (String name, float salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return this.name;
    }

    public float getSalary() {
        return this.salary;
    }

    //método para imprimir
    public String toString() {
        return "Name : " + this.getName() + " - Salary : " + this.getSalary();
    }
    @Override
    public int compareTo(Human human) {
        if (this.salary == human.getSalary()) {
            return 0;
        } else if (this.salary > human.getSalary()) {
            return 1;
        } else {
            return -1;
        }
    }
}


