//
//  main.c
//  inClassProgram
//
//  Created by Dhruv Patel on 2/18/19.
//  Copyright © 2019 Dhruv Patel. All rights reserved.
//

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main(int argc, const char * argv[]) {
    
    FILE* fp;
    int lineCount = 0;
    int ifCount = 0;
    int forCount = 0;
    int elseCount = 0;
    int switchCount = 0;
    int semiColonCount = 0;
    int structCount = 0;
    int array = 0;
    int blocks = 0;
    int amountInt = 0;
    int amountLong = 0;
    int amountDouble = 0;
    int amountChar = 0;
    int amountFloat = 0;
    int comment = 0;
    int whitespace = 0;
    
    
    char lineContents[900] = {0};
    
    fp = fopen("//Users//Dhruv//Desktop//Projects//githubcode.txt", "r");
    if(fp == NULL)
    {
        printf("File didnt open\n");
        return 1 ;
    }
    while(fgets(lineContents, 1500, fp) > 0)
    {
        if (strstr( &lineContents[0] , "if") > 0)
        {
            ifCount++ ;
        }
        if (strstr( &lineContents[0] , "for") > 0)
        {
            forCount++ ;
        }
        if (strstr( &lineContents[0] , "else") > 0)
        {
            elseCount++ ;
        }
        lineCount ++;
        if (strstr( &lineContents[0] , "switch") > 0)
        {
            switchCount++ ;
        }
        if (strstr( &lineContents[0] , ";") > 0)
        {
            semiColonCount++ ;
        }
        if (strstr( &lineContents[0] , "struct") > 0)
        {
            structCount++ ;
        }
        if (strstr( &lineContents[0] , "[") > 0)
        {
            array++ ;
        }
        if (strstr( &lineContents[0] , "]") > 0)
        {
            array++ ;
        }
        if (strstr( &lineContents[0] , "{") > 0)
        {
            blocks++ ;
        }
        if (strstr( &lineContents[0] , "}") > 0)
        {
            blocks++ ;
        }
        if (strstr( &lineContents[0] , "int") > 0)
        {
            amountInt++ ;
        }
        if (strstr( &lineContents[0] , "long") > 0)
        {
            amountLong++ ;
        }
        if (strstr( &lineContents[0] , "char") > 0)
        {
            amountChar++ ;
        }
        if (strstr( &lineContents[0] , "double") > 0)
        {
            amountDouble++ ;
        }
        if (strstr( &lineContents[0] , "float") > 0)
        {
            amountFloat++ ;
        }
        if (strstr( &lineContents[0] , "//") > 0)
        {
            comment++ ;
        }
        if (strstr( &lineContents[0] , "/*") > 0)
        {
            comment++ ;
        }
        if (lineContents[0] == '\n')
        {
            whitespace++ ;
        }
    }
    
    array = array/2;
    blocks = blocks/2;
    
    double percent1;
    double percent2;
    double percent3;
    double percent4;
    double percent5;
    double percent6;
    double percent7;
    double percent8;
    double percent9;
    double percent10;
    double percent11;
    double percent12;
    double percent13;
    double percent14;
    double percent15;
    
    
    percent1 = ((double)ifCount / lineCount) * 100;
    percent2 = ((double)forCount / lineCount) * 100;
    percent3 = ((double)elseCount / lineCount) * 100;
    percent4 = ((double)switchCount / lineCount) * 100;
    percent5 = ((double)semiColonCount / lineCount) * 100;
    percent6 = ((double)structCount / lineCount) * 100;
    
    percent7 = ((double)array / lineCount) * 100;
    percent8 = ((double)blocks / lineCount) * 100;
    percent9 = ((double)amountInt / lineCount) * 100;
    percent10 = ((double)amountLong / lineCount) * 100;
    percent11 = ((double)amountChar / lineCount) * 100;
    percent12 = ((double)amountDouble / lineCount) * 100;
    percent13 = ((double)amountFloat / lineCount) * 100;
    percent14 = ((double)comment / lineCount) * 100;
    percent15 = ((double)whitespace / lineCount) * 100;
    
    printf("The amount of ifs are %d\n", ifCount);
    printf("Percentage %lf\n", percent1);
    printf("The amount of fors are %d\n", forCount);
    printf("Percentage %lf\n", percent2);
    printf("The amount of elses are %d\n", elseCount);
    printf("Percentage %lf\n", percent3);
    printf("The amount of switch are %d\n", switchCount);
    printf("Percentage %lf\n", percent4);
    printf("The amount of ; are %d\n", semiColonCount);
    printf("Percentage %lf\n", percent5);
    printf("The amount of structs are %d\n", structCount);
    printf("Percentage %lf\n", percent6);
    printf("The amount of arrays are %d\n", array);
    printf("Percentage %lf\n", percent7);
    printf("The amount of blocks are %d\n", blocks);
    printf("Percentage %lf\n", percent8);
    printf("The amount of ints are %d\n", amountInt);
    printf("Percentage %lf\n", percent9);
    printf("The amount of long are %d\n", amountLong);
    printf("Percentage %lf\n", percent10);
    printf("The amount of char are %d\n", amountChar);
    printf("Percentage %lf\n", percent11);
    printf("The amount of double are %d\n", amountDouble);
    printf("Percentage %lf\n", percent12);
    printf("The amount of floats are %d\n", amountFloat);
    printf("Percentage %lf\n", percent13);
    printf("The amount of comments are %d\n", comment);
    printf("Percentage %lf\n", percent14);
    printf("The amount of whitespace are %d\n", whitespace);
    printf("Percentage %lf\n", percent15);
    printf("%d lines in file \n", lineCount);
    printf("\nFile opened OK\n");
    fclose(fp);
    
    return 0;
}

