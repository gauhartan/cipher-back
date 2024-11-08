package se.fu.mu23.cipher_assignment.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import se.fu.mu23.cipher_assignment.model.dto.DecryptRequest;
import se.fu.mu23.cipher_assignment.model.dto.DecryptResponse;
import se.fu.mu23.cipher_assignment.model.dto.EncryptRequest;
import se.fu.mu23.cipher_assignment.model.dto.EncryptResponse;
import se.fu.mu23.cipher_assignment.util.CaesarUtil;

@RestController

@CrossOrigin(origins = "http://localhost:5173")
@Slf4j
public class CipherController {

    @PostMapping("/encrypt")
    public EncryptResponse encrypt(@RequestBody EncryptRequest request) {
        log.info("encrypt is invoked");
        return new EncryptResponse(CaesarUtil.encrypt(request.input(), 17));
    }

    @PostMapping("/decrypt")
    public DecryptResponse decrypt(@RequestBody DecryptRequest request) {
        log.info("decrypt is invoked");
        return new DecryptResponse(CaesarUtil.decrypt(request.input(), 17));
    }
}
