package org.example;

public class BirthdayMail implements MailCode{
    private static String TEMPLATE = "%NAME CONGRATS! TODAY YOU HAVE BECOME ONE YEAR OLDER!";

    @Override
    public String generate(Client client) {
        return TEMPLATE.replaceAll("%NAME", client.getName());
    }
}
