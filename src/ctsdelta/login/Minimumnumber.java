package ctsdelta.login;

public class Minimumnumber {
	public static void findmin(int arrayone[]){
        int min = arrayone[0];
        for (int i=1; i< arrayone.length; i++){
            if(min>arrayone[i]){
                min = arrayone[i];
            }
        }
        System.out.println("minimum element is:" +min);
    }
    public static void main(String[] args){
    	Minimumnumber  ar = new Minimumnumber ();
        int arraytest[]={12,16,18,3,7,9};
        ar.findmin(arraytest);
        Welcome jc = new Welcome();
        jc.javacourse();
        jc.selenium();
    }
}