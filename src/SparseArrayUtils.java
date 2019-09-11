/***
 * 稀疏数组
 * 棋盘 地图 扫雷  二维码
 * 关键是找到原二维数组中特殊值得个数
 */
public class SparseArrayUtils {

public static int[][] convertSparseArray(int arr[][]){
    int sum=0;
    System.out.println("原数组：");
    for (int i = 0; i <arr.length ; i++) {
        System.out.printf("\n");
        for (int j = 0; j <arr[i].length; j++) {
            System.out.printf("%d\t",arr[i][j]);
            if(arr[i][j]!=0){
                sum=sum+1;
            }
        }
    }
    int sparseArr[][]=new int[sum+1][3];
    sparseArr[0][0]=arr.length;
    sparseArr[0][1]=arr[1].length;
    sparseArr[0][2]=sum;
    if(arr.length>0){
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
        System.out.printf("\n");
        for (int j = 0; j <arr[i].length; j++) {
            if(arr[i][j]!=0){
                count=count+1;
                sparseArr[count][0]=i;
                sparseArr[count][1]=j;
                sparseArr[count][2]=arr[i][j];
            }
        }
    }
    }
    System.out.println("稀疏数组：");
    for (int i = 0; i < sparseArr.length; i++) {
        System.out.printf("\n");
        for (int j = 0; j <sparseArr[i].length ; j++) {
            System.out.printf("%d\t",sparseArr[i][j]);
        }
    }
return sparseArr;
}

    /***
     * 稀疏数组转二维数组
     * 读取第一行 获取到原数组的行和列
     * 循环找到原数组的特殊值
     * @param sparse
     * @return
     */
    public static int[][] convertArray(int sparse[][]){
        int arr[][]=new int[sparse[0][0]][sparse[0][1]];
        System.out.println("稀疏数组：");
        for (int i = 0; i < sparse.length; i++) {
            System.out.printf("\n");
            if(sparse[i][2]!=0){
                arr[sparse[i][0]-1][sparse[i][1]-1]=sparse[i][2];
                System.out.printf("%d\t",sparse[i][0]);
                System.out.printf("%d\t",sparse[i][1]);
                System.out.printf("%d\t",sparse[i][2]);
            }
        }
        System.out.println("原二维数组：");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("\n");
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.printf("%d\t",arr[i][j]);
            }
        }
return arr;
}

    public static void main(String[] args) {
        int arr[][]=new int[9][7];
        arr[1][1]=2;
        arr[2][3]=4;
        arr[8][2]=100;
        convertArray(convertSparseArray(arr));
    }
}
