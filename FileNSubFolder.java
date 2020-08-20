import java.io.File;

public class FileNSubFolder {
	
	public static void main(String[] args) {
		File path=new File("D:\\Anu\\Project");
		
		if(path.exists()&&path.isDirectory()) {
			File arr[]=path.listFiles();
			
			System.out.println("directorty "+path.getName());
			listfile(arr,0);
		}
		
		
		
	}

	private static void listfile(File[] arr, int i) {
		// TODO Auto-generated method stub
		if(i==arr.length) {
			return;
		}
		if(arr[i].isFile())
			{System.out.println("File"+arr[i].getName());
			
			}
		else if(arr[i].isDirectory()) {
			System.out.println("Directory"+arr[i].getName());
			listfile(arr[i].listFiles(),0);
		}
		listfile(arr,++i);
	}
}
