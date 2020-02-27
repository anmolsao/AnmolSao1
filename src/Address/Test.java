package Address;

import java.util.Iterator;

public class Test {
public static void main(String[] args) {
	Address a1=new Address();
	        a1.setCity_name("pune");
         	a1.setArea_name("warje");
	
	
	Address a2=new Address();
	        a2.setCity_name("mumbai");
	        a2.setArea_name("boriwale");
	        
	        Student st = new Student();
	        st.setStudent_id(1000);
	        st.setStudent_Name("Anmol");
	        st.getAd().add(a1);
	        st.getAd().add(a2);
	        
	        System.out.println(st.getStudent_id());
	        System.out.println(st.getStudent_Name());
	        
	       /* Iterator<Address> itr=st.getAd().iterator();
	        while(itr.hasNext()){
	        	Address s=itr.next();
	        	 System.out.println(s.getCity_name());
	        	 System.out.println(s.getArea_name());
	        	}
	        }*/
	        
	        for (Address o : st.getAd()) {
	        	System.out.println(o.getArea_name());
	        	System.out.println(o.getCity_name());
	        	
	        }
				
			}
	       
}
