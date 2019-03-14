package Lab1;

public class test {
	int giveNumber = 0;
	public boolean zeroTest(int x){
		giveNumber = x;
		if(giveNumber >=50) {
			giveNumber -=50;
			if(giveNumber>=0 && giveNumber <=3) 
			{return true;}
			if(giveNumber>=5 && giveNumber<=8)
			{return true;}
			if(giveNumber>=10  && giveNumber<=13)
			{return true;}
			if(giveNumber>=20 && giveNumber<=23)
			{return true;}
			if(giveNumber>=25 && giveNumber<=28)
			{return true;}
			if(giveNumber>=30 && giveNumber<=33)
			{return true;}
		}
		else if(giveNumber >=20) {
			giveNumber -=20;
			if(giveNumber>=0 && giveNumber <=3) 
			{return true;}
			if(giveNumber>=5 && giveNumber<=8)
			{return true;}
			if(giveNumber>=10  && giveNumber<=13)
			{return true;}
		}
		else if(giveNumber >=5) {
			giveNumber -=5;
			if(giveNumber>=0 && giveNumber <=3) 
			{return true;}
			if(giveNumber>=5 && giveNumber<=8)
			{return true;}
		}
		else if(giveNumber >=0) {
			if(giveNumber>=0 && giveNumber <=3) 
			{return true;}
		}
		return false;
//		if(giveNumber>=0 && giveNumber <=3) 
//		{return true;}
//		if(giveNumber>=5 && giveNumber<=8)
//		{return true;}
//		if(giveNumber>=10  && giveNumber<=13)
//		{return true;}
//		if(giveNumber>=20 && giveNumber<=23)
//		{return true;}
//		if(giveNumber>=25 && giveNumber<=28)
//		{return true;}
//		if(giveNumber>=30 && giveNumber<=33)
//		{return true;}
//		if(giveNumber>=50 && giveNumber<=53)
//		{return true;}
//		if(giveNumber>=55 && giveNumber<=58)
//		{return true;}
//		if(giveNumber>=60 && giveNumber<=63)
//		{return true;}
//		if(giveNumber>=70 && giveNumber<=73)
//		{return true;}
//		if(giveNumber>=75 && giveNumber<=78)
//		{return true;}
//		if(giveNumber>=80 && giveNumber<=83)
//		{return true;}
	}
	
}
