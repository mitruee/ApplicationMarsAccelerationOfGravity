package com.example.applicationmarsaccelerationofgravity;

public class Algorithm {

    
    private final float MASS_FOR_ONE_KG = 37.8;
    
    public Algorithm() {
    }

    
    public long absoluteMassCalculation(String input) {

        
        if (input.contains(",")) {

            String inputMod = input.replace(",", ".");

            float inputFloat = Float.parseFloat(inputMod);

            
            return (long) (inputFloat * MASS_FOR_ONE_KG);

        } else {
            
            float inputFloat = Float.parseFloat(input);

            
            return (long) (inputFloat * MASS_FOR_ONE_KG);
        }
    }
}
