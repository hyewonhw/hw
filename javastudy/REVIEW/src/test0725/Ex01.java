package test0725;

public class Ex01 {

	public static void main(String[] args) {
		
		// 연습 01 
		// 파일이름을 파일명과 확장자로 분리하시오
		// 단, jpg, git, png 이미지인 경우에만 작업을 진행한다.
		
		String fullname = "apple.jpg";
		String filename = "";
		String extname = "";
		
		int dot = fullname.lastIndexOf(".");
		filename = fullname.substring(0, dot);
		extname = fullname.substring(dot + 1);
		System.out.println(filename);
		System.out.println(extname);
		
		
	}

}
