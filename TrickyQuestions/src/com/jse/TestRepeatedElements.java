package com.jse;

import java.util.Arrays;
class RetailStore{
    int[] productIds = {101, 101, 101, 101, 101, 101, 101, 101};
    public void displayRepeatedId() {
        Arrays.sort(productIds);
        System.out.println("Array elements: "+Arrays.toString(productIds));
        int occurrenceCount = 0;
        for(int i=0;i<productIds.length;i++) {
            int count = 0;
            for(int j=0;j<productIds.length;j++) {
            if(productIds[i]==productIds[j] && i>j)    {
                break;
            }
            if(productIds[i]==productIds[j]) {
                count++;
            }
            }
            if(count>1) {
                System.out.println(productIds[i]+ " available "+count+" time");
                occurrenceCount++;
            }
        }
        System.out.println(occurrenceCount+" product IDs are repeated.");
    }
}
public class TestRepeatedElements {
public static void main(String[] args) {
    RetailStore r1 = new RetailStore();
    r1.displayRepeatedId();
}
}
