package programs;

public class CountNoOfUniqueCharactersInAString {

		public static void main(String[] args) {
			String s="aabccdde"; 
			int c=0;
			char[] ch = s.toCharArray();
			boolean b[]=new boolean[s.length()];
			for(int i=0;i<ch.length;i++) {
				if(b[i]==false) {
					int count=1;
					for(int j=i+1;j<ch.length;j++) {
						if(ch[j]==ch[i]) {
							count++;
							b[j]=true;
						}
					}
					if(count==1) {
						c++;
						System.out.println(ch[i]+"  "+count);
					}
				}
			}
			//System.out.println(c);
		}

}
