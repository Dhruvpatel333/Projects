// Draw SVG primitives

// Based on: https://www.w3schools.com/graphics/svg_inhtml.asp
// example:
/*
 <svg height="100" width="100">
  <circle cx="50" cy="50" r="40" stroke="black" stroke-width="3" fill="red" />
</svg> */

#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>

// User defined functions are in Chapter 6 of your zyBook
void circle ( int cx, int cy, int r, char* color )
{
    printf ( "\t<circle cx='%d' cy='%d' r='%d' fill='%s' />\n", cx, cy, r, color) ;
}

/*
 <svg height="210" width="500">
  <line x1="0" y1="0" x2="200" y2="200" style="stroke:rgb(255,0,0);stroke-width:2" />
</svg>
*/
void line ( float x1, float y1, float x2, float y2, char* stroke )
{
    printf ( "<line x1='%f' y1='%f' x2='%f' y2='%f' style='%s' />\n",
        x1, y1, x2, y2, stroke ) ;
}


void beginHtmlSVG ( int wide, int high, char* backColor)
{
    printf ( "<!DOCTYPE html>\n" ) ;
    printf ( "<html>\n" ) ;
    printf ( "<body>\n" ) ;

    printf( "<svg height='%d' width='%d' style='stroke-width: 0px; background-color: %s;'>\n",
        high, wide, backColor ) ;
}

void endHtmlSVG ( )
{
    printf( "</svg>\n") ;
    printf ( "</body>\n" ) ;
    printf ( "</html>\n" ) ;
}

char* getRGBColor ( int red, int green, int blue )
{
    static char* svgFillString = "rgb(%d, %d, %d)" ;
    static char result[100] = { 0 } ;
    sprintf( result, svgFillString, red, green, blue ) ;
    return result ;
}

int main ( )
{
    srand( time ( NULL ) ) ;
    beginHtmlSVG ( 1000, 1000, getRGBColor( 128, 0, 128 ) ) ;

    // Sample code.  Add loops and other enhancements here to get
    // more and cooler output.
    for(int col = 0; col < 10; col++){
        for(int row = 0; row < 10; row++){
                /*
            int x = ( rand ( ) % 300 ) + 200 ;
            int y = ( rand ( ) % 300  ) + 100 ;
            int size = ( rand ( ) % 150 ) + 10 ;
            */
            int red = rand( ) % 255 ;
            int blue = rand( ) % 255 ;
            int green = rand ( ) % 255 ;
            line ( col * 20, row * 40, col * 60 + 10, row * 20 + 15, "stroke:rgb(169,175,84);stroke-width:2") ;
            circle( col * 60, row * 40, col * 12, getRGBColor( red, green, blue ) ) ;
        }
    }

    //circle( 500, 300, 150, "blue") ;
    //line ( 50.5, 50.75, 75.1, 75.3, "stroke:rgb(0,0,255);stroke-width:2") ;

    endHtmlSVG ( ) ;


    return 0 ;
}
