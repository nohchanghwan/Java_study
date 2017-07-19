package tv.factory;

import tv.model.vo.LgTV;
import tv.model.vo.SamsungTV;
import tv.model.vo.TV;

public class TvFactory {

		public static TV getBean(String brand){
			TV tv = null;
			if(brand.equals("Samsung")){
				tv = new SamsungTV();
			}else{
				tv = new LgTV();
			}
			return tv;
		}
}
