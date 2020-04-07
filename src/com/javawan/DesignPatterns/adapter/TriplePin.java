package com.javawan.DesignPatterns.adapter;

public interface TriplePin {
    //参数分别为火线live，零线null，地线earth
    void electrify(int l, int n, int e);
}
