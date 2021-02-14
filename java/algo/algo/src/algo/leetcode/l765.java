package algo.leetcode;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class l765 {
    /**
     * 并查集求
     * @param row
     * @return
     */
    //在一个连通分量内，必定形成一个环
    public static int minSwapsCouples(int[] row) {
        int n = row.length;
        int tot = n/2;
        int[] f = new int[tot];// 每一对情侣占用一个索引
        for(int i=0;i<f.length;i++){
            f[i]=i; //形成自环
        }
        //连通
        for(int i=0;i<n;i+=2){
            int a = row[i]/2;
            int b = row[i+1]/2;
            add(f,a,b);
        }
        //统计每个连通分量的数量
        Map<Integer,Integer> countMap = new HashMap();
        for(int i=0;i<tot;i++){
            int fx = getf(f, i);
            countMap.put(fx, countMap.getOrDefault(fx, 0)+1);
        }
        //计算结果
        int ret =0;
        for(Integer c:countMap.values()){
            ret +=(c-1);
        }
        return ret;
    }

    //并查集求连通分量
    public static int getf(int[] f, int x){
        if (f[x]==x)return x;
        int newfx = getf(f,f[x]);
        f[x]  = newfx;
        return newfx;
    }

    //连通两个量
    public static void add(int[]f,int x,int y ){
        int fx = getf(f, x);
        int fy = getf(f, y);
        f[fx] = fy;
    }

    /**
     * 广度优先遍历
     * 
     */
    public static int minSwapsCouples2(int[] row) {
        int n = row.length;
        int tot = n/2;
        List<Integer>[] graph = new List[tot];
        for(int i=0;i<tot;i++){
            graph[i]= new ArrayList<Integer>();
        }
        for(int i=0;i<n;i+=2){
            int a = row[i]/2;
            int b = row[i+1]/2;
            if (a!=b){
                graph[a].add(b);
                graph[b].add(a);
            }
        }
        boolean[] visited = new boolean[tot];
        int ret =0;
        for(int i=0;i<tot;i++){
            while(!visited[i]){
                Queue<Integer> q = new LinkedList();
                q.offer(i);
                visited[i] = true;
                int cnt =0;

                while(!q.isEmpty()){
                    int x = q.poll();
                    cnt +=1;
                    List<Integer> list = graph[x];
                    for(int y:graph[x]){
                        if(!visited[y]){
                            q.offer(y);
                            visited[y]=true;
                        }
                    }
                }
                ret += (cnt-1);
            }
        }
        return ret;
    }

    public static void main(String[] aStrings){
        int[] arr = {2,0,5,4,3,1};
        int res = minSwapsCouples2(arr);
        System.out.println(res);
    }
    
}
