package uz.pdp.fraud.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import uz.pdp.fraud.entity.FraudCheckHistory;

public interface FraudCheckHistoryRepo extends MongoRepository<FraudCheckHistory, String > {
}
