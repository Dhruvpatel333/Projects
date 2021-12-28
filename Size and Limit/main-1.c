//
//  main.c
//  Size_Max
//
//  Created by Dhruv Patel on 1/20/19.
//  Copyright © 2019 Dhruv Patel. All rights reserved.
//

#include <stdio.h>
#include <limits.h>

int main(int argc, const char * argv[]) {
    
    int i;
    double d;
    long l;
    long long lL;
    float f;
    unsigned int u;
    char c;
    
    printf("The size of a integer is %lu\n", sizeof(i));
    printf("The size of a double is %lu\n", sizeof(d));
    printf("The size of a character is %lu.\n", sizeof(c));
    printf("The size of a long is %li.\n", sizeof(l));
    printf("The size of a long long is %lu.\n", sizeof(lL));
    printf("The size of a float is %lu.\n", sizeof(f));
    printf("The size of a unsigned integer is %lu.\n", sizeof(u));
    
    printf("The range of int values is %i  -  %i\n", INT_MIN, INT_MAX);
    printf("The range of character values is %i  -  %i.\n", CHAR_MIN,CHAR_MAX);
    printf("The range of long values is %li  -  %li\n", LONG_MIN, LONG_MAX);
    printf("The range of long long values is %lli  -  %lli\n", LLONG_MIN, LLONG_MAX);
    printf("The range of unsigned int values is 0  -  %u\n", UINT_MAX);
    return 0;
}
