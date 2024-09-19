package com.hsd.shares.config;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JasyptConfigTest {

    @Test
    void encryptTest() {
        String url = "exUrl";
        String id = "exId";
        String password = "exPassword";

        System.out.println(jasyptEncoding(url));
        System.out.println(jasyptEncoding(id));
        System.out.println(jasyptEncoding(password));
    }

    public String jasyptEncoding(String value) {
        String key = "exKey";
        StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
        pbeEnc.setAlgorithm("PBEWithMD5AndDES");
        pbeEnc.setPassword(key);
        return pbeEnc.encrypt(value);
    }

}