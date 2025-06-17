/*
import java.util.Scanner;
class SquarePattern
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
for( int i=0;i<=n;i++)
{
for(int j=0;j<=n;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}

Output:enter a number:
5
******
******
******
******
******
******

*/
---------------------------------------------------------
/*

import java.util.Scanner;
class NumberPattern1
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
for( int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(i);
}
System.out.println();
}
}
}

Output:
enter a number:
5
00000
11111
22222
33333
44444

*/
-----------------------------------------------------------
/*
import java.util.Scanner;
class NumberPattern2
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
for( int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(j);
}
System.out.println();
}
}
}

Output:
enter a number:
5
12345
12345
12345
12345
12345

*/
---------------------------------------------------------------
/*

import java.util.Scanner;
class NumberPattern3
{
public static void main(String[]args)
{
int z=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
for( int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
System.out.print(z+" ");
z=z+1;
}
System.out.println();
}
}
}

Output:
enter a number:
5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
*/
---------------------------------------------------------
/*

import java.util.Scanner;
class NumberPattern4
{
public static void main(String[]args)
{
int z=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
for( int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(z==10)
{
z=1;
}
System.out.print(z+" ");
z=z+1;
}
System.out.println();
}
}
}

Output:
enter a number:
5
1 2 3 4 5
6 7 8 9 1
2 3 4 5 6
7 8 9 1 2
3 4 5 6 7

*/
--------------------------------------------------------------
/*

import java.util.Scanner;
class NumberPattern5
{
public static void main(String[]args)
{
int z=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
for( int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
 System.out.print(z+" ");
z=z+2;
}
System.out.println();
}
}
}

Output:
enter a number:
5
1 3 5 7 9
11 13 15 17 19
21 23 25 27 29
31 33 35 37 39
41 43 45 47 49

*/

--------------------------------------------------------------------
/*

import java.util.Scanner;
class Pyramid
{
public static void main(String[]args)
{
int z=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
for( int i=1;i<=n;i++)
{
for(int j=1;j<=(n-i);j++)
{
 System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print("* ");
}
System.out.println();
}
}
}

Output:
enter a number:
5
    *
   * *
  * * *
 * * * *
* * * * *

*/
----------------------------------------------------------
/*

import java.util.Scanner;
class BinaryNumber
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
for( int i=1;i<=n;i++)
{
for(int j=1;j<=n;j++)
{
if(j%2==0)
{
System.out.print(0);
}
else
{
System.out.print(1);
}
}
System.out.println();
}
}
}

Output:
enter a number:
5
10101
10101
10101
10101
10101

*/

------------------------------------------------------------------
/*

import java.util.Scanner;
class NumberPyramid
{
public static void main(String[]args)
{
int z=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int n=sc.nextInt();
for( int i=1;i<=n;i++)
{
for(int j=1;j<=(n-i);j++)
{
 System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print((k*2)+" ");
}
System.out.println();
}
}
}

Output:
enter a number:
5
    2
   2 4
  2 4 6
 2 4 6 8
2 4 6 8 10

*/

---------------------------------------------------------------