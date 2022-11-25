package org.hotel;

public  class Hotels implements Hotel,HotelMenu{
	public static void main(String[] args) {
		Hotels h=new Hotels();
		h.chefName("jona");
		h.biriyani(120);
		h.noodles(150);
		h.parota(130);
	}

	@Override
	public void biriyani(int rate) {
		// TODO Auto-generated method stub
		System.out.println("the biriyani rate is "+rate); {
			
		}
		
	}

	@Override
	public void noodles(int rate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void parota(int rate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chefName(String name) {
		// TODO Auto-generated method stub
		
	}

}
