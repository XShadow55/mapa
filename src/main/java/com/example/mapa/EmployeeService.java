package com.example.mapa;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public interface EmployeeService {
    Set add(String firstName, String lastName);
    String  remove(String firstName,String lastName);
    Boolean search(String firstName,String lastName);


}