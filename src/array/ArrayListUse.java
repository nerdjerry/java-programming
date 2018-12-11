package array;

import java.util.ArrayList;
import java.util.List;

public class ArrayListUse {

    public static void main(String args[]){
        //Create new Arraylist
        List<Employee> list = new ArrayList<>();

        //Using add method to add objects
        list.add(new Employee("Prateek","Singhal", 123));
        list.add(new Employee("Aditi","Singhal", 345));
        list.add(new Employee("Komal","Aggarwal",222));

        //Get object at particular index
        System.out.println(list.get(2));

        //Print all employeess
        list.forEach(employee -> System.out.println(employee));

        //Check empty or not
        System.out.println(list.isEmpty());

        //Print size of list
        System.out.println(list.size());

        //Check equality if list contains an employee
        System.out.println(list.contains(new Employee("Prateek","Singhal",123)));

        //Get index of an element
        System.out.println(list.indexOf(new Employee("Aditi","Singhal",345)));

        //Set an element
        list.set(2, new Employee("Somya","Singhal",125));

        //Add at a location
        list.add(1, new Employee("Sonal","Singhal",431));

        list.remove(1);
        //Print all employeess
        list.forEach(employee -> System.out.println(employee));

        //To array
        Employee[] employees = list.toArray(new Employee[list.size()]);
        for(Employee employee: employees){
            System.out.println(employee);
        }


    }
}
