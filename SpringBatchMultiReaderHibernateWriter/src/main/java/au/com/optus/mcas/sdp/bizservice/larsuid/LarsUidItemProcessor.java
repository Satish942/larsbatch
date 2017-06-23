package au.com.optus.mcas.sdp.bizservice.larsuid;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import au.com.optus.mcas.sdp.bizservice.larsuid.util.SecureKeyProvider;

public class LarsUidItemProcessor  implements
		ItemProcessor<LarsUid, LarsUid> {

	@Autowired
	@Qualifier("number")
	private SecureKeyProvider number;

	@Override
	public LarsUid process(LarsUid result) throws Exception {
		System.out.println("Processing result :"  + result.getSvcNum()+":"+ result.getSvcNumNew()+":"+result.getRecordType()+":"+ result.getSvcNumNew());
		
		if (Long.toString(result.getRecordType()).startsWith("HEADER")){
		    return null;
		}
		
		if (Long.toString(result.getRecordType()).startsWith("TRAILER")){
            return null;
        }
		result.setUnquId(number.getRandomInteger());

		/*
		 * Only return results which are more than 60%
		 */
		/*if (result.getPercentage() < 60) {
			return null;
		}*/

		return result;
	}
}
