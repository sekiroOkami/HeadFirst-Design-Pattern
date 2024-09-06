package com.examples.creator;

import com.examples.model.EconomicCarFactory;
import com.examples.model.LuxuryCarFactory;

public class AbstractFactoryProducer {
    public AbstractCreator getFactoryInstance(String value) {
        if (value.equals("Economic")) {
            return new EconomicCarFactory();
        } else if (value.equals("Luxury")) {
            return new LuxuryCarFactory();
        }
        return null;
    }
}
