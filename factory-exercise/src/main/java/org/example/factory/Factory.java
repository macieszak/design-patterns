package org.example.factory;

import org.example.cars.*;

public interface Factory {

    Car buildBMW(BMWModel model);
    Car buildFord(FordModel model);

}
