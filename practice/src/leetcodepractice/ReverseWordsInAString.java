package leetcodepractice;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "the sky is blue";
		s.trim();
	    String[] words=s.split("\\s+");
	    int left = 0, right = words.length - 1;
        while (left < right) {
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;
            left++;
            right--;
        }
        
        String result = String.join(" ", words);
	    
	   System.out.println(result);

	}

}
