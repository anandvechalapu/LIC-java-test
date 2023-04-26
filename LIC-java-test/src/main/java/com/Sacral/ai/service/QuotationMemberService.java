package com.Sacral.ai.service;

import com.Sacral.ai.entity.QuotationMember;
import com.Sacral.ai.repository.QuotationMemberRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;

@Service
public class QuotationMemberService {

    @Autowired
    private QuotationMemberRepository quotationMemberRepository;

    @Autowired
    private EntityManager entityManager;

    public void removeQuotationMember(Long batchId, Long quotationId) {
        quotationMemberRepository.removeQuotationMember(batchId, quotationId);
    }

    public QuotationMember findByBatchIdAndQuotationId(Long batchId, Long quotationId) {
        return quotationMemberRepository.findByBatchIdAndQuotationId(batchId, quotationId);
    }

    public void calculateContribution(QuotationMember quotationMember) {
        quotationMemberRepository.calculateContribution(quotationMember);
    }

    public QuotationMember save(QuotationMember quotationMember) {
        return quotationMemberRepository.save(quotationMember);
    }

}