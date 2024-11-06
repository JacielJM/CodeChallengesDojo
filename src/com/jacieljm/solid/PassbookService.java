package com.jacieljm.solid;

import java.util.UUID;

public class PassbookService {
    public void printPassbook(){
        System.out.printf("\nTransaction id: %s%n", UUID.randomUUID());
    }
}
