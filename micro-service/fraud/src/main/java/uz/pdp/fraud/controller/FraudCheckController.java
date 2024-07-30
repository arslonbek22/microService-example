package uz.pdp.fraud.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.pdp.clients.fraud.FraudCheckResponse;
import uz.pdp.fraud.service.FraudService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/fraud-check")
public class FraudCheckController {

    private final FraudService fraudService;

    @GetMapping("{customerId}")
    public FraudCheckResponse checkFraudster(@PathVariable Integer customerId) {
        return fraudService.check(customerId);
    }
}
