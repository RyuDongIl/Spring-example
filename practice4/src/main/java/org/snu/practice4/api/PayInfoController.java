package org.snu.practice4.api;


import lombok.extern.slf4j.Slf4j;
import org.snu.practice4.dto.PayInfo;
import org.snu.practice4.model.DefaultRes;
import org.snu.practice4.service.PayInfoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Slf4j
@RestController
public class PayInfoController {

    private final PayInfoService payInfoService;

    public PayInfoController(final PayInfoService payInfoService) {
        this.payInfoService = payInfoService;
    }

    @GetMapping("")
    public ResponseEntity getInfo(@RequestParam("id") final Optional<Integer> id) {
        try {
            //name이 null일 경우 false, null이 아닐 경우 true
            if(id.isPresent()) return new ResponseEntity<>(payInfoService.findById(id.get()), HttpStatus.OK);
            return new ResponseEntity<>(payInfoService.getAllpayInfo(), HttpStatus.OK);
        } catch (Exception e) {
            log.error(e.getMessage());
            return new ResponseEntity<>(DefaultRes.FAIL_DEFAULT_RES, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("")
    public ResponseEntity register(@RequestBody final PayInfo payInfo) {
        try {
            return new ResponseEntity<>(payInfoService.save(payInfo), HttpStatus.OK);
        } catch (Exception e) {
            log.error(e.getMessage());
            return new ResponseEntity<>(DefaultRes.FAIL_DEFAULT_RES, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
