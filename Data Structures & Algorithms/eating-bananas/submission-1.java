class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        //high is the length from the numbers from 1 to last biggest banana integer
        // piles[i] will make the code crash out from going over the index of 4 since we have none
        for (int i=0; i<piles.length; i++){
            //high += piles[i]; high = 
            high = Math.max(high, piles[i]);
        }

        while (low< high){ //correct
            int middle = low + (high-low) /2; //correct
            int hrsCalc = 0; //hours calculated should be here

            //calculate the total hours using that middle
            //koko will take to eat bananas,
            //3,5,6,7
            // middle = 6
            for (int i=0; i < piles.length; i++){
                //hrsCalc = hrsCalc+ hrsCalc;
                //i forgot to calculate the division of rounding up numbers
                hrsCalc += (piles[i] + middle - 1) / middle;
            }

            // if statment should have been outside
            if(hrsCalc <= h){
                high = middle; //this speed works, lets try to find another smaller
            } else{
                low = middle +1;
            }
        }
        return low;
    }
}