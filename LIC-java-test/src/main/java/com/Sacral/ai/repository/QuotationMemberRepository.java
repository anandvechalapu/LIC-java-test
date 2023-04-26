@Repository
public interface QuotationMemberRepository extends JpaRepository<QuotationMember, Long> {

    @Query("DELETE FROM QuotationMember q WHERE q.batchId = :batchId AND q.quotationId = :quotationId")
    void removeQuotationMember(@Param("batchId") Long batchId, @Param("quotationId") Long quotationId);
    
    QuotationMember findByBatchIdAndQuotationId(Long batchId, Long quotationId);
    
    void calculateContribution(QuotationMember quotationMember);
    
    QuotationMember save(QuotationMember quotationMember);

}