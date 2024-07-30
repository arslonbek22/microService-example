package uz.pdp.clients.fraud;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FraudCheckResponse {

    private Boolean isFraud;
}
