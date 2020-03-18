public class ClientPileBornee {

    public static void main(String[] args) throws Exception {
        /*try {
            PileBornee<Integer> p = new PileBornee<Integer>(3);
            p.push(11);
            System.out.println(p.top());
            p.push(22);
            System.out.println(p.top());
            p.push(33);
            System.out.println(p.top());
            p.push(44);
            System.out.println(p.top());
            p.pop();
            System.out.println(p.top());
            p.pop();
            System.out.println(p.top());
            p.pop();
            System.out.println(p.top());
        } catch (FullStackException e1) {
            System.out.println(e1);
        } catch (EmptyStackException e2) {
        	System.out.println(e2);
        }*/
        
        String mot1 = "radar";
        PileBornee<String> mot2 = new PileBornee<String>(15);
        for (int i=0; i < mot1.length(); i++) {
        	mot2.push(mot1.charAt(i));
        }
        /*
        String mot3 = null;
        while(!mot2.isEmpty()) {
        	mot3 = "" + mot2.top();
        	mot2.pop();
        }*/
        System.out.println(mot2.toString());
        String mot3 = "" + mot2.top();
    	mot2.pop();
    	String mot4 = "" + mot2.top();
    	mot2.pop();
    	String mot5 = "" + mot2.top();
    	mot2.pop();
    	String mot6 = "" + mot2.top();
    	mot2.pop();
    	String mot7 = "" + mot2.top();
    	mot2.pop();
    	String mot8 = "" + mot3 + mot4 + mot5 + mot6 + mot7;
    	mot8.toString();
    	System.out.println(mot1);
    	System.out.println(mot8);
		if (mot1 == mot8) {
        	System.out.println("Palindrome");
        }else {
        	System.out.println("Pas palindrome");
        }
        
    }
}
