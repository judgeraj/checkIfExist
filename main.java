class Solution {
    public boolean checkIfExist(int[] arr) {

        int length = arr.length;

        int j = 0;
        int i = 0;
       
	while(j <= length - 1) {
            if(arr[i] == (arr[j]2)) {
                if(i != j) {
                    return true;
                }
            }
            if(i != arr.length - 1) {
                i++;
            } else {
                i = 0;
                j++;
            }
        }
        return false;
    }
}

/*
[-20,8,-6,-14,0,-19,14,4]
[-40,16,-12,-28,0,-38,28,8]
N = 10;
M = 5;

if (N == (2 * M))
*/
