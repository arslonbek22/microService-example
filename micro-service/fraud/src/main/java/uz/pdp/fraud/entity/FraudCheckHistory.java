package uz.pdp.fraud.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document
public class FraudCheckHistory {

    private String id;
    private Integer customerId;
    private Boolean isFraudster;

    @CreatedDate
    private LocalDateTime dateTime;
}
