import java.util.ArrayList;

public class A1{
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>();
       
       list.add(1);
       list.add(3);
       list.add(4);
       list.add(11);
       list.add(12);
       list.add(24);
       list.add(27);
       list.add(34);
       list.add(38);
       list.add(46);

       Integer search = Integer.parseInt(args[0]);
       boolean result = false;
       
       for(int i= 0; i<list.size();i++){
        if(search.equals(list.get(i))){
            result = true;
        }
       }
       if(result){
        System.out.println("the number is in the list.");
       }else{
        System.out.println("the number is not in the list.");
       }

    }
}
