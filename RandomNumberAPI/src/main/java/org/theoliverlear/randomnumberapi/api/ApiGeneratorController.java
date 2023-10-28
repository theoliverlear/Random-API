package org.theoliverlear.randomnumberapi.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiGeneratorController {
    IntNumberGenerator intNumGen;
    DecimalNumberGenerator decimalNumGen;
    //------------------------GET-Random-Integer------------------------------
    @GetMapping("/api")
    public String getApi() {
        this.intNumGen = new IntNumberGenerator(0, 100);
        this.intNumGen.formulateNumber();

        return "Your random number is: " + intNumGen.getRandomNumber();
    }
    //------------------------POST-Random-Integer-----------------------------
    @PostMapping("/api/generate/integer")
    public ResponseEntity<IntNumberResponse> postGenerate(@RequestBody IntNumberRequest intNumberRequest) {
        this.intNumGen = new IntNumberGenerator(intNumberRequest.getMin(), intNumberRequest.getMax());
        System.out.println("Min: " + intNumberRequest.getMin());
        System.out.println("Max: " + intNumberRequest.getMax());
        this.intNumGen.setMin(intNumberRequest.getMin());
        this.intNumGen.setMax(intNumberRequest.getMax());
        this.intNumGen.formulateNumber();
        IntNumberResponse intNumberResponse = new IntNumberResponse(this.intNumGen.getRandomNumber());
        return ResponseEntity.ok(intNumberResponse);
    }
    //------------------------POST-Random-Decimal-----------------------------
    // TODO: test out JavaDoc
    /**
     * This method is used to generate a random decimal number.
     * @param decimalNumRequest This is the request body that is used to generate the random decimal number.
     * @return ResponseEntity<DecimalNumberResponse> This returns the random decimal number.
     * @see DecimalNumberRequest
     * @see DecimalNumberGenerator
     * @see DecimalNumberResponse
     */
    @PostMapping("/api/generate/decimal")
    public ResponseEntity<DecimalNumberResponse> postGenerate(@RequestBody DecimalNumberRequest decimalNumRequest) {
        this.decimalNumGen = new DecimalNumberGenerator(decimalNumRequest.getMin(), decimalNumRequest.getMax(),
                                                        decimalNumRequest.getDecimalPlaces());
        System.out.println("Min: " + decimalNumRequest.getMin());
        System.out.println("Max: " + decimalNumRequest.getMax());
        System.out.println("Decimal Places: " + decimalNumRequest.getDecimalPlaces());
        this.decimalNumGen.setMin(decimalNumRequest.getMin());
        this.decimalNumGen.setMax(decimalNumRequest.getMax());
        this.decimalNumGen.setDecimalPlaces(decimalNumRequest.getDecimalPlaces());
        this.decimalNumGen.formulateNumber();
        DecimalNumberResponse decimalNumResponse = new DecimalNumberResponse(this.decimalNumGen.getRandomNumber());
        return ResponseEntity.ok(decimalNumResponse);
    }
    // TODO: Add a limit variable that will limit the type of number,
    //       ex. Armstrong numbers, prime numbers, etc.
}
