package com.engeto.resources;

import java.util.List;

public class Find {
    public static Double findMatching(List<Double> list,
                                      Double lowerLimit,
                                      Double upperLimit) throws Exception {
        if (list.isEmpty()){
            throw new Exception("List of Doubles is empty!");
        }
        for (Double item : list){
            if(item >= lowerLimit && item < upperLimit){
                return item;
            }
        }
        return null;
    }
}
