package com.busreservation.br;

public class bus {
		int busNo;
		int capacity;
		boolean Ac;
		
public bus(int busNo, int capacity, boolean ac) {
			
			this.busNo = busNo;
			this.capacity = capacity;
			Ac = ac;
		}


		public int getBusNo() {
			return busNo;
		}
		public void setBusNo(int busNo) {
			this.busNo = busNo;
		}
		public int getCapacity() {
			return capacity;
		}
		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}
		public boolean isAc() {
			return Ac;
		}
		public void setAc(boolean ac) {
			Ac = ac;
		}
		
}
