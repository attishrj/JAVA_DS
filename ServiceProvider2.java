package com.abstractinfo.and.interfaceinfo;

public class ServiceProvider2 extends ServiceProvider implements Interf {
	
	//public class ServiceProvider2  implements Interf {
	@Override
	public void m2() {
		System.out.println("in method m2 ");

	}
	
	public static void main(String[] args) {
		ServiceProvider2 obj=new ServiceProvider2();
		obj.m2();
		obj.m1();
		System.out.println(Interf.x);
	
		Interf x=new Interf() {
			
			@Override
			public void m3() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void m2() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public int m1() {
				// TODO Auto-generated method stub
				return 0;
			}
		}; 
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	

}
