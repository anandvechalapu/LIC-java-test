package com.test_code.repository;

import com.test_code.dto.CommonResponseDto;
import com.test_code.dto.PolicyServiceDto;
import com.test_code.dto.PolicyServiceRequestDto;
import com.test_code.exception.ApplicationException;
import com.test_code.exception.RequiredFieldException;
import com.test_code.exception.RequestValidationException;

public interface PolicyServicingControllerRepository {
 
    /**
     * Retrieves the policy service details by requesting the service type and policy service ID.
     *
     * @param policyServiceRequestDto PolicyServiceRequestDto object containing the service type and policy service ID
     * @return CommonResponseDto<PolicyServiceDto> object containing the policy service details
     * @throws ApplicationException when an application exception occurs
     * @throws RequiredFieldException when a required field is missing
     * @throws RequestValidationException when the request is invalid
     */
    CommonResponseDto<PolicyServiceDto> getPolicyServiceById(PolicyServiceRequestDto policyServiceRequestDto)
        throws ApplicationException, RequiredFieldException, RequestValidationException;
}