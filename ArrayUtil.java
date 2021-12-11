public class ArrayUtil {
    int[] intArray;

    //create a construtor taking in one parameter
    public ArrayUtil(int[] arr){
        this.intArray = arr;
    }

    //create a constructor without any parameter
    public ArrayUtil(){}

    //getter to get the array from the object
    public int[] getter(){
        return intArray;
    }
    //set an array for the object
    public void setIntArray(int[] arr){
        this.intArray = arr;
    }
    //minValue method to find the min value in the array
    public int minValue(){
        if (intArray.length==0){
            return 0;
        } else{
            int min=intArray[0];

            for(int x=0; x<intArray.length;x++){
                min = Math.min(min, intArray[x]); //using Math.min to find the min value between 2
            }

            return min;
        }
    }
    //maxValue method to find the max value in the array
    public int maxValue(){
        if (intArray.length==0){
            return 0;
        } else{
            int max=0;

            for(int x=0; x<intArray.length;x++){
                max = Math.max(max, intArray[x]); //using Math.max to find the max value between 2
            }

            return max;
        }
    }
    //count many unique value in the array
    public int countUniqueIntegers(){
        int uniqueCount=0;
        boolean unique=false;

        for(int x=0; x<intArray.length;x++){ //count the first value in the array
            if (x==0){
                uniqueCount++;
            }else{
                for(int y=0; y<x; y++){  //inner loop to check the value behind if repeated
                    if(intArray[x]==intArray[y]){
                        unique=false;
                        break;
                    }else{
                        unique =true;
                    }
                }
                if(unique){
                    uniqueCount++;
                }else{
                    continue;
                }
            }
        }
        
        return uniqueCount;
    }
    //do the same thing as countuniqueIntgers method but with a little bit different so that unique number can be store in a different array
    public int[] uniqueArray(){
        int[] uniqueArr = new int[countUniqueIntegers()]; //create an array with the length of the number of unique number
        int z=0;

        boolean unique=false;

        for(int x=0; x<intArray.length;x++){
            if (x==0){
                uniqueArr[z++] = intArray[x];
            }else{
                for(int y=0; y<x; y++){
                    if(intArray[x]==intArray[y]){ 
                        unique=false;
                        break;
                    }else{
                        unique =true;
                    }
                }
                if(unique){
                    uniqueArr[z++] = intArray[x]; //create int z so that it can only increase when there is a unique nnumber.
                }else{
                    continue;
                }
            }
        }
        
        return uniqueArr;
    }
    //swap method
    public void swapElement(int a, int b){
        int swap1 = intArray[a];  //creat 2 variable to store them
        int swap2 = intArray[b];

        intArray[a] = swap2; //then just swap each other for the other one.
        intArray[b] = swap1;
    }
    //method to tell whether it sorted or not and in what order
    public String arrayIfSorted(){
        boolean descending=true, ascending=true; // 2 boolean variable to determind if it increase or decrease order
        
        for(int x=0; x<intArray.length-1;x++){ //check if increase order
            if(intArray[x]<=intArray[x+1]){
                continue;
            }else{
                ascending =false;
                break;
            }
        }

        for(int x=0; x<intArray.length-1;x++){ //check if decrease order
            if(intArray[x]>=intArray[x+1]){
                continue;
            }else{
                descending =false;
                break;
            }
        }

        if(ascending){ //return the message
            return "The array is sorted in ascending order";
        } else if(descending){
            return "the array is sorted in decending order";
        } else{
            return "unsorted!";
        }
    }
}
