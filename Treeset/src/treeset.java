import java.util.HashMap;;
public class treeset {
    public static void main(String[]args){
        HashMap<Integer,String> set=new HashMap<Integer, String>();
                set.put(1,"Shreyas");
                set.put(2,"Bhushan");
                set.put(3,"Bharat");
        System.out.println(set.keySet());
        System.out.println(set.values());
        System.out.println(set.entrySet());
        for (HashMap.Entry<Integer,String> pat:set.entrySet())
        {
            System.out.println(pat);
        }
    }
}
