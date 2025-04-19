package in.interview;

public class FindVowelCountAndConsonantCount {
	public static void main(String[] args) {
      String str="aeioubshbhs    *&^^%$$".toLowerCase();
      
      int vowelCount=0,consonantCount=0;
      for(char ch:str.toCharArray()) {
    	  if(Character.isLetter(ch)) {
    	  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
    		  vowelCount++;
    	  }
    	  else {
    		  consonantCount++;
    	  }
    	  }
      }
      System.out.println("VowelCount :"+vowelCount);
      System.out.println("ConsonantCount :"+consonantCount);
	}
}
