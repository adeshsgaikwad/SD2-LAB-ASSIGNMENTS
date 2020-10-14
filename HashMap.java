import.util.*;
public class HashMap{
 public get_frequency(){
 HashMap<Character,Integer> frequency_ount = new HashMap<>();
  Scanner scanner = new Scanner(System.in);
  String s = sanner.next();
  for(int i=0;i<s.length();i++)
  {
    char x = s.charAt(i);
    if(frequency_count.containsKey(x))
    {
    frequency_count.put(x,frequency_count.get(x)+1):
  }
  else
  {
    frequency_count.put(x,1);
   
}
System.out.println(frequency_count);
}
}
