package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class MailInfo {

    private MailCode mailCode;
    @Getter
    private Client client;

    public String generate() {
        return mailCode.generate(client);
    }
}
