package com.test1;

public class RefernceFormatEntityInfoModel {
	private Integer refernceFormatKey;
	private String swiftGroupKey;
	private String groupParentKey;
	private String instStatus;
	private String copGroupKey;
	private String ssiGroupKey;
	private String ibanKey;
	private String ifscIdentifier;
	private String transactionCode;
	private String ibpsMode;
	private String creationdate;
	private String entityState;
	private String modifiedDate;

	public RefernceFormatEntityInfoModel() {

	}

	public RefernceFormatEntityInfoModel(Integer refernceFormatKey, String swiftGroupKey, String groupParentKey,
			String instStatus, String copGroupKey, String ssiGroupKey, String ibanKey, String ifscIdentifier,
			String transactionCode, String ibpsMode, String creationdate, String entityState, String modifiedDate) {
		super();
		this.refernceFormatKey = refernceFormatKey;
		this.swiftGroupKey = swiftGroupKey;
		this.groupParentKey = groupParentKey;
		this.instStatus = instStatus;
		this.copGroupKey = copGroupKey;
		this.ssiGroupKey = ssiGroupKey;
		this.ibanKey = ibanKey;
		this.ifscIdentifier = ifscIdentifier;
		this.transactionCode = transactionCode;
		this.ibpsMode = ibpsMode;
		this.creationdate = creationdate;
		this.entityState = entityState;
		this.modifiedDate = modifiedDate;
	}

	public Integer getRefernceFormatKey() {
		return refernceFormatKey;
	}

	public void setRefernceFormatKey(Integer refernceFormatKey) {
		this.refernceFormatKey = refernceFormatKey;
	}

	public String getSwiftGroupKey() {
		return swiftGroupKey;
	}

	public void setSwiftGroupKey(String swiftGroupKey) {
		this.swiftGroupKey = swiftGroupKey;
	}

	public String getGroupParentKey() {
		return groupParentKey;
	}

	public void setGroupParentKey(String groupParentKey) {
		this.groupParentKey = groupParentKey;
	}

	public String getInstStatus() {
		return instStatus;
	}

	public void setInstStatus(String instStatus) {
		this.instStatus = instStatus;
	}

	public String getCopGroupKey() {
		return copGroupKey;
	}

	public void setCopGroupKey(String copGroupKey) {
		this.copGroupKey = copGroupKey;
	}

	public String getSsiGroupKey() {
		return ssiGroupKey;
	}

	public void setSsiGroupKey(String ssiGroupKey) {
		this.ssiGroupKey = ssiGroupKey;
	}

	public String getIbanKey() {
		return ibanKey;
	}

	public void setIbanKey(String ibanKey) {
		this.ibanKey = ibanKey;
	}

	public String getIfscIdentifier() {
		return ifscIdentifier;
	}

	public void setIfscIdentifier(String ifscIdentifier) {
		this.ifscIdentifier = ifscIdentifier;
	}

	public String getTransactionCode() {
		return transactionCode;
	}

	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}

	public String getIbpsMode() {
		return ibpsMode;
	}

	public void setIbpsMode(String ibpsMode) {
		this.ibpsMode = ibpsMode;
	}

	public String getCreationdate() {
		return creationdate;
	}

	public void setCreationdate(String creationdate) {
		this.creationdate = creationdate;
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

}
