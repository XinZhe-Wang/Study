public class Sort {
    public static void sort(String[] x) {
        //找到最小的单位
        //把它移动到前面
        //选择排序其余的string
        sort(x,0);
    }

    private static void sort(String[] x,int start){
        if (start==x.length){
            return;
        }
        int smallestIndex = findSmallest(x,start);
        swap(x,start,smallestIndex);
        sort(x,start+1);
    }


    public static int findSmallest(String[] x, int start){
        int smallestIndex = start;
        for(int i = start;i<x.length;i=i+1){
            int cmp = x[i].compareTo(x[smallestIndex]);
            if (cmp<0){
                smallestIndex = i;
            }
        }
        return smallestIndex;

    }

    public static void swap(String[] x,int a,int b){
        String temp = x[a];
        x[a] = x[b];
        x[b] = temp;
    }
}
