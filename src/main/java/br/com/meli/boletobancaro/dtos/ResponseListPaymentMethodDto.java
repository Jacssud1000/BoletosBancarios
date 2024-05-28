package br.com.meli.boletobancaro.dtos;

import java.util.List;
import lombok.Data;

@Data
public class ResponseListPaymentMethodDto {
private List<PaymentMethodDto> paymentMethods;
}
