// class Solution {
//     public void reverseString(char[] s) {
//         int left = 0;
//         int right = s.length - 1;

//         while (left < right) {
//             // swap s[left] and s[right]
//             char temp = s[left];
//             s[left] = s[right];
//             s[right] = temp;

//             left++;
//             right--;
//         }
//     }
// }

class Solution{
    public static void reverseString(char[] s){
        solve(0,s.length-1,s);
    }
    public static void solve(int i, int j, char[] s){
         if(i>=j) return;
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        solve(i+1,j-1,s);
    }
}