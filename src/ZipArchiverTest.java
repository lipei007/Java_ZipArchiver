import java.io.File;

import archiver.ZipArchiver;

public class ZipArchiverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      String pwd = "123456";

//      String src = "/Users/macmini1/Downloads/arc/AFS2018";
      
//      ZipArchiver.zipFile(src, null, pwd);
      
      
      String dir = "/Users/macmini1/Downloads/arc/un";
      String zip = "/Users/macmini1/Downloads/arc/AFS2018.zip";      
      ZipArchiver.unzipFile(new File(zip), dir, pwd);
            
//      String foo = "/Users/macmini1/Downloads/arc/AFS2018/ddd/test.zip";
//    String dir = "/Users/macmini1/Downloads/arc/AFS2018/ddd";

//      String f0 = src + File.separator + "ddd" + File.separator +"001.png";
//      String f1 = src + File.separator + "ddd" + File.separator +"002.png";
//      String f2 = src + File.separator + "ddd" + File.separator +"003.png";
//      String f3 = src + File.separator + "ddd" + File.separator +"004.png";
//      String f4 = src + File.separator + "ddd" + File.separator +"img";
//	
//      String[] srcs = new String[]{f0,f1,f2,f3,f4};
//      ZipArchiver.zipFiles(srcs, foo, null);
      
//      String zip = "/Users/macmini1/Downloads/arc/AFS2018/ddd/ddd/test.zip";
//      ZipArchiver.unzipFile(new File(zip), null, null);
      
	}

}
