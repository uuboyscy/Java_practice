/*
 * 2.	二維陣列的練習-Sales
某一公司有五種產品A、B、C、D與E，其單價分別為12、16、10、14與15元；而該公司共有三位銷售員，他們在某月份的銷售數量如下所示
試計算：
a.	每一個銷售員的銷售總金額
b.	每一項產品的銷售總金額
c.	有最好業績（銷售總金額最多者）的銷售員
d.	銷售總金額最多的產品
*/

public class Sales {
    
    static int earnForEachMan(int[] allsops) { // all sorts of product sold each person 
        int[] price = {12, 16, 10, 14, 15};
        // price for   A   B   C   D   E
        int total = 0;
        for(int i = 0 ; i < allsops.length ; i++) total += allsops[i] * price[i];
        return total;
    } // earnForEachMan
    
    static int earnForEachSortOfProduct(int[][] all, int sort) { // total earing of each sort of product
        int[] price = {12, 16, 10, 14, 15};
        // price for   A   B   C   D   E
        int total = 0;
        for(int i = 0 ; i < all.length ; i++) total += all[i][sort] * price[sort];
        return total;
    } // earnForEachSortOfProduct
    
    static int[] max(int[] list) { // find the max value, return its order number
        double temMax/*, temMin*/;
        temMax = list[0];
        for(int i = 0 ; i < list.length ; i++) {
            temMax = temMax > list[i] ? temMax : list[i];
        } // for
        
        int[] maxOrder = new int[list.length]; //order numbers which have max        
        for(int j = 0 ; j < list.length ; j++) {
        	if(temMax == list[j]) maxOrder[j] = 1; // if list[j] is one of the max , maxOrder[j]=1 ,otherwise 0
        } // for
        
        return maxOrder;
    } // max
    public static void main(String[] args) {
        
        int[][] productSold =    {    
                                    {33, 32, 56, 45, 33}, // sales 1
                                    {77, 33, 68, 45, 23}, // sales 2
                                    {43, 55, 43, 67, 65},  // sales 3 
                                    {43, 55, 43, 67, 65},
                                    {123, 44, 454, 42, 1}
                                };
        int[] salesRecord = new int[productSold.length]; // array of every sales total
        int[] sortRecord = new int[productSold[0].length]; // array of every sort total
        
        for(int i = 0 ; i < productSold.length ; i++) {
        	System.out.printf("Salesperson NO.%d sold %d dollars.\n", i+1, earnForEachMan(productSold[i]));
        	salesRecord[i] = earnForEachMan(productSold[i]);
        } // for i
        System.out.println();
        
        for(int j = 0 ; j < productSold[0].length ; j++) {
        	System.out.printf("Total sold of %c product is %d dollars.\n", j+65, earnForEachSortOfProduct(productSold, j));
        	sortRecord[j] = earnForEachSortOfProduct(productSold, j);
        } // for j
        System.out.println();
        
        System.out.print("The best salesman " + (max(salesRecord)[1]==0?"is":"are"));
        for(int x = 0 ; x < max(salesRecord).length ; x++) 
        	if(max(salesRecord)[x] == 1) System.out.printf(" No.%d", x+1);
        System.out.print("\n");
        
        System.out.print("The most popular product " + (max(sortRecord)[1]==0?"is":"are"));
        for(int y = 0 ; y < max(sortRecord).length ; y++) 
        	if(max(sortRecord)[y] == 1) System.out.printf(" Class.%c", y+65);
        System.out.print("\n");
    } // main 
} // class