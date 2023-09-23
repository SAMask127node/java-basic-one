package ru.otus.sam127.basic.lesson15HW;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {


        ArrayList<Integer> arrList = createArrayList(3,9);
        System.out.println(arrList);

        int sum =  sumArrayList(arrList);
        System.out.println(sum);

        ArrayList<Integer> modifiedArrayList = modifyArrayList(3, arrList);
        System.out.println(modifiedArrayList);

        ArrayList<Integer> increasedArrayList = increaseArrayListElements(3, arrList);
        System.out.println(increasedArrayList);

        ArrayList<Employee> empls = new ArrayList<>();
        empls.add(new Employee("E1", 30));
        empls.add(new Employee("E2", 22));
        empls.add(new Employee("E3", 25));

        ArrayList<String> employeesNames = getEmployeesNames(empls);
        System.out.println(employeesNames);

        ArrayList<Employee> filteredEmployees = filterEmployeesByMinAge(empls,22);
        ArrayList<String> filteredEmployeesNames = getEmployeesNames(filteredEmployees);
        System.out.println(filteredEmployeesNames);

        boolean isAverageAgeGreaterVal = checkEmployeesByAverageAge(empls,60);
        System.out.println(isAverageAgeGreaterVal);

        Employee youngestEmployee = getYoungestEmployee(empls);
        System.out.println(youngestEmployee.getName());
    }
    // Реализуйте метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList с набором последовательных значений в указанном диапазоне (min и max включительно, шаг - 1);
    public static ArrayList<Integer> createArrayList(int min, int max){
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = min; i < max+1; i++){
            arrList.add(i);
        }
        return arrList;
    }
    // Реализуйте метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы, значение которых больше 5, и возвращающий сумму;
    public static int sumArrayList(ArrayList<Integer> arrList){
        int sum=0;

        for (Integer i : arrList){
            if (i > 5)
                sum += i;
        }

        return sum;
    }
    // Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, метод должен переписать каждую заполненную ячейку списка указанным числом;
    public static ArrayList<Integer> modifyArrayList(Integer val, ArrayList<Integer> arrList) {
        for (int i = 0; i < arrList.size(); i++){
            arrList.set(i, val);
        }
        return arrList;
    }
    // Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, увеличивающий каждый элемент списка на указанное число;
    public static ArrayList<Integer> increaseArrayListElements(Integer val, ArrayList<Integer> arrList) {
        for (int i = 0; i < arrList.size(); i++){
            Integer a = arrList.get(i);
            arrList.set(i, (a + val));
        }
        //        arrList.replaceAll(integer -> (integer + val));
        return arrList;
    }
    // Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
    public static ArrayList<String> getEmployeesNames(ArrayList<Employee> empls) {
        ArrayList<String> arrList = new ArrayList<>();
        for(Employee e : empls){
            arrList.add(e.getName());
        }

        return arrList;
    }
    // Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст, и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
    public static ArrayList<Employee> filterEmployeesByMinAge(ArrayList<Employee> empls, Integer val) {
        ArrayList<Employee> arrList = new ArrayList<>();
        for(Employee e : empls){
            if (e.getAge() > val ){
                arrList.add(e);
            }
        }

        return arrList;
    }
    // Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст, и проверяющий что средний возраст сотрудников превышает указанный аргумент;
    public static boolean checkEmployeesByAverageAge(ArrayList<Employee> empls, Integer val) {
        boolean b;
        int sum = 0;

        for(Employee e : empls){
            sum +=e.getAge();
        }
        b =  sum/empls.size() > val;
        return b;
    }
    // Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого молодого сотрудника.
    public static Employee getYoungestEmployee(ArrayList<Employee> empls) {
        Employee empl = empls.get(0);
        int val = empl.getAge();

        for (int i = 1; i < empls.size()-1; i++){
            Employee e = empls.get(i);
            if (e.getAge() < val ){
                val = e.getAge();
                empl = e;
            }
        }

       return empl;
    }
}
