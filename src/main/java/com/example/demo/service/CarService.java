package com.example.demo.service;

import com.example.demo.entity.Car;
import org.springframework.stereotype.Service;

@Service
public interface CarService {

    Car save(Car car);
}
