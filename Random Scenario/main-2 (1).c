//
//  main.c
//  Milk
//
//  Created by Dhruv Patel on 2/10/19.
//  Copyright © 2019 Dhruv Patel. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>

int main() {
    
    char a1;
    char car;
    char a3;
    
    
    printf("Are you out of milk or is it spoiled? (Y or N) \n");
    scanf(" %c", &a1);

    
    if(a1 == 'Y'){
        
    
    
        printf("Do you have a car with gas? ");
        scanf(" %c", &car);
    
        if(car == 'Y'){
        printf("You are able to drive to the market. \n");
        }
        
    
        printf("\nDo you have at least 3 dollars? ");
        scanf(" %c", &a3);
    
        if(a3 == 'Y'){
        printf("\nYou have enough money to buy milk!\n");
        }
        else
        printf("You dont have enough money to buy milk.");
    
        if(!(a1 == car && car==a3)){
        printf("You cant go get milk");
        }
        else
        printf("You can go buy milk");
        
    }
    else
        printf("BYE!!!");

    
    return 0;
}
