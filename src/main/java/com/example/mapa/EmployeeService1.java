
package com.example.mapa;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


@Service
public class EmployeeService1 implements EmployeeService{
    int value = 0;

    private final Map<String,Integer> people = new HashMap<>();


    @Override
    public Set add(String name, String lastname){

        if (!people.containsKey(name+" "+lastname)){
            people.put(name+" "+lastname,value);
            value++;
        }

        return people.keySet();

    }
    @Override
    public  String remove(String name,String lastname){
        String d = name+" "+lastname;
        if (people.containsKey(d)) {

            people.remove(d);
        }
        return d;
    }
    @Override
    public  Boolean search(String name,String lastname){
        return people.containsKey(name+" "+lastname);

    }

    @Override
    public Integer size() {
        return people.size();
    }


}

