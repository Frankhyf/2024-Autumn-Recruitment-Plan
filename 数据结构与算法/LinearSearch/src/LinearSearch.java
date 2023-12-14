public class LinearSearch {
   // public int  search(int[] data,int target){ 不需要每次创建一个新的对象
    private  LinearSearch(){}//让linearsearch的构造函数是私有的，不允许用户使用构造函数动态创建对象的方式
   public static int  search(int[] data,int target){ //直接调用固定的

       for (int i = 0 ;i< data.length;i++)
            if(data[i] == target)
                return i; //只有一行的话大括号可以省略，

        return -1;

    }
}
