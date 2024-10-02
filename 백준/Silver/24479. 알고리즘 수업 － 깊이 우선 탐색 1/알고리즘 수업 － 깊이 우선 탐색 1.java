import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static boolean visited[];

    public static  ArrayList<Integer> list[];



    public static int NodesOrder[];

    public static int count=0;
    public static void DFS(int start,int N){
       visited[start]=true;
       count++;
       NodesOrder[start]=count;
       for(int i=0;i < list[start].size();i++){
           int findNode = list[start].get(i);
           if(!visited[findNode]){
               DFS(findNode,N);
           }
       }
    }

   public static void main(String []args) throws IOException{

        Scanner scanner=new Scanner(System.in);
        int N= scanner.nextInt();
        int M=scanner.nextInt();
        int R=scanner.nextInt();

        visited=new boolean[N+1];
        list=new ArrayList[N+1];
        for(int i=1;i<=N;i++){
            list[i]=new ArrayList<>();
        }
        NodesOrder=new int[N+1];

        for(int i=0;i<M;i++){
            int a= scanner.nextInt();
            int b= scanner.nextInt();

            list[a].add(b);
            list[b].add(a);
        }
        for(int i=1;i<=N;i++){
            Collections.sort(list[i]);
        }



        DFS(R,N);

        for(int i=1;i<=N;i++){
            System.out.println(NodesOrder[i]);
        }
   }
}