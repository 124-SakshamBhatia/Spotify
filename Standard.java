class Standard 
 {
    public static void main(String[] args)
      {
    int a[] = {12,13,14,16,-2,-40,32,10,15};
    double sum = 0;
    for(int i=0;i<a.length;i++)
     {
        sum = sum + a[i];
     }
     double x1 = sum/a.length;
     System.out.println("Mean is:"+x1);
     double sum1 =0;
     for(int i=0;i<a.length;i++)
     {
        sum1 = sum1 + Math.pow((x1-a[i]),2);  
    }
     System.out.println("Varirance is: "+(sum1/(double)(a.length)));
    System.out.println("Standard Deviation is: "+Math.sqrt(sum1/(double)(a.length)));
      }

 }