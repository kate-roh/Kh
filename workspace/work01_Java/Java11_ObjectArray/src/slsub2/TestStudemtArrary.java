package slsub2;

public class TestStudemtArrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

int count = 0;
boolean chek = true;

while(check) {
	System.out.print("학년: ");
	Int grade = next.
			
	If(yn=='y'){
		count ++;
	}else {
		check = false;
	}
}
	Int sumKor = 0, sumEng = 0, sumMath = 0;
	
	for(int i =0; i<= count; i++) {
		sumKor += sarr[i].getKor();
		sumEng += sarr[i].getEng();
		sumMath += sarr[i].getMath();
		
	}
	System.out.println("국어 평균: " + (sumKor/(count+1)));
	System.out.println("영어 평균: " + (sumEng/(count+1)));
	System.out.println("수학 평균: " + (sumMath/(count+1)));
	
	//전체 학생 정보
	for(int i = 0; i<=count; i++) {
		System.out.println(sarr[i].informatio());
	}