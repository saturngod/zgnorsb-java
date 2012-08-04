import java.util.ArrayList;


public class zgnorsb {

	public String normalize(String string)
	{
		return normalize(string,"|",false);
	}
	
	public String normalize(String string,String cb,boolean syllable)
	{
		
		string=string+" ";
		//$string=str_replace("။"," ။",$string);
		string = string.replace("။", " ။");
		
		String ka_ah="(က|ခ|ဂ|ဃ|င|စ|ဆ|ဇ|ဈ|ဉ|ည|ဋ|႗|ဥ|ဍ|ဎ|ဏ|တ|ထ|ဒ|ဓ|န|ႏ|ပ|ဖ|ဗ|ဘ|မ|ယ|ရ|႐|လ|ဝ|သ|ႆ|ဟ|ဠ|႒|ဧ|အ|႑|၏|ဩ|၍|၎|၌)";
		String ka_ah2="(က|ခ|ဂ|ဃ|င|စ|ဆ|ဇ|ဈ|ဉ|ည|ဋ|႗|ဥ|ဍ|ဎ|ဏ|တ|ထ|ဒ|ဓ|န|ႏ|ပ|ဖ|ဗ|ဘ|မ|ယ|ရ|႐|လ|ဝ|သ|ႆ|ဟ|ဠ|႒|ဧ|အ|႑|၏|ဩ|၍|၎|၌|ေ|ၾ|ျ|ႄ|ၿ|ႁ||)";

		String mypattern="(ံ|ိ|ီ|ႋ|ႌ|ႍ|ႎ|ာ|ါ|ၚ|ဳ|ဴ|ြ|ႊ|ု|ူ|ႈ|္|း|ဲ|့|႕|်|ၽ|ွ|ၤ|္)";

		String low_char="ၤ|ၠ|ၡ|ၢ|ၣ|ၥ|ၦ|ၧ|ၬ|ၭ|ၨ|ၰ|ၱ|ၳ|ၲ|ၳ|ၴ|ၵ|ၶ|ၷ|ၸ|ၹ|ၺ|ၻ|ၼ|ႅ|႓|႖|ႆ";
		
		int j=0;
		
		ArrayList<String> pattern = new ArrayList<String>();
		ArrayList<String> replacement = new ArrayList<String>();

		
		pattern.add("(ွ|ု|ူ|ဳ|ဴ|ႈ)(ံ|ိ|ီ|ႋ|ႌ|ႍ|ႎ)");
		replacement.add( "$2$1");
		
		j=j+1;

		pattern.add("(ံ|ိ|ီ|ႋ|ႌ|ႍ|ႎ)(်|ၽ)");
		replacement.add( "$2$1");

		j=j+1;


		pattern.add("(ွ|ု|ူ|ဳ|ဴ|ႈ)ံ");
		replacement.add( "ံ$1");

		j=j+1;


		pattern.add("(ဲ|ံ|ိ|ီ|ႋ|ႌ|ႍ|ႎ|ႋ|ႌ|ႍ|ႎ)(ြ|ႊ)");
		replacement.add( "$1$2");

		j=j+1;

		pattern.add("ေ၇");
		replacement.add( "ေရ");

		j=j+1;

		pattern.add("၇(ြ|ႊ|ာ|ွ|ု|ႈ)");
		replacement.add( "႐$1");

		j=j+1;

		pattern.add("(႔|႕|႔)");
		replacement.add( "့");

		j=j+1;


		pattern.add("ံြ");
		replacement.add( "ြံ");

		j=j+1;

		pattern.add("(န|ရ)(ဲ|္|ံ)(့|႕)");
		replacement.add("$1$2႕");

		j=j+1;

		pattern.add("(န|ရ)(့|႕)(ဲ|္|ံ)");
		replacement.add("$1$3႕");

		j=j+1;

		pattern.add("(့|႕)္");
		replacement.add( "္$1");

		j=j+1;

		pattern.add("(ျ|ၿ|ႁ)");
		replacement.add( "ျ");

		j=j+1;

		pattern.add("ျ(ခ|ဂ|င|စ|ဒ|ဓ|ႏ|ပ|ဖ|ဗ|မ|ဝ)(ံ|ိ|ီ|ႋ|ႌ|ႍ|ႎ)");
		replacement.add( "ၿ$1$2");

		j=j+1;

		pattern.add("ျ(ခ|ဂ|င|စ|ဒ|ဓ|ႏ|ပ|ဖ|ဗ|မ|ဝ)ြ");
		replacement.add( "ႁ$1ြ");

		j=j+1;

		pattern.add("ျ(ခ|ဂ|င|စ|ဒ|ဓ|ႏ|ပ|ဖ|ဗ|မ|ဝ)ိြ");
		replacement.add( "ႃ$1ိြ");

		j=j+1;

		pattern.add("(ၾ|ႀ|ႂ|ႄ|ႄ)");
		replacement.add("ၾ");

		j=j+1;

		pattern.add("ၾ(က|ဆ|တ|ထ|သ)(ံ|ိ|ီ|ႋ|ႌ|ႍ|ႎ)ြ");
		replacement.add("ႄ$1$2ြ");

		j=j+1;

		pattern.add("ၾ(က|ဆ|တ|ထ|သ)(ံ|ိ|ီ|ႋ|ႌ|ႍ|ႎ)");
		replacement.add("ႀ$1$2");

		j=j+1;

		pattern.add("ၾ(က|ဆ|တ|ထ|သ)ြ");
		replacement.add("ႂ$1ြ");

		j=j+1;

		pattern.add("ာၤ");
		replacement.add( "ၤာ ");

		j=j+1;

		pattern.add("့(ု|ူ|ဳ|ဴ|ႈ|ွ)");
		replacement.add("$1႕");

		j=j+1;

		pattern.add("(ြ|ႊ|ု|ူ|ဳ|ဴ|ႈ|ွ|န)့");
		replacement.add("$1႕");

		j=j+1;

		pattern.add("ံ(|ြ|ႊ)့");
		replacement.add("ံ$1႕");

		j=j+1;

		pattern.add("(ြ|ႊ)(်|ၽ)");
		replacement.add("ၽ$1");

		j=j+1;

		pattern.add("ြ့");
		replacement.add("ြ႕");

		pattern.add("၀");
		replacement.add("ဝ");

		j=j+1;

		pattern.add("(၁|၂|၃|၄|၅|၆|၇|၈|၉)ဝ");
		replacement.add("$1၀");

		j=j+1;

		pattern.add("(ဲ)(ြ)");
		replacement.add("$2$1");

		j=j+1;

		pattern.add("ိ("+low_char+")");
		replacement.add("$1ိ");

		j=j+1;

		pattern.add("ံ("+low_char+")");
		replacement.add("$1ံ"); 

		j=j+1;

		pattern.add("(ံ|ိ|ီ|ႋ|ႌ|ႍ|ႎ|ဲ)+");
		replacement.add("$1");

		j=j+1;

		pattern.add("(ေ)+");
		replacement.add("$1");

		j=j+1;

		pattern.add("(ံ)+");
		replacement.add("$1");

		j=j+1;

		pattern.add(" ့");
		replacement.add("႕");

		j=j+1;

		pattern.add("ေ( )+");
		replacement.add("ေ");

		j=j+1;

		pattern.add("(့|႕)+");
		replacement.add("$1");

		j=j+1;

		pattern.add("(ု|ူ|ႈ|ွ)+");
		replacement.add("$1");

		j=j+1;

		pattern.add("ပိသာ");
		replacement.add("ပိႆာ");

		j=j+1;

		pattern.add("ဥ္");
		replacement.add("ဉ္");

		j=j+1;


		pattern.add("(က|တ|ထ|ဝ|ည)ံ႕");
		replacement.add( "$1ံ့");

		j=j+1;

		pattern.add("(က|တ|ဝ|ထ|ည)့ံ");
		replacement.add( "$1ံ့");

		j=j+1;

		pattern.add("ျပသနာ");
		replacement.add("ျပႆနာ");

		j=j+1;

		pattern.add("ဧ။္");
		replacement.add("၏");

		j=j+1;

		pattern.add("ၾသ");
		replacement.add("ဩ");

		j=j+1;

		pattern.add("စ်");
		replacement.add("ဈ");

		j=j+1;

		pattern.add("ါ");
		replacement.add("ာ");

		j=j+1;

		pattern.add("(ခ|ဂ|င|ဒ|ဝ|ပ)ာ");
		replacement.add("$1ါ");

		j=j+1;

		pattern.add("(ျ|ၿ|ႁ)(ခ|ဂ|င|ဒ|ဝ|ပ)ါ");
		replacement.add("$1$2ာ");

		j=j+1;

		pattern.add("(ခ|ဂ|င|ဒ|ဝ|ပ)("+low_char+")ာ");
		replacement.add("$1$2ါ");

		j=j+1;

		pattern.add("(ြ|ႊ)ဲ့");
		replacement.add("$1ဲ႕");

		j=j+1;

		pattern.add(""+ka_ah+"ံဳ");
		replacement.add("$1ံု");

		j=j+1;

		pattern.add(""+ka_ah+"ံဴ");
		replacement.add("$1ံူ");

		pattern.add("(ျ|ၿ|ႁ)"+ka_ah+"ံု");
		replacement.add("$1$2ံဳ");

		j=j+1;

		pattern.add("(ျ|ၿ|ႁ)"+ka_ah+"ံူ");
		replacement.add("$1$2ံဴ");

		j=j+1;

		//int k=j;


		if (syllable==true)
		{
		/////////////////////////////////////////////////////////////
		/////////////////////// Character Breaking ////////////////////
		////////////////////////////////////////////////////////////
		//$cb="|");//character break

		pattern.add("("+low_char+")()");
		replacement.add("$1"+cb); 

		j=j+1;

		pattern.add(""+ka_ah+"");
		replacement.add("$1"+cb);

		j=j+1;

		pattern.add(""+mypattern+"");
		replacement.add("$1"+cb);

		j=j+1;

		pattern.add("(\\"+cb+")+");
		replacement.add(cb);

		j=j+1;



		pattern.add("\\"+cb+"("+low_char+")");
		replacement.add("$1");

		j=j+1;

		pattern.add("\\"+cb+ka_ah2+"("+low_char+")");
		replacement.add("$1$2");

		j=j+1; 

		pattern.add("\\"+cb+"ေ"+ka_ah+"+("+low_char+")");
		replacement.add("ေ$1$2$3");

		j=j+1; 

		pattern.add("\\"+cb+mypattern+"");
		replacement.add("$1");

		j=j+1;

		pattern.add("\\"+cb+"(့|႕)");
		replacement.add("$1");

		j=j+1;

		pattern.add("\\"+cb+"("+ka_ah+"္)+");
		replacement.add("$2္");

		j=j+1;

		pattern.add("\\"+cb+""+ka_ah+mypattern+"္");
		replacement.add("$1$2္");

		j=j+1;

		/*pattern.add("\\ေ"+cb+ka_ah+"("+low_char+")");
		replacement.Add("$1$2");

		j=j+1;
		*/
		pattern.add(""+cb+"("+low_char+")");
		replacement.add("$1"); 

		}
		
		for(int x=0 ; x<= j;x++)
		{
			
			
			string = string.replaceAll(pattern.get(x), replacement.get(x));
		}
		
		string = string.replace(" ။", "။");
		string = string.substring(0, string.length()-1);
		
		return string;
	}
}
