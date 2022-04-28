package chapter4;

import java.util.HashMap;

public class UnionSet {
    public static class Node{

    }

    public static class DisJoinSets{
        public HashMap<Node,Node> fatherMap;
        public HashMap<Node,Integer> setSize;

        public DisJoinSets(){
            fatherMap = new HashMap<>();
            setSize=new HashMap<>();
        }
        public void makeSet(Node[] nodes){
            for(Node n:nodes){
                fatherMap.put(n,n);
                setSize.put(n,1);
            }
        }

        private Node getRepresentative(Node A){
            Node father = fatherMap.get(A);
            if(father== A)return A;
            else{
                father =getRepresentative(father);
            }
            fatherMap.put(A,father);
            return father;
        }

        public boolean isSameSet(Node A,Node B){
            return getRepresentative(A)==getRepresentative(B);
        }

        public void union(Node A,Node B){
            if(A==null||B==null){
                return;
            }
            Node AFather = getRepresentative(A);
            Node BFather = getRepresentative(B);
            if (AFather!=BFather){
                int AsetSize = setSize.get(AFather);
                int BsetSize = setSize.get(BFather);
                if(AsetSize >=BsetSize){
                    fatherMap.put(BFather,AFather);
                    setSize.put(BFather,BsetSize+AsetSize);
                }
                else{

                    fatherMap.put(AFather,BFather);
                    setSize.put(AFather,BsetSize+AsetSize);
                }
            }

        }

    }


}
