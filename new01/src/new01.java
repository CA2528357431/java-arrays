// 数组 的 方法集合

import java.util.Arrays;

public class new01 {
    public static void main(String[] args){
        int[] li = {1,2,3,4,0,-1,-6,13};
        System.out.println(li);
        String listr = Arrays.toString(li);
        System.out.println(listr);

        Arrays.sort(li);
        listr = Arrays.toString(li);
        System.out.println(listr);
        // 默认升序


        int[] neo = Arrays.copyOf(li,li.length-3);
        // 参数是新长度
        // 小于原长则省略末尾
        // 大于原长则补充0
        li[0]=1000;

        listr = Arrays.toString(li);
        System.out.println(listr);

        listr = Arrays.toString(neo);
        System.out.println(listr);

        int[] zip = Arrays.copyOfRange(li,3,6);
        // 参数是头尾  包含原则同py
        // 小于原长则省略末尾
        // 大于原长则补充0
        listr = Arrays.toString(zip);
        System.out.println(listr);



    }
}
