package com.javawan.datatype;

import java.util.BitSet;

public class BiteSetDemo {
    public static void main(String[] args) {
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);
        for(int i=0; i<16; i++){
            if((i%2) == 0) bits1.set(i);//能被2整除的数
            if((i%5) != 0) bits2.set(i);//不能被5整除的数
        }
        System.out.println("Initial pattern in bits1: ");
        System.out.println(bits1);
        System.out.println("\nInitial pattern in bits2: ");
        System.out.println(bits2);

        // AND bits
        bits2.and(bits1);
        System.out.println("\nbits2 AND bits1: ");
        System.out.println(bits2);

        // OR bits
        bits2.or(bits1);
        System.out.println("\nbits2 OR bits1: ");
        System.out.println(bits2);

        // XOR bits
        bits2.xor(bits1);//异或
        System.out.println("\nbits2 XOR bits1: ");
        System.out.println(bits2);
    }
}
