//package cf.cf_practise.java_practise.cf;
import java.io.*;
public class hedtai {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x,y,a,b;
        x=Integer.parseInt(br.readLine());
        y=Integer.parseInt(br.readLine());
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        int i,j,t,cnt=0;
        if(x>b)
        {
           // System.out.println("hii");
            if(a!=b)
            {
                cnt=(x-y)+(x-a)+1;
            }
            else
            {
                cnt=(x-y)+(x-a);
            }
            if(a>=b)
            {
                t=a+1;
            }
            else
            {
                t=b+1;
            }
            System.out.println(cnt);
            for(i=b;i<=y;i++)
            {
                for(j=i+1;j<=x;j++)
                {
                    System.out.println(j+" "+i);
                }
            }
        }
        else
        {
            System.out.println(cnt);
        }


    }
}
