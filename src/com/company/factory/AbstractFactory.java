package com.company.factory;

import com.company.Color;

public class AbstractFactory {
    public static BaseFactory getFactory(Color color) {
        return switch (color) {
            case BLACK -> new BlackFactory();
            case WHITE -> new WhiteFactory();
        };
    }
}