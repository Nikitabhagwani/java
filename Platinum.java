import java.util.*;


public class Platinum 

{
    
static int val(int n)
    
{
        
int a=0;
        
for(int i=2;i<=4;i++)
        
{
            
a=a+(n/i);
            
        
}
        
if(a>n)
        
return a;
        
else
        
return n;
    
}
  
static int check(int n)
  
{
      
int i=4,answer=0;
      
while(i>1)
      
{
          
answer=answer+val(n/i);
          
i=i-1;
      
}
      
if(answer>n)
        
return answer;
        
else
        
return n;
  
}
  
public static void main(String args[])
  
{
      
Scanner sc=new Scanner(System.in);
      
int n=sc.nextInt();
     
int sum=0;
      
if(n>=2 && n<=1000000000)
      
{
         
sum=check(n);
         
System.out.print(sum);
         
      
}
      
else
      
{
         
System.out.print("Platinum weight must be between 2 to 1000000000");  
      
}
  
}

}