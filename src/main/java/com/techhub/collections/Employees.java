package com.techhub.collections;

import java.time.LocalDate;
import java.util.List;

public final class Employees {

    private Employees(){}

    public static List<Employee> getAllEMPLOYEE_LIST(){
        return List.of(new Employee(1,"Ram","Niwash", LocalDate.parse("2020-05-23"),20000,4,true,"Sirsa"),
                new Employee(2,"Purshtom", "Dass", LocalDate.parse("2019-09-25"),25000,3,false,"Chandigarh"),
                new Employee(3,"Diwaker", "Gupta", LocalDate.parse("2018-04-18"),35000,2,true,"Chandigarh"),
                new Employee(4,"Pawan", "Verma", LocalDate.parse("2010-12-11"),90000,6, true,"Bangalore"),
                new Employee(5,"Kuldeep", "Singh",LocalDate.parse("2021-11-27"),28000,5,true,"Sirsa"),
                new Employee(6,"Harish", "Kumar",LocalDate.parse("2023-03-15"),22000,4,false,"Bangalore"),
                new Employee(7,"Shiv", "Kumar",LocalDate.parse("2024-02-01"),55000,5,true,"Sirsa"),
                new Employee(8,"Naresh", "Kumar", LocalDate.parse("2016-08-05"),60000,3,true, "Bangalore"));
    }
}
