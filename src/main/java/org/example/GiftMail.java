package org.example;

public class GiftMail implements MailCode{

    private static String TEMPLATE = "CONGRATS! YOU HAVE WON 1000$! %NAME RECEIVE YOUR MONEY RIGHT NOW!";

    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }
}
