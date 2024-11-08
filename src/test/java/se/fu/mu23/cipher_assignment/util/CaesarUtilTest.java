package se.fu.mu23.cipher_assignment.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarUtilTest {

    @Test
    void test_encrypt() {
        // given
        String textToEncrypt = "test text";
        int offset = 17;

        // when
        String result = CaesarUtil.encrypt(textToEncrypt, offset);

        // then
        assertAll(() -> assertEquals("kvjk kvok", result),
                () -> assertNotEquals("incorrect encrypted text", result)
        );
    }


    @Test
    void test_decrypt() {
        // given
        String textToDecrypt = "kvjk kvok";
        int offset = 17;

        // when
        String result = CaesarUtil.decrypt(textToDecrypt, offset);

        // then
        assertAll(() -> assertEquals("test text", result),
                () -> assertNotEquals("incorrect decrypted text", result)
        );
    }
}