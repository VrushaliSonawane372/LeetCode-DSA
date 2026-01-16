void reverseString(char* s, int sSize) 
{
   int start = 0;
   int end = sSize - 1;
   char temp;
   while(start <= end)
   {
     temp = s[end];
     s[end] = s[start];
     s[start] = temp;

     start++;
     end--;
   }    
}