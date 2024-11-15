package dev.clara.amstrong_number;

import java.util.function.BooleanSupplier;

public class AmstrongNumber{
    private int numero;

    public AmstrongNumber(int numero) {
        this.numero = numero;
    }

    public boolean IsAmstrongNumber() {
        int suma = 0;
        int digitos = String.valueOf(numero).length(); 
        int temp = numero;
    
        while (temp > 0) {
            int digito = temp % 10;                 
            suma += Math.pow(digito, digitos);      
            temp /= 10;                             
        }

        return suma == numero; 
    }

    public int getNumero() {
        return numero;
    }

    public BooleanSupplier IsArmstrong() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'IsArmstrong'");
    }
   
    
}