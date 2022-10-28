package org.example;

import org.example.model.Employee;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        var employeeClass = new Employee();
        funWithTypes(employeeClass.getClass());
        funWithConstructors(employeeClass.getClass());
        funWithMethods(employeeClass.getClass());
    }



    private static void funWithTypes(Class<?> clazz) {

//        String className = clazz
//                .getSimpleName()
//                //.getName()
//                //.getPackageName()
//                ;
//
//        System.out.println(className);
//
//        String superClassName = clazz.getSuperclass()
//                .getSimpleName()
//                //.getName()
//                //.getPackageName()
//        ;
//
//        System.out.println(superClassName);
//
//        Arrays.stream(clazz.getInterfaces())
//                .forEach(x->
//                      System.out.println(x.getName())
//                );
//
//        Arrays.stream(clazz.getSuperclass().getInterfaces())
//                .forEach(x->
//                        System.out.println(x.getName())
//                );
    }

    private static void funWithConstructors(Class<?> clazz) {

//        var constructors = Arrays.stream(clazz.getConstructors()).toList();
//        message("konstruktory klasy Employee");
//        constructors.forEach(constructor->{
//                    var name = constructor.getName();
//                    var arguments = constructor.getParameters();
//                    var modifiers = constructor.getModifiers();
//                    System.out.println(Modifier.toString(modifiers) + " " + name +"has" +constructor.getParameterCount() +" parameters");
//                });
//
//        var employees = constructors
//                .map(constructor-> {
//                    try {
//                        if(constructor.getParameterCount()==1)
//                            return constructor.newInstance(100);
//                    } catch (Exception e) {
//                    }
//                    return null;
//                }).filter(x->x!=null).toList();
//        System.out.println(employees.get(0));
    }
    private static void funWithMethods(Class<?> clazz) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

//        message("Wszystkie metody klasy Employee (także metody klas nadrzędnych)");
//        var methodList = Arrays.stream(clazz.getMethods()).toList();
//
//        methodList.forEach(
//                method->{
//                    var name = method.getName();
//                    var modifier = method.getModifiers();
//                    var modifierInString = Modifier.toString(modifier);
//                    var parameters = method.getParameterTypes();
//                    System.out.println(modifierInString +" " + name + " has " + method.getParameterCount()+ " parameters");
//                }
//        );
//
//        message("Metody z klasy Employee");
//        var declaredMethods = Arrays.stream(clazz.getDeclaredMethods());
//        declaredMethods.forEach(
//                method->{
//                    var name = method.getName();
//                    var modifier = method.getModifiers();
//                    var modifierInString = Modifier.toString(modifier);
//                    var parameters = method.getParameterTypes();
//                    System.out.println(modifierInString +" " + name + " has " + method.getParameterCount()+ " parameters");
//                }
//        );

//        message("Test działania/wywoływania metod");
//        var employee = new Employee("jan", "nowak", 5000);
//
//        var printMethod = clazz.getMethod("printDetails");
//        printMethod.invoke(employee);
//        var setIdMethod = clazz.getDeclaredMethod("setIncome", double.class);
//        setIdMethod.invoke(employee, 1200);
//        var getIdMethod = clazz.getDeclaredMethod("getIncome");
//        System.out.println("nowa pensja: " + getIdMethod.invoke(employee));
    }

    public static void message(String message){
        System.out.println("\n****************************************************");
        System.out.println("\t\t"+message);
        System.out.println("****************************************************\n");
    }
}