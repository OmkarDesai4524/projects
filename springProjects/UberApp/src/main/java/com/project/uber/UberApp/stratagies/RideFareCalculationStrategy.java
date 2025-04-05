package com.project.uber.UberApp.stratagies;

import com.project.uber.UberApp.entities.RideRequest;



public interface RideFareCalculationStrategy {

    double RIDE_FARE_MULTIPLIER = 10;

    double calculateFare(RideRequest rideRequest);

}
