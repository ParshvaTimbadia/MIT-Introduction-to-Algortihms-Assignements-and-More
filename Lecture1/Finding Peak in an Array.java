public class MyClass {
   static int findPeakUtil(int arr[], int low, int high, int n) 
    { 
        
        
        
        while(low<=high)
        {
        int mid = low + (high - low)/2;  
  
  
        if ((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == n-1 || 
             arr[mid+1] <= arr[mid])) 
            return mid; 
  
        
        else if (mid > 0 && arr[mid-1] > arr[mid]) 
        {
            high=mid-1; 
        }
         
        else
        {
            low=mid+1;
        }
    }
    
    return -1;
    
    }
  
    
    static int findPeak(int arr[], int n) 
    { 
        return findPeakUtil(arr, 0, n-1, n); 
    }
  
    
    public static void main (String[] args) 
    { 
        int arr[] = {1, 3, 20, 4, 1, 0}; 
        int n = arr.length; 
        System.out.println("Index of a peak point is " + 
                            findPeak(arr, n)); 
    } 
} 
