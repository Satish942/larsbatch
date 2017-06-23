package au.com.optus.mcas.sdp.bizservice.larsuid;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="LARS_UID")
public class LarsUid implements Serializable {
	
    @Column(name = "UNQU_ID")
    private long unquId;

    @Column(name = "RECORD_TYPE")
    private long recordType;

    @Id
    @Column(name = "SVC_NUM")
    private String svcNum;

    @Column(name = "SVC_NUM_NEW")
    private String svcNumNew;

    @Column(name = "REL_FLAG")
    private String relFlag;
    
    @Column(name = "EFF_DT")
    private String effDate;
    
    @Column(name = "EXTRACT_DT")
    private String extractDate;
    
    @Column(name = "PARTY_ID")
    private long partyId;

    public long getUnquId() {
        return unquId;
    }

    public void setUnquId(long unquId) {
        this.unquId = unquId;
    }

    public long getRecordType() {
        return recordType;
    }

    public void setRecordType(long recordType) {
        this.recordType = recordType;
    }

    public String getSvcNum() {
        return svcNum;
    }

    public void setSvcNum(String svcNum) {
        this.svcNum = svcNum;
    }

    public String getSvcNumNew() {
        return svcNumNew;
    }

    public void setSvcNumNew(String svcNumNew) {
        this.svcNumNew = svcNumNew;
    }

    public String getRelFlag() {
        return relFlag;
    }

    public void setRelFlag(String relFlag) {
        this.relFlag = relFlag;
    }

    public String getEffDate() {
        return effDate;
    }

    public void setEffDate(String effDate) {
        this.effDate = effDate;
    }

    public String getExtractDate() {
        return extractDate;
    }

    public void setExtractDate(String extractDate) {
        this.extractDate = extractDate;
    }

    public long getPartyId() {
        return partyId;
    }

    public void setPartyId(long partyId) {
        this.partyId = partyId;
    }
}
