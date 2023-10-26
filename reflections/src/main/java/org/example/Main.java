package org.example;

import org.example.model.Employee;
import org.example.model.IHaveId;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        var employee = new Employee();
//        funWithTypes(employee.getClass());
//        funWithConstructors(employee.getClass());
//        funWithMethods(employee.getClass());
    }



    private static void funWithTypes(Class<?> clazz) {

//        String className = clazz
//                //.getSimpleName()
//                //.getName()
//                .getPackageName()
//                ;
//
//        System.out.println(className);


        /**
         * Superklasa
         */
//        String superClassName = clazz.getSuperclass()
//                //.getSimpleName()
//                //.getName()
//                .getPackageName()
//        ;
//
//        System.out.println(superClassName);

        /**
         * Interfejsy
         */
//        var interfaces = Arrays.stream(clazz.getInterfaces()).toList();
//
//        interfaces.forEach(x->
//                      System.out.println(x.getName())
//                );

        /**
         * Interfejsy super klasy
         */
//        var superClassInterfaces = Arrays.stream(clazz.getSuperclass().getInterfaces()).toList();
//
//        superClassInterfaces.forEach(x->
//                        System.out.println(x.getName())
//                );
    }

    private static void funWithConstructors(Class<?> clazz) {

        /**
         * Pobieranie konstruktorów
         */

//        var constructors = Arrays.stream(clazz.getConstructors()).toList();
//        message("konstruktory klasy Employee");

        /**
         * badanie modyfikatorów, parametrów oraqz nazwy
         */

//        constructors.forEach(constructor->{
//                    var name = constructor.getName();
//                    var arguments = constructor.getParameters();
//                    var modifiers = constructor.getModifiers();
//                    System.out.println(Modifier.toString(modifiers) + " " + name +" has " +constructor.getParameterCount() +" parameters");
//                });

        /**
         * Przykład tworzenia obiektów
         */

//        var employees = constructors.stream()
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

        /**
         * pobieranie wszystkich metod
         */
//        message("Wszystkie metody klasy Employee (także metody klas nadrzędnych)");
//        var methodList = Arrays.stream(clazz.getMethods()).toList();

        /**
         * sprawdzanie sygnatury
         */

//        methodList.forEach(
//                method->{
//                    var name = method.getName();
//                    var modifier = method.getModifiers();
//                    var modifierInString = Modifier.toString(modifier);
//                    var parameters = method.getParameterTypes();
//                    System.out.println(modifierInString +" " + name + " has " + method.getParameterCount()+ " parameters");
//                }
//        );

        /**
         * pobranie metod zadeklarowanych tylko w danej klasie (omijane sa metody z superklas)
         */

//        var tmp = new Employee();
//        message("Metody z klasy Employee");
//        var declaredMethods = Arrays.stream(clazz.getDeclaredMethods());

        /**
         * tak jak wyzej sprawdzanie sygnatur i parametrów metod
         */

//        declaredMethods.forEach(
//                method->{
//                    var name = method.getName();
//                    var modifier = method.getModifiers();
//                    var modifierInString = Modifier.toString(modifier);
//                    var parameters = method.getParameterTypes();
//                    System.out.println(modifierInString +" " + name + " has " + method.getParameterCount()+ " parameters");
//                }
//        );
//
        /**
         * wywoływanie metod
         */

//        message("Test działania/wywoływania metod");
//        var employee = new Employee("jan", "nowak", 5000);
//
//        var printMethod = clazz.getMethod("printDetails");
//        printMethod.invoke(employee);

        /**
         * wywołanie getterów i setterów
         */

//        var setIdMethod = clazz.getDeclaredMethod("setIncome", double.class);
//        setIdMethod.invoke(employee, 1200);
//        var getIdMethod = clazz.getDeclaredMethod("getIncome");
//        System.out.println("nowa pensja: " + getIdMethod.invoke(employee));
//
//        message("wywoływanie metody prywatnej");
//        //employee.secretAction(); // nie można tak !!

        /**
         * wywołanie metod prywatnych
         */

//        var secretMethod = clazz.getDeclaredMethod("secretAction");
//        secretMethod.setAccessible(true);
//        secretMethod.invoke(employee);
    }

    public static void message(String message){
        System.out.println("\n****************************************************");
        System.out.println("\t\t"+message);
        System.out.println("****************************************************\n");
    }
}