package com.capgemini.srapiservice.service.impl;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.capgemini.srapiservice.service.base.IMathService;

@Service
public class MathServiceImpl implements IMathService {

    public Double calculate(List<Double> data) {

        List<Double> sortedList = data.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        Double number1 = sortedList.get(0);
        Double number2 = sortedList.get(1);
        Double number3 = sortedList.get(2);

        Double result = Math.sqrt(square(number1) + square(number2) + square(number3));

        return result;
    }

    private Double square(Double number) {
        return number * number;
    }

}
