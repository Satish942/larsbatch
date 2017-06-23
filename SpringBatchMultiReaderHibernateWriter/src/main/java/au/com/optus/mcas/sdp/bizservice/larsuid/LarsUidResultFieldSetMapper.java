package au.com.optus.mcas.sdp.bizservice.larsuid;

import org.joda.time.LocalDate;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class LarsUidResultFieldSetMapper implements FieldSetMapper<LarsUid>{

	public LarsUid mapFieldSet(FieldSet fieldSet) throws BindException {
	    LarsUid result = new LarsUid();
	    
	    result.setRecordType(fieldSet.readLong(0));
	    result.setSvcNum(fieldSet.readString(1));
        result.setSvcNumNew(fieldSet.readString(2));
	    result.setRelFlag(fieldSet.readString(3));
	    result.setEffDate(fieldSet.readString(4));
	    result.setExtractDate(fieldSet.readString(5));
	    result.setPartyId(fieldSet.readLong(6));
		return result;
	}

}
