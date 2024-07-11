package com.test1;

public class RefernceFormatEntity {
	private Integer refernceFormatKey;
	private Integer recordKey;
	private String effectiveDate;
	private Integer paymentMode;
	private String instanctReferenceCode;
	private String transferModel;
	private String paymentFrom;
	private String legalType;
	private String entityState;
	private String modifiedDate;
	private String remarks;

	public RefernceFormatEntity() {

	}

	public RefernceFormatEntity(Integer refernceFormatKey, Integer recordKey, String effectiveDate, Integer paymentMode,
			String instanctReferenceCode, String transferModel, String paymentFrom, String legalType,
			String entityState, String modifiedDate, String remarks) {
		super();
		this.refernceFormatKey = refernceFormatKey;
		this.recordKey = recordKey;
		this.effectiveDate = effectiveDate;
		this.paymentMode = paymentMode;
		this.instanctReferenceCode = instanctReferenceCode;
		this.transferModel = transferModel;
		this.paymentFrom = paymentFrom;
		this.legalType = legalType;
		this.entityState = entityState;
		this.modifiedDate = modifiedDate;
		this.remarks = remarks;
	}

	public Integer getRefernceFormatKey() {
		return refernceFormatKey;
	}

	public void setRefernceFormatKey(Integer refernceFormatKey) {
		this.refernceFormatKey = refernceFormatKey;
	}

	public Integer getRecordKey() {
		return recordKey;
	}

	public void setRecordKey(Integer recordKey) {
		this.recordKey = recordKey;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Integer getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(Integer paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getInstanctReferenceCode() {
		return instanctReferenceCode;
	}

	public void setInstanctReferenceCode(String instanctReferenceCode) {
		this.instanctReferenceCode = instanctReferenceCode;
	}

	public String getTransferModel() {
		return transferModel;
	}

	public void setTransferModel(String transferModel) {
		this.transferModel = transferModel;
	}

	public String getPaymentFrom() {
		return paymentFrom;
	}

	public void setPaymentFrom(String paymentFrom) {
		this.paymentFrom = paymentFrom;
	}

	public String getLegalType() {
		return legalType;
	}

	public void setLegalType(String legalType) {
		this.legalType = legalType;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
