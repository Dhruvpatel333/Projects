//
//  car.h
//  Project8
//
//  Created by Dhruv Patel on 3/24/19.
//  Copyright © 2019 Dhruv Patel. All rights reserved.
//


#ifndef car_H
#define car_H




typedef struct cars_creator
{
    char color[10]; // What is the color of the car?
    char engineConfig[5]; // What configuration is the engine?
    int doorCount; // How many doors will it have?
    double zeroToSixty; // How long does it take the car to go from 0mph to 60mph? (sec)
    int modelYear; // What year will the car come out?
} cars;




#endif //car_h 
