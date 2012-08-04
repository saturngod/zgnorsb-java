public class zawgyi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		zgnorsb test = new zgnorsb();
		System.out.println(test.normalize("ကိုကုိ"));
		System.out.println(test.normalize("ကိုကုိ","|",true));
		
		System.out.println(test.normalize("ျကိုၾကို"));
		System.out.println(test.normalize("ၾကိဳးၾကုိ","|",true));
	}

}
