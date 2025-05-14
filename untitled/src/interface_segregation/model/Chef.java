package interface_segregation.model;

import interface_segregation.interfaces.MakeFood;

public class Chef implements MakeFood {
    @Override
    public void makeFood() {
        System.out.println("Aşçı yemeği hazılıyor");
    }
}
