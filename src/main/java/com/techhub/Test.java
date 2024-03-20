package com.techhub;

import com.techhub.collections.Employee;
import com.techhub.collections.Employees;

import java.io.DataInputStream;
import java.io.InputStream;
import java.time.Year;
import java.util.*;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        Integer[][] intArr = {{1,2}, {3,4}, {5,6}, {7,8}};
        Stream<Integer[]> myStream = Stream.of(intArr);

        Stream<Integer> stream = myStream.flatMap(arr->{
            return Stream.of(arr);
        });

        stream.forEach(System.out::println);
    }
}
