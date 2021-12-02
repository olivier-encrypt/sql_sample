import java.util.Scanner;

//file was changed by another developer

public class vecteur {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t1,t2,t3;
        double norm1,norm2,distant;
        
        System.out.println("entrer la taille du premier vecteur: ");
        t1=sc.nextInt();
        int v1[]=new int[t1];
        stockage(v1);

        System.out.println("\nentrer la taille du deuxieme vecteur: ");
        t2=sc.nextInt();
        int v2[]=new int[t2];
        stockage(v2);

        if(t1>t2)
        {
            t3=t1;
        }
        else {
            t3=t2;
        }
        int v3[]= new int[t3];
        System.out.print("\nv1= ");
        affichage(v1);
        
        System.out.print("\nv2= ");
        affichage(v2);
        
        System.out.print("\nl'addition v3= ");
        addition(v1,v2,v3);
        affichage(v3);
        System.out.print("\nla soustraction v3= ");
        soustraction(v1,v2,v3);
        affichage(v3);
        System.out.print("\nle produit scalaire v3= ");
        scalaire(v1,v2,v3);
        affichage(v3);

        System.out.print("\nentrer la norme du vecteur: ");
        int p=sc.nextInt();
        norm1=norme(v1,p);
        norm2=norme(v2,p);
        System.out.print("\nla norme du vecteur v est:"+norm1);
        System.out.print("\nla norme du vecteur v est:"+norm2);

        distant=distance(v1,v2,p);
        System.out.print("\nla distance est: "+distant);
        
        
        return;

    }
    
    public static void stockage(int tab[]){
        Scanner sc=new Scanner (System.in);
        int i;
        System.out.print("\nentrer les valeur de votre vecteur: ");
        for (i=0;i<tab.length;i++)
        {
            tab[i]=sc.nextInt();
        }
        return;
    }
    public static void affichage(int vect[]){
        
        for(int i=0;i<vect.length;i++)
        {
            System.out.println(vect[i]);
        }
    }
    public static void addition(int a[],int b[],int c[]){
        int i=0,j=0,k=0;
        if(a.length==b.length){
            while(i<a.length && j<b.length)
            {
                
                c[k]=a[i]+b[j];
                k++;
                i++;
                j++;
            }

        }
       
        else if(a.length!=b.length){
            while(i<a.length && j<b.length)
            {
                
                c[k]=a[i]+b[j];
                k++;
                i++;
                j++;
            }
            if (i>=a.length)
            {
                c[k]=b[j];
                k++;
                j++;
            }
            else if(j>=b.length){
                c[k]=a[i];
                k++;
                i++;
            }
        }
        
        
    }
    public static void soustraction(int a[],int b[],int c[]){
        int i=0,j=0,k=0;
        if(a.length==b.length)
        {
            while(i<a.length && j<b.length)
            {
                c[k]=a[i]-b[j];
                k++;
                i++;
                j++;
            }
        }
        
        else if(a.length!=b.length)
        {
            while(i<a.length && j<b.length)
            {
                c[k]=a[i]-b[j];
                k++;
                i++;
                j++;
            }
            if (i>=a.length)
            {
                c[k]=b[j];
                k++;
                j++;
            }
            else if(j>=b.length){
                c[k]=a[i];
                k++;
                i++;
            }
        }
        return;

    }
    public static void scalaire(int a[],int b[],int c[]){
        int i=0,j=0,k=0;
        if(a.length==b.length)
        {
            while(i<a.length && j<b.length)
            {
                
                c[k]=a[i]*b[j];
                k++;
                i++;
                j++;   
            }
        }
        else if(a.length!=b.length)
        {
            while(i<a.length && j<b.length)
            {
                
                c[k]=a[i]*b[j];
                k++;
                i++;
                j++;
            }
            if (i>=a.length)
            {
                c[k]=b[j];
                k++;
                j++;
            }
            else if(j>=b.length){
                c[k]=a[i];
                k++;
                i++;
            }
        }
        
    }
    public static double norme(int tab[],int p1){
        int i=0;
        double k,p3;
        double som=0;
        while (!(i>=tab.length))
        {
            k=Double.valueOf(tab[i]).doubleValue() ;
            som+=Math.pow(k,p1);
            i++;
        }
        p3=(double)1/(double)p1;

        return  Math.pow(som,p3);
    }
    static double distance(int a[],int b[],int p2)
    {
        int a1,b1,c1;
        double dist;
        if(a.length>b.length)
        {
            c1=a.length;
        }
        else {
            c1=b.length;
        }
        int c[]=new int[c1];
        soustraction(a,b,c);
        return dist= norme(c,p2);
    }
   
}
