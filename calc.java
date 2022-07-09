import java.util.Scanner;
public class simp_cal
{
public double num[],sum,diff,product,quo;
public int var1,var2,rem,quot;
Scanner sc=new Scanner(System.in);
{
sum=0;
diff=0;
product=1;
}
public double add(double arr[])
{
for(int i=0;i<arr.length;i++)
 sum+=arr[i];
return sum;
}
public double difference(double var1, double var2)
{
return Math.abs((var1-var2));
}
public double subtract(double var1, double var2)
{
return (var1-var2);
}
public double multiply(double arr[])
{
for(int i=0;i<arr.length;i++)
 product*=arr[i];
return product;
}
public double divide(double var1, double var2)
{
double quo=0;
try
{
quo=var1/var2;
}catch(Exception e)
{
System.out.println(e);
}
return quo;
}
public int quo_int_divide(int var1,int var2)
{
return (int)(var1/var2);
}
public int rem_int_divide(int var1, int var2)
{
return (var1%var2); 
}
public double square(double var1)
{
return (var1*var1);
}
public double sqrt(double var1)
{
double sqrt=0;
try{
sqrt=Math.sqrt(var1);
}
catch(Exception e)
{
System.out.println(e);
}
return sqrt;
}
public double percentage(double var1,double var2)
{
return(var2/var1*100);
}
public double cube(double var1)
{
return (var1*var1*var1);
}
public double cuberoot(double var1)
{
return Math.pow(var1,((double)(1/3.0)));
}
public double power(double base, double exp)
{
return Math.pow(base,exp);
}
public double reciprocal(double x)
{
double r;
try{
r=1/x;
}
catch(Exception e)
{
System.out.println(e);
r=0;
}
return r;
}
public int factorial(int var1)
{
int fact=1;
for(int i=1;i<=var1;i++)
fact*=i;
return fact;
}
public void dispmenu()
{
System.out.println("WELCOME TO CALCULATOR");
System.out.println("==========================================");
System.out.println("1:ADDITION 2: SUBTRACTION 3: MULTIPLICATION");
System.out.println("4: DIVISION 5: SQUARE 6: SQUAREROOT");
System.out.println("7: PERCENTAGE 8: CUBE 9: CUBEROOT ");
System.out.println("10: POWER 11: RECIPROCAL 12: FACTORIAL");
System.out.println(" 0:EXIT ");
System.out.println("==========================================");
System.out.println("ENTER YOUR CHOICE");
}
public double acceptDouble()throws IOException
{
int j=0;
double var1=0;
while(j==0)
{
try
{
j=1;
var1=sc.nextInt();
}catch(Exception e)
{
j=0;
System.out.println("ERROR:"+e);
System.out.println("TRY AGAIN");
}
}
return var1;
}
public int acceptInt()throws IOException
{
int j=0;
int var1=0;
while(j==0)
{
try{
j=1;
var1=sc.nextInt();
}catch(Exception e)
{
j=0;
System.out.println("ERROR:"+e);
System.out.println("TRY AGAIN");
}
}
return var1;
}
public static void main()throws IOException
{
simp_cal cal=new simp_cal();
int j=0;
do{
cal.dispmenu();
int ans1;
ans1=cal.acceptInt();
if(ans1==0)break;
switch(ans1)
{


case 1:
{
System.out.println("HOW MANY NUMBERS DO YOU WANT TO ADD?");
int ans2=cal.acceptInt();
cal.num=new double[ans2];
for(int k=0;k<ans2;k++){
 System.out.println("ENTER NUMBER "+k+":");
cal.num[k]=cal.acceptDouble();
}
System.out.println("THE SUM IS "+cal.add(cal.num));
System.out.println("PRESS 1 TO ENTER AGAIN OR 0 TO EXIT");
ans2=cal.acceptInt();
if(ans2==0)j=1;
break;
}



case 2:
{
int k=0;
double var1,var2;
while(k==0)
{
System.out.println("ENTER: 1 FOR ABSOLUTE DIFFERENCE BETWEEN TWO NUMBERS");
System.out.println("ENTER: 2 FOR SUBTRACTING ONE NUMBER WITH THE OTHER NUMBER WITH A SIGN");
System.out.println("ENTER: 0 TO EXIT");
int ans2=cal.acceptInt();
switch(ans2)
{

case 1:
System.out.println("ENTER THE FIRST NUMBER :");
var1=cal.acceptDouble();
System.out.println("ENTER THE SECOND NUMBER:");
var2=cal.acceptDouble();
System.out.println("THE DIFFERENCE BETWEEN "+var1+" and "+var2+" is "+cal.difference(var1,var2));
System.out.println("PRESS 1 TO ENTER AGAIN OR 0 TO EXIT");
ans2=cal.acceptInt();
if(ans2==0)j=1;
k=1;
break;

case 2:
System.out.println("ENTER THE NUMBER TO SUBTRACT FROM:");
var1=cal.acceptDouble();
System.out.println("ENTER NUMBER TO SUBTRACT:");
var2=cal.acceptDouble();
System.out.println(var1+"-"+var2+" is "+cal.subtract(var1,var2));
System.out.println("PRESS 1 TO ENTER AGAIN OR 0 TO EXIT");
ans2=cal.acceptInt();
if(ans2==0)j=1;
k=1;
break;

case 0:
k=1;
break;
default:
System.out.println("YOU DID NOT ENTER A VALID OPTION.TRY AGAIN");
}
}
break;
}

case 3:
{
System.out.println("HOW MANY NUMBERS YOU WANT TO MULTIPLY?");
int ans2=cal.acceptInt();
cal.num=new double[ans2];
for(int k=0;k<ans2;k++)
 {
System.out.println("ENTER NUMBER"+k+":");
cal.num[k]=cal.acceptDouble();
}
System.out.println("THE PRODUCT IS "+cal.multiply(cal.num));
System.out.println("PRESS 1 TO ENTER AGAIN OR 0 TO EXIT");
ans2=cal.acceptInt();
if(ans2==0)j=1;
break;
}

case 4:
{
int k=0;
while(k==0)
{
System.out.println("ENTER 1 FOR OBTAINING QUOTIENT AND REMAINDER WITH INTEGERS");
System.out.println("ENTER:2 FOR DIVIDING TWO DECIMAL NUMBERS");
System.out.println("ENTER:0 TO EXIT");
int ans2=cal.acceptInt();
switch(ans2)
{
case 1:
int var1,var2;
System.out.println("ENTER NUMBER TO BE DIVIDED:");
var1=cal.acceptInt();
while(true)
{
System.out.println("ENTER NUMBER TO DIVIDE BY");
var2=cal.acceptInt();
if(var2!=0)break;else System.out.println("INFINITE");
}
System.out.println("THE QUOTIENT OF "+var1+"/"+var2+" is "+cal.quo_int_divide(var1,var2)+" AND REMAINDER IS "+cal.rem_int_divide(var1,var2));
System.out.println("PRESS 1 TO ENTER AGAIN OR 0 TO EXIT");
ans2=cal.acceptInt();
if(ans2==0)j=1;
k=1;
break;

case 2:
double var3,var4;
System.out.println("ENTER NUMBER TO BE DIVIDED:");
var3=cal.acceptDouble();
while(true)
{
System.out.println("ENTER NUMBER TO DIVIDE BY:");
var4=cal.acceptDouble();
if(var4!=0)break;else System.out.println("INFINITE");
}
System.out.println("THE QUOTIENT OF "+var3+"/"+var4+" IS "+cal.divide(var3,var4));
System.out.println("PRESS 1 TO ENTER AGAIN OR 0 TO EXIT");
ans2=cal.acceptInt();
if(ans2==0)j=1;
k=1;
break;
case 0:
k=1;
break;
default:
System.out.println("YOU DID NOT ENTER A VALID OPTION.TRY AGAIN");
}
}
break;
}

case 5:
{
System.out.println("ENTER THE NUMBER TO BE SQUARED:");
System.out.println("THE SQUARE OF THE NUMBER IS "+cal.square(cal.acceptDouble()));
System.out.println("PRESS 1 TO ENTER AGAIN OR 0 TO EXIT");
int ans2=cal.acceptInt();
if(ans2==0)j=1;
break;
}

case 6:
{
double var1;
while(true)
{
System.out.println("ENTER THE NUMBER TO FIND THE SQUARE ROOT OF:");
var1=cal.acceptDouble();
if(var1>=0)break; else System.out.println("CANNOT FIND SQUARE ROOT OF A NEGETIVE NUMBER . TRY AGAIN!");
}
if(var1==0)j=1;
else System.out.println("THE SQUARE ROOT OF "+var1+" IS "+cal.sqrt(var1));
System.out.println("PRESS 1 TO ENTER AGAIN OR 0 TO EXIT");
int ans2=cal.acceptInt();
if(ans2==0)j=1;
break;
}

case 7:
{
System.out.println("ENTER THE BASE NUMBER");
double var1=sc.nextDouble();
System.out.println("ENTER THE NUMBER YOU WANT TO CALCULATE PERCENTAGE ON BASE NUMBER");
double var2= sc.nextDouble();
System.out.println("THE PERCENTAGE IS "+cal.percentage(var1,var2));
System.out.println("PRESS 1 TO ENTER AGAIN OR 0 TO EXIT");
int ans2=cal.acceptInt();
if(ans2==0)j=1;
break;
}

case 8:
{
System.out.println("ENTER THE NUMBER TO CUBE:");
System.out.println("The CUBE OF THE NUMBER IS "+cal.cube(cal.acceptDouble()));
System.out.println("PRESS 1 TO ENTER AGAIN OR 0 TO EXIT");
int ans2=cal.acceptInt();
if(ans2==0)j=1;
break;
}

case 9:
{
System.out.println("ENTER THE NUMBER TO FIND CUBE ROOT OF:");
System.out.println("The cube root is "+cal.cuberoot(cal.acceptDouble()));
System.out.println("PRESS 1 TO ENTER AGAIN OR 0 TO EXIT");
int ans2=cal.acceptInt();
if(ans2==0)j=1;
break;
}

case 10:
{
System.out.println("ENTER THE BASE:");
double var1=cal.acceptDouble();
System.out.println("ENTER THE EXPONENT:");
double var2=cal.acceptDouble();
System.out.println(var1+" TO THE POWER OF "+var2+" IS "+cal.power(var1,var2));
System.out.println("PRESS 1 TO ENTER AGAIN OR 0 TO EXIT");
int ans2=cal.acceptInt();
if(ans2==0)j=1;
break;
}

case 11:
{
double var1;
while(true)
{
System.out.println("ENTER THE NUMBER TO FIND RECIPROCAL OF:");
var1=cal.acceptDouble();
if(var1!=0)break; else System.out.println("ERROR !CANNOT DIVIDE BY ZERO. TRY AGAIN");
}
System.out.println("THE RECIPROCAL OF "+var1+" IS "+cal.reciprocal(var1));
System.out.println("PRESS 1 TO ENTER AGAIN OR 0 TO EXIT");
int ans2=cal.acceptInt();
if(ans2==0)j=1;
break;
}

case 12:
{
int var1;
do
{
System.out.println("ENTER A NUMBER TO FIND FACTORIAL OF:");
var1=cal.acceptInt();
if(var1<0)System.out.println("CANNOT FIND FACTORIAL OF A NEGETIVE NUMBER . TRY AGAIN");
}
while(var1<0);
System.out.println("THE FACTORIAL OF "+var1+" IS "+cal.factorial(var1));
System.out.println("PRESS 1 TO ENTER AGAIN OR 0 TO EXIT");
int ans2=cal.acceptInt();
if(ans2==0)j=1;
break;
}

case 0:
j=1;
System.out.println("THANK YOU FOR OPERATING");
break;

default:
j=0;
System.out.println("YOU DID NOT ENTER A VALID CHOICE. ENTER AGAIN");
}
}
while(j==0);
}
}
