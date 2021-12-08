package day35_encapsulation_inheritance;

public class C01 {

		
		private double not=49.9;
		private boolean geçerMi=false;
		
		public void setNot(double not) {//parametreli olması başka class'lardan buraya bilgi gelicek demek olmasıdır.
			this.not = not;
		}

		public boolean isGeçerMi() {
			if (not>=50) {
				geçerMi=true;
			}
			
			return geçerMi;
		}
		
		


	}


