public class TwoDimensionArray{
    public static void main(String[] Args) {
        int[][] a;
        a = new int[3][];
        for(int i = 0; i < a.length; i ++) {
            System.out.println(a[i]);
        }
        for(int i = 0; i < a.length; i++) {
            a[i] = new int[3];
            for(int j = 0; j < a[i].length; j ++) {
                a[i][j] = i + j;
            }
        }
        for(int i = 0; i < a.length; i ++) {
            for(int j = 0; j < a[i].length; j ++) {
                System.out.print(a[i][j]);
            }
            System.out.println("");
        }
    }
}