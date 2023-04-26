package com.Sacral.ai.controller;

import com.Sacral.ai.model.QuotationMember;
import com.Sacral.ai.service.QuotationMemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quotation-member")
public class QuotationMemberController {

    @Autowired
    private QuotationMemberService quotationMemberService;

    @DeleteMapping("/{batchId}/{quotationId}")
    public void removeQuotationMember(@PathVariable Long batchId, @PathVariable Long quotationId) {
        quotationMemberService.removeQuotationMember(batchId, quotationId);
    }

    @GetMapping("/{batchId}/{quotationId}")
    public QuotationMember findByBatchIdAndQuotationId(@PathVariable Long batchId, @PathVariable Long quotationId) {
        return quotationMemberService.findByBatchIdAndQuotationId(batchId, quotationId);
    }

    @PutMapping
    public void calculateContribution(@RequestBody QuotationMember quotationMember) {
        quotationMemberService.calculateContribution(quotationMember);
    }

    @PostMapping
    public QuotationMember save(@RequestBody QuotationMember quotationMember) {
        return quotationMemberService.save(quotationMember);
    }

}