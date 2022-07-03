public class GasStation {
    
    // conditions - 
    // unique solution 
    // can't go anti clock wise
    // we have to return at the same station where we started that



    static int canCompleteCircuit(int[] gas, int[] cost){
        int startingPoint = 0;      // we will increment the starting point if the remaining Gas will be negative
        int remainingGas = 0;       // the gas exhausted traveling between 2 stations 
        int loss = 0;               // total remaining gas 
        for(int i = 0; i<gas.length; i++){
            remainingGas+=gas[i]-cost[i];
            if(remainingGas<0){
                startingPoint+=1;
                loss+=remainingGas;
                remainingGas=0;     // iinitializing the gas again
            }
        }
        return loss+remainingGas>=0?startingPoint:-1; // the loss and remaingGas sum should be greater than 0

        
    }

    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit(gas, cost));
        // O/P = 3

    }
}
