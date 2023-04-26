package com.test_code.controller;

import com.test_code.dto.CommonResponseDto;
import com.test_code.dto.PolicyServiceDto;
import com.test_code.dto.PolicyServiceRequestDto;
import com.test_code.exception.ApplicationException;
import com.test_code.exception.RequiredFieldException;
import com.test_code.exception.RequestValidationException;
import com.test_code.service.PolicyServicingControllerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policy-service")
public class PolicyServicingController {

    @Autowired
    private PolicyServicingControllerService policyServicingControllerService;

    @PostMapping
    public CommonResponseDto<PolicyServiceDto> getPolicyServiceById(@RequestBody PolicyServiceRequestDto policyServiceRequestDto)
        throws ApplicationException, RequiredFieldException, RequestValidationException {
        return policyServicingControllerService.getPolicyServiceById(policyServiceRequestDto);
    }

}