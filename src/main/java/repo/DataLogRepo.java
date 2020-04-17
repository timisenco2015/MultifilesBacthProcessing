package repo;

import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import dto.DataLogDetails;


public interface DataLogRepo extends MongoRepository<DataLogDetails, String> 
{
 
    
    @Query("{ 'userId' : ?0 }")
    List<DataLogDetails> findDataLogDetailsByUserId(String userId);
    
    @Query("{'actions.time':{$gte:?0,$lt:?1}}")
    List<DataLogDetails> findDataLogDetailsByLogDateRange(String startDate, String endDate);
    
    @Query("{'actions.type':?0}")
    List<DataLogDetails> findDataLogDetailsByLogType(String logType);
    
    
    @Query("{$and:[{'actions.time':{$gte:?0,$lt:?1}},{'userId':?2}]}")
    List<DataLogDetails> findDataLogDetailsByLogDateRangeAndUserId(String startDate, String endDate,String userId);
    
    
    @Query("{$and:[{'actions.type':?0},{'userId':?1}]}")
    List<DataLogDetails> findDataLogDetailsByUserIdAndLogType(String logType,String userId );
    
    @Query("{$and:[{'actions.time':{$gte:?0,$lt:?1}},{'actions.type':?2}]}")
    List<DataLogDetails> findDataLogDetailsByLogDateRangeAndLogType(String startDate, String endDate,String logType);
    
    @Query("{$and:[{'actions.time':{$gte:?0,$lt:?1}},{'actions.type':?2},{'userId':?3}]}")
    List<DataLogDetails> findDataLogDetailsByLogDateRangeAndLogTypeAndUserId(String startDate, String endDate,String logType,String userId);
    
}
