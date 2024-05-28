package br.com.meli.boletobancaro.controller;

import br.com.meli.boletobancaro.dtos.PaymentDto;
import br.com.meli.boletobancaro.dtos.ResponsePaymentDto;
import br.com.meli.boletobancaro.service.PaymentListService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:63342")
@RequestMapping()
public class PaymentListController {

  @Autowired
  private PaymentListService paymentListService;

  @PostMapping(path = "/process_payment")
  ResponseEntity<ResponsePaymentDto> payment(@Valid @RequestBody PaymentDto paymentDto) {
    ResponsePaymentDto paymentRequest = paymentListService.payment(paymentDto);
    return ResponseEntity.status(HttpStatus.OK).body(paymentRequest);
  }
}
