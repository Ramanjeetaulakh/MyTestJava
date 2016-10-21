class Palindrome 
{
public static void main(String[] args) 
{
int a,no,b,temp=0;

no=1551;
b=no;
while(no>0)
{
a=no%10;
no=no/10;
temp=temp*10+a;
}
if(temp==b)
{
System.out.println("Palindrome");
}
else
{
System.out.println("not Palindrome");
}
}
}