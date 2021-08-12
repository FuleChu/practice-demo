package com.chu.practicedemo.algorithm;
// https://leetcode-cn.com/problems/number-of-provinces/?utm_source=LCUS&utm_medium=ip_redirect&utm_campaign=transfer2china
// 使用并查集进行解题
class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int N = isConnected.length;
        ProvincesUnion provincesUnion = new ProvincesUnion(N);
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                //如果相连再进行union
                if (isConnected[i][j] == 1) {
                    provincesUnion.unionFind(i,j);
                }
            }
        }
        return provincesUnion.size;
    }

    class ProvincesUnion{
        //每个节点的父节点 parent[1]代表省份1相连的父节点值，初始时都为自己本身
        public int[] parent;
        //代表节点：最顶层的节点； 最顶层节点包含子节点的总大小
        public int[] headSitSize;
        public int[] help;
        public int size;

        public ProvincesUnion(int N){
            parent = new int[N];
            headSitSize = new int[N];
            help = new int[N];
            size = N;
            for (int i = 0; i < N; i++) {
                parent[i] = i;
                headSitSize[i] = 1;
            }
        }

        public int find(int i){
            int index = 0;
            while (parent[i] != i) {
                //help中放入父节点不是自己本身的值，比如i = 4的父为3,3的父亲为1 ,help[0]=4,help[1]=3
                help[index++] = i;
                i = parent[i];
            }
            //错误写法
//            for (int i1 : help) {
//                parent[i1] = i;
//            }
            for (index--; index >= 0; index--) {
                //设置4的父亲为1,3的父亲为1 扁平化
                parent[help[index]] = i;
            }
            return  i;
        }

        public void unionFind(int i, int j){
            int pi = find(i);
            int pj = find(j);
            if (pi != pj) {
                int fiSize = headSitSize[pi];
                int fjSize = headSitSize[pj];
                if (fiSize >= fjSize) {
                    //将j的祖先节点更换为i的祖先节点，进行union
                    parent[pj] = pi;
                    headSitSize[pi] = fiSize + fjSize;
                } else {
                    parent[pi] = pj;
                    headSitSize[pj] = fiSize + fjSize;
                }
                size--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] isConnected = {{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}};
        NumberOfProvinces provinces = new NumberOfProvinces();
        int circleNum = provinces.findCircleNum(isConnected);
        System.out.println(circleNum);
    }


}