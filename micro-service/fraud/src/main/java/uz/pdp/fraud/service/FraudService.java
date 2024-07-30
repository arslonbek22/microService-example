package uz.pdp.fraud.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.pdp.clients.fraud.FraudCheckResponse;
import uz.pdp.fraud.entity.FraudCheckHistory;
import uz.pdp.fraud.repo.FraudCheckHistoryRepo;

@Service
@RequiredArgsConstructor
public class FraudService {
    private final FraudCheckHistoryRepo fraudCheckHistoryRepo;

    public FraudCheckResponse check(Integer customerId) {
        fraudCheckHistoryRepo.save(FraudCheckHistory.builder()
                .customerId(customerId)
                .isFraudster(false)
                .build());

        return new FraudCheckResponse(
                false
        );
    }
}
