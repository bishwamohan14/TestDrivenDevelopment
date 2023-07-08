package org.example;

import java.util.HashMap;
import java.util.Map;

public class PopulationSearch {

    public int getPopulation(String city) {
        Map<String,Integer> populationMap=null;
        Integer populationCount=0;
        if(city.isEmpty()){
            throw new NullPointerException("input should not be empty");
        }
        populationMap = getPopulationStatistics();
        if(!populationMap.containsKey(city)){
            throw new NullPointerException("invalid input");
        }

        populationCount= populationMap.get(city);
        return populationCount;

    }

    private Map<String,Integer> getPopulationStatistics(){
        Map<String,Integer> populationMap = new HashMap<>();
        populationMap.put("Bangalore",200000);
        populationMap.put("Hyderabad",500000);
        populationMap.put("pune",300000);
        populationMap.put("mumbai",800000);
        return populationMap;
    }

}
