package ArrayExercise.MaximizeStockProfit;

public class MaximizeStockProfit {

    public static void main(String[] args) {
        int prices[]  = {98,178,250,300,40,540,690};
        // int prices[] ={7,6,4,3,1};
        int boughtPrice=-1,totalProfit=0, i,profit=0;
        boolean hasStock= false;
        for( i=0;i<prices.length-1;i++){
            if(!(hasStock)){
                if(prices[i]>prices[i+1]){
                    continue;
                }else{
                    hasStock=true;
                    boughtPrice=prices[i];
                }
            }else{
                if(prices[i]<prices[i+1]){
                    continue;
                }else{
                    profit= prices[i]-boughtPrice;
                    totalProfit=totalProfit +profit;
                    hasStock=false;
                }
            }
        }
        if(i== prices.length-1 && hasStock){
            profit= prices[i]-boughtPrice;
            totalProfit=totalProfit +profit;
        }

        System.out.println(totalProfit);
    }
}
