package com.capgemini.srapiservice.controller;

import java.text.DecimalFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.srapiservice.model.CalculateAPIInput;
import com.capgemini.srapiservice.service.base.IMathService;

@RestController
//@RequestMapping("/mathservice")
public class MathServiceController {

    @Autowired
    private IMathService mathService;

    @RequestMapping(value = "/calculate", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody ResponseEntity<String> calculate(@RequestBody CalculateAPIInput apiInput)
            throws Exception {

        if (apiInput.getData() == null || apiInput.getData().size() < 3) {
            return new ResponseEntity<>("Invalid Input", HttpStatus.UNPROCESSABLE_ENTITY);
        } else {
            DecimalFormat df2 = new DecimalFormat("#.##");
            Double result = mathService.calculate(apiInput.getData());
            String resultStr = "{" + "\"output\":" + df2.format(result) + "}";
            return new ResponseEntity<>(resultStr, HttpStatus.OK);
        }
    }
}
