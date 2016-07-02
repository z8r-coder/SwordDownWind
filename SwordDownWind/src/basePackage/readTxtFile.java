package basePackage;
import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

import javax.sound.sampled.AudioFormat.Encoding;
import javax.swing.JOptionPane;

public class readTxtFile {
	private static int[][] matrix;
	public static int[][] readFile(String filepath) {
		String encoding = "GBK";
		matrix = new int[LenthAll.COUNT_ROW][LenthAll.COUNT_COL];
		File file = new File(filepath);
		if(file.isFile() && file.exists()){
			try {
				InputStreamReader reader = new InputStreamReader(new FileInputStream(file),
						encoding);
				BufferedReader bufferedReader = new BufferedReader(reader);
				String lineTxt = null;
				try {
					int j = 0;
					while((lineTxt = bufferedReader.readLine()) != null && j < LenthAll.COUNT_ROW){
						//System.out.println(lineTxt.charAt(0));
						int i = 0;
						for(i = 0;i < lineTxt.length();i++){
							matrix[j][i] = lineTxt.charAt(i) - '0';
						}
						j++;
					}
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "程序出现编码错误。被迫中止", "错误", JOptionPane.ERROR_MESSAGE, null);
				System.exit(0);
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "出现错误，程序被迫中止","错误",JOptionPane.ERROR_MESSAGE,null);
				e.printStackTrace();
			}
		}
		else
			System.out.println("找不到指定文件");
		return matrix;
	}
}
