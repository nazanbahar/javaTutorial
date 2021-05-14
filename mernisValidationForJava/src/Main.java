import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

		public static void main(String[] args) throws RemoteException {
			KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
			
			boolean result = kpsPublic.TCKimlikNoDogrula(
					
					//Long.parseLong("tc kimlik no"), 
					//"AD(BUYUK)", 
					//"SOYAD(BUYUK)", 
					//2000   //Dogum Yili
					//); 
					Long.parseLong("5xxxxxxxxxx"), 
					"NAME", 
					"SURNAME", 
					1997   //Dogum Yili
					); 
			System.out.println("doğrulama : " + (result ? "başarılı" : "başarısız"));
		}

	}
