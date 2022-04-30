package gn.k48.interview.RongYao;

import java.util.*;

public class RongYao2 {
    public static class TimeCapple{
        public int startTime;
        public int endTime;
        public int lenth;
        TimeCapple(int startTime,int endTime){
            this.startTime = startTime;
            this.endTime = endTime;
            this.lenth = endTime-startTime;
        }
    }

    public static void solution(int[] startTime ,int[] endTime, int allEndTime){
        int N = startTime.length;
        PriorityQueue<TimeCapple> queue = new PriorityQueue<>(new Comparator<TimeCapple>() {
            @Override
            public int compare(TimeCapple o1, TimeCapple o2) {
                if(o1.endTime !=o2.endTime)return o1.endTime-o2.endTime;
                return o1.lenth -o2.lenth;
            }
        });
        for(int i=0;i<N;i++){
            queue.offer(new TimeCapple(startTime[i],endTime[i]));
        }
        int lastStartTime = 0;
        int lastEndTime = 0;
        List<TimeCapple> resList = new ArrayList<>();
        while(!queue.isEmpty()){
            TimeCapple tc = queue.poll();
            if(tc.endTime==lastEndTime)break;
            if(tc.startTime<lastEndTime)continue;
            lastEndTime = tc.endTime;
            lastStartTime = tc.startTime;
            resList.add(tc);
        }
        System.out.println("count:"+resList.size());
        for(int i=0;i<resList.size();i++) {
            TimeCapple tc = resList.get(i);
            System.out.print("("+tc.startTime+","+tc.endTime+") ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String times = in.nextLine().replace("(","").replace(")","");
        String[] timeStrs = times.split(" ");
        int N = timeStrs.length;
        int[] startTime = new int[N];
        int[] endTime = new int[N];
        int allEndTime = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            String[] ts = timeStrs[i].split(",");
            startTime[i] = Integer.parseInt(ts[0]);
            endTime[i] = Integer.parseInt(ts[1]);
            if(endTime[i]>allEndTime)allEndTime=endTime[i];
        }
        solution(startTime,endTime,allEndTime);
    }
}
