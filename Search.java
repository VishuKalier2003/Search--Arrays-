/* Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are 
adjacent, with the colors in the order red, white, and blue... We will use the integers 0, 1, and 2 to represent the color red, 
white, and blue, respectively... You must solve this problem without using the library's sort function...
* Eg 1 :  Input  = [2,0,2,1,1,0]                                         Output = [0,0,1,1,2,2]
* Eg 2 :  Input  = [2,0,1]                                               Output = [0,1,2] 
*/
import java.util.*;
public class Search
{
      public int[] SortColors(int[] nums)
      {
            int k = 0;     // Increment variable...
            int[] arr = new int[nums.length];     //* Array => O(N)
            for(int i = 0; i < nums.length; i++)      //! Zeros Rearranging => O(N)
            {
                  if(nums[i]==0)             // Checking for the zeros in the array...
                        arr[k++]=nums[i];      // Putting zero and incrementing...
            }
            for(int i = 0; i < nums.length; i++)       //! Ones Rearranging => O(N)
            {
                  if(nums[i]==1)              // Checking for the ones in the array...
                        arr[k++]=nums[i];        // Putting one and incrementing...
            }
            for(int i = 0;i < nums.length; i++)       //! Twos Rearranging => O(N)
            {
                  if(nums[i]==2)               // Checking for the two in the array...
                        arr[k++]=nums[i];         // Putting two and incrementing...
            }
            for(int i = 0; i < nums.length; i++)
                  nums[i]=arr[i];     // Copying the output array into the input array, since In-placr sorting...
            return nums;
      }
      public static void main(String args[])
      {
            Scanner scanner = new Scanner(System.in);
            int x;
            System.out.print("Enter the number of elements in the array : ");
            x = scanner.nextInt();
            int nums[] = new int[x];
            for(int i = 0; i < nums.length; i++)
            {
                  System.out.print("Enter "+(i+1)+" value : ");
                  nums[i] = scanner.nextInt();
            }
            Search search = new Search();
            nums = search.SortColors(nums);
            System.out.println("The Sorted array of colors is : ");
            for(int i = 0; i < nums.length; i++)
                  System.out.print(nums[i]+", ");
            scanner.close();
      }
}


//! Time Complexity - O(N) 
//* Space Complexity - O(N)

/** //? DEDUCTIONS :-
 * ? We check the number of ones, zeros and twos in the array...
 * ? Then, we increment the iterator and simple place the elements in ascending order...
 */