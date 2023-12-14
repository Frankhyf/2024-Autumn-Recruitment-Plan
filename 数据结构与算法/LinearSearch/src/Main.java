
public class Main {
    public static void main(String[] args) {
        int[] data = {24,1,16,453,65,786,8675,432};

        //LinearSearch ls = new LinearSearch();
        int res = LinearSearch.search(data, 16);//这里不能直接输入target而是直接输入16，target让系统自动生成
        System.out.println(res);

    }
}