//
//  main.c
//  Project8
//
//  Created by Dhruv Patel on 3/24/19.
//  Copyright © 2019 Dhruv Patel. All rights reserved.
//
#include "car.h"
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define SIZE 40

int main(int argc, const char * argv[]) {
    
    
    FILE* fp;
    fp = fopen("car.dat","wb");
    
    if( fp == NULL)
    {
        printf("FILE didnt create");
        return 1;
    }
    
    
    cars mercedesAMG;
    
    strcpy( mercedesAMG.color, "Silver");
    strcpy( mercedesAMG.engineConfig, "V8");
    mercedesAMG.doorCount = 4;
    mercedesAMG.zeroToSixty = 3.8;
    mercedesAMG.modelYear = 2019;
    
    cars BMWI8;
    
    strcpy( BMWI8.color, "Black");
    strcpy( BMWI8.engineConfig, "V8");
    BMWI8.doorCount = 2;
    BMWI8.zeroToSixty = 3.2;
    BMWI8.modelYear = 2019;
    
    cars TeslaRoadster;
    
    strcpy( TeslaRoadster.color, "Red");
    strcpy( TeslaRoadster.engineConfig, "V10");
    TeslaRoadster.doorCount = 2;
    TeslaRoadster.zeroToSixty = 1.9;
    TeslaRoadster.modelYear = 2018;
    
    cars Camry;
    
    strcpy( Camry.color, "White");
    strcpy( Camry.engineConfig, "V6");
    Camry.doorCount = 4;
    Camry.zeroToSixty = 6;
    Camry.modelYear = 2019;
    
    cars Accord;
    
    strcpy( Accord.color, "Orange");
    strcpy( Accord.engineConfig, "V6");
    Accord.doorCount = 4;
    Accord.zeroToSixty = 6.7;
    Accord.modelYear = 2019;
    
    
    fwrite (&mercedesAMG, sizeof(mercedesAMG), 1, fp);
    fwrite (&BMWI8, sizeof(BMWI8), 1, fp);
    fwrite (&TeslaRoadster, sizeof(TeslaRoadster), 1, fp);
    fwrite (&Camry, sizeof(Camry), 1, fp);
    fwrite (&Accord, sizeof(Accord), 1, fp);
    
    
    fclose(fp);
    
    fp = fopen("car.dat","rb");
    
    if( fp == NULL)
    {
        printf("FILE didnt open");
        return 1;
    }
    
    cars Jello[5] = {0};
    fread(&Jello, sizeof(cars), 5, fp);
    fclose(fp);
    
    
    printf("Color :%s  Engine: %s  Doors:  %d  Zero - Sixty : %.2lf  Model Year:  %d\n",
           Jello[0].color, Jello[0].engineConfig, Jello[0].doorCount, Jello[0].zeroToSixty, Jello[0].modelYear);
    printf("Color :%s  Engine: %s  Doors:  %d  Zero - Sixty : %.2lf  Model Year:  %d\n",
           Jello[1].color, Jello[1].engineConfig, Jello[1].doorCount, Jello[1].zeroToSixty, Jello[1].modelYear);

    printf("Color :%s  Engine: %s  Doors:  %d  Zero - Sixty : %.2lf  Model Year:  %d\n",
           Jello[2].color, Jello[2].engineConfig, Jello[2].doorCount, Jello[2].zeroToSixty, Jello[2].modelYear);

    printf("Color :%s  Engine: %s  Doors:  %d  Zero - Sixty : %.2lf  Model Year:  %d\n",
           Jello[3].color, Jello[3].engineConfig, Jello[3].doorCount, Jello[3].zeroToSixty, Jello[3].modelYear);

    printf("Color :%s  Engine: %s  Doors:  %d  Zero - Sixty : %.2lf  Model Year:  %d\n",
           Jello[4].color, Jello[4].engineConfig, Jello[4].doorCount, Jello[4].zeroToSixty, Jello[4].modelYear);

    
    return 0;
}
