package com.work.AccessSpecifier.boot;

import com.work.AccessSpecifier.app.Hospital;
import com.work.AccessSpecifier.app.KidsHospital;

public class HospitalRunner {

	public static void main(String[] args) {
		
		System.out.println("invoking in HospitalRunner");
		
		Hospital operation = new KidsHospital();
		operation.treat();
		
		System.out.println("================");
		
		KidsHospital nurse = new KidsHospital();
		nurse.treat();
		

	}

}
