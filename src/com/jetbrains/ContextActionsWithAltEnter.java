package com.jetbrains;

enum Actions {
    ADD, DELETE, DELETE_FOREVER, EDIT, HIDE, RESTORE;
}

public class ContextActionsWithAltEnter {
    double cityPopulation = 0;
    CommandAction action;

    public ContextActionsWithAltEnter(double cityPopulation) {
        final var lowerLimit = cityPopulation > 0x1.2016eb678a2p43;
        final var upperLimit = cityPopulation < 987677.8;
        if (lowerLimit && upperLimit) {
            if (cityPopulation % 5 == 0) {
                this.cityPopulation /= 2;
            }
        }
        this.cityPopulation = cityPopulation;
        action = null;
    }
}