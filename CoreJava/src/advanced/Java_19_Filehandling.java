package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

// ===========================
//public class Java_19_Filehandling {
//
//	public static void main(String[] args) throws IOException {
//
//		String currentDirectory = System.getProperty("user.dir");
//		System.out.println("Current directory " + currentDirectory);
//		File fileObject = new File(currentDirectory + "\\file.txt");
//		fileObject.createNewFile();
//	}
//}
//======================
//public class Java_19_Filehandling {
//
//	public static void main(String[] args) throws IOException {
//
//		String currentDirectory = System.getProperty("user.dir");
//		System.out.println("Current directory " + currentDirectory);
//		File fileObject = new File(currentDirectory + "\\file.txt");
//		fileObject.delete();// Delete a Text File
//	}
//}

// ======================================
// Reading single character
//public class Java_19_Filehandling {
//	public static void main(String args[]) {
//		String currentDirectory = System.getProperty("user.dir");
//		System.out.println("Current directory " + currentDirectory);
//		String filepath = currentDirectory + "\\out.txt";
//		try {
//			FileInputStream fin = new FileInputStream(filepath);
//			int i = fin.read();// single character
//			System.out.print((char) i);
//			fin.close();
//			System.out.println(" success...");
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
//}
// ====================
// Reading all characters
//public class Java_19_Filehandling {
//	public static void main(String args[]) {
//		String currentDirectory = System.getProperty("user.dir");
//		System.out.println("Current directory " + currentDirectory);
//		String filepath = currentDirectory + "\\out.txt";
//		try {
//			FileInputStream fin = new FileInputStream(filepath);
//			int i = 0;
//			while ((i = fin.read()) != -1) {
//				System.out.print((char) i);
//			}
//			fin.close();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
//}
// =======================

//public class Java_19_Filehandling {
//	public static void main(String args[]) throws IOException {
//		String currentDirectory = System.getProperty("user.dir");
//		System.out.println("Current directory " + currentDirectory);
//		String filepath = currentDirectory + "\\out.txt";
//		RandomAccessFile fin = new RandomAccessFile(filepath, "r");
//		fin.seek(5);
//		int s = fin.read();
//		System.out.println((char) s);
//
//		fin.close();
//
//	}
//}

// ================================
class O00020_Filehandling {
	public static void main(String[] args) {
		String txtFileName = "C:\\My\\users\\eclipse-workspace\\CoreJava\\src\\corejavapackage\\result.csv";
		try (Stream<String> stream = Files.lines(Paths.get(txtFileName))) {

			stream.forEach(System.out::println);

		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		//
	}
}

// ========================

// public class O00020_Filehandling {
//
// public static void main(String[] args) {
//
// String txtFileName = "C:/My/P/Study/CoreJava/C2ImportCalEventSample.csv";
// List<String> list = new ArrayList<>();
//
// // reading csv file into stream, try-with-resources
// try (Stream<String> stream = Files.lines(Paths.get(txtFileName))) {
//
// // 1 filtered flight numbers BA-731 and VA-421
// // 2. then only map filtered result to there airport names only
// // 3. store result into a List
// list = stream.filter(line -> line.contains("814-555-5179")).map(line -> {
// String[] str = line.split(",");
// return str[2];
// }).collect(Collectors.toList());
//
// // 4. print result list
// list.forEach(System.out::println);
//
// } catch (IOException ioe) {
// ioe.printStackTrace();
// }
//
// }
//
// }

// =================

// public class O00020_Filehandling {
//
// public static void main(String[] args) {
// PDDocument pd;
// BufferedWriter wr;
// try {
// String currentDirectory = System.getProperty("user.dir");
// System.out.println("Current directory " + currentDirectory);
// //
// File input = new File(currentDirectory + "//Sample_CV.pdf"); // The
// // PDF file from where you would
// // like to extract
// File output = new File(currentDirectory + "//SampleText.txt"); // The
// // text file where you are going
// // to store the extracted
// // data
// pd = PDDocument.load(input);
// System.out.println(pd.getNumberOfPages());
// // pd.pipe("1234");
// System.out.println(pd.isEncrypted());
// pd.save("CopyOfSample_CV.pdf"); // Creates a copy called "CopyOfInvoice.pdf"
// PDFTextStripper stripper = new PDFTextStripper();
// wr = new BufferedWriter(new OutputStreamWriter(new
// FileOutputStream(output)));
// stripper.writeText(pd, wr);
// if (pd != null) {
// pd.close();
// }
// // I use close() to flush the stream.
// wr.close();
// } catch (Exception e) {
// e.printStackTrace();
// }
// }
// }
// ========================
// public class O00020_Filehandling {
// public static void main(String args[]) throws IOException {
// String currentDirectory = System.getProperty("user.dir");
// System.out.println("Current directory " + currentDirectory);
// String path = (currentDirectory + "\\resources\\");
// System.out.println("Image path directory " + path);
// File file = new File(path + "\\Input.jpg");
//
// BufferedImage image = null;
//
// try {
// image = ImageIO.read(file);
//
// ImageIO.write(image, "jpg", new File(path + "\\output.jpg"));
//
// ImageIO.write(image, "png", new File(path + "\\output.png"));
//
// ImageIO.write(image, "gif", new File(path + "\\output.gif"));
//
// ImageIO.write(image, "bmp", new File(path + "\\output.bmp"));
// } catch (IOException e) {
// e.printStackTrace();
// }
//
// System.out.println("done");
//
// }// main() ends here
// }// class ends here

// ============================
// public class O00020_Filehandling {
// public static void main(String args[]) throws IOException {
// String currentDirectory = System.getProperty("user.dir");
// System.out.println("Current directory " + currentDirectory);
// String path = (currentDirectory + "\\resources\\");
// System.out.println("Image path directory " + path);
// File fileA = new File(path + "\\Input.jpg");
// File fileB = new File(path + "\\Input1.jpg");
//
// float percentage = 0;
// try {
// // take buffer data from both image files //
// BufferedImage biA = ImageIO.read(fileA);
// DataBuffer dbA = biA.getData().getDataBuffer();
// int sizeA = dbA.getSize();
// BufferedImage biB = ImageIO.read(fileB);
// DataBuffer dbB = biB.getData().getDataBuffer();
// int sizeB = dbB.getSize();
// int count = 0;
// // compare data-buffer objects //
// if (sizeA == sizeB) {
//
// for (int i = 0; i < sizeA; i++) {
//
// if (dbA.getElem(i) == dbB.getElem(i)) {
// count = count + 1;
// }
//
// }
// percentage = (count * 100) / sizeA;
// System.out.println("Percentage match : " + percentage);
//
// } else {
// System.out.println("Both the images are not of same size");
// }
//
// } catch (Exception e) {
// System.out.println("Failed to compare image files ...");
// }
// }// main() ends here
// }// class ends here
// ===================

// public class O00020_Filehandling {
// // PDF to be read
// public static final String READ_PDF = "F://knpcode//result//OpenPDF//PP.pdf";
// final static String OWNER_PASSWORD = "owner";
//
// public static void main(String[] args) {
// PdfReader pdfreader = null;
// try {
// pdfreader = new PdfReader(READ_PDF, OWNER_PASSWORD.getBytes());
// // get pages in PDF
// int pages = pdfreader.getNumberOfPages();
// PdfTextExtractor pdfTextExtractor = new PdfTextExtractor(pdfreader);
// // Iterate through pages to read content
// for (int i = 1; i <= pages; i++) {
// // Extract content of each page
// String contentOfPage = pdfTextExtractor.getTextFromPage(i, true);
// System.out.println(contentOfPage);
// }
//
// } catch (IOException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// } finally {
// if (pdfreader != null) {
// pdfreader.close();
// }
// }
// }
// }