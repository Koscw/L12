package com.company;

import java.util.List;
import java.util.stream.Collectors;

import static com.company.Pearson.getPeople;

public class PearsonEmailTest  {
    public static void main(String[] args) {
        List<Pearson> people = getPeople();///command+option+m - создание метода
        System.out.println("without streams");
        for(Pearson pearson: people){
            for(String email:pearson.getEmails()){
                boolean isSent = sendEmail(email);
                System.out.println("Email send status "+ isSent);
            }
        }
        System.out.println("with streams");
        people.stream()
                .flatMap(pearson -> pearson.getEmails().stream())
                .map(PearsonEmailTest:: sendEmail)
                .forEach(isSent -> System.out.println("Email send status "+ isSent));


        String emails = people.stream()
                .flatMap(pearson -> pearson.getEmails().stream())
                .collect(Collectors.joining(","));
        sendEmail(emails);


    }



    public static boolean sendEmail(String email){
        System.out.println("Send email to"+email);
        return true;
    }



}
