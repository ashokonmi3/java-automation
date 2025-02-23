package javaautomation_02_corejava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// ===========================
// Create a file

//public class O00020_Filehandling {
//	//
//	public static void main(String[] args) throws IOException {
//		try {
//			File myObj = new File("filename11.txt");
//			if (myObj.createNewFile()) {
//				// To create a file in Java, you can use the
//				// createNewFile() method. This method
//				// returns a boolean value: true if the file was successfully created, and
//				// false
//				// if the file already exists.
//				System.out.println("File created: " + myObj.getName());
//			} else {
//				System.out.println("File already exists.");
//			}
//		} catch (IOException e) {
//			System.out.println("An error occurred.");
//			e.printStackTrace();
//		}
//	}
//}
// ==================

// =================
// reading a file

//public class O00020_Filehandling {
//	public static void main(String[] args) {
//		try {
//			File myObj = new File("filename.txt");
//			Scanner myReader = new Scanner(myObj); // uttil
//			while (myReader.hasNextLine()) {
//				String data = myReader.nextLine();
//				System.out.println(data);
//			}
//			myReader.close();
//		} catch (FileNotFoundException e) {
//			System.out.println("An error occurred.");
//			e.printStackTrace();
//		}
//	}
//}
// ======================/
// Get file info

//public class O00020_Filehandling {
//	public static void main(String[] args) {
//		File myObj = new File("filename.txt");
//		if (myObj.exists()) {
//			System.out.println("File name: " + myObj.getName());
//			System.out.println("Absolute path: " + myObj.getAbsolutePath());
//			System.out.println("Writeable: " + myObj.canWrite());
//			System.out.println("Readable " + myObj.canRead());
//			System.out.println("File size in bytes " + myObj.length());
//		} else {
//			System.out.println("The file does not exist.");
//		}
//	}
//}

// ================
// Delete a file
//public class O00020_Filehandling {
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
// FileInputStream in Java is a class belonging to the java.io package, used for
// reading raw bytes from a file.
// It's primarily used to read binary data like images, audio files, or any
// other type of file where the data is not text-based.

// The read() method returns an integer representing the next byte of data. -1
// is returned when the end of the file is reached.
// We convert the integer data to its corresponding character representation
// assuming it's a text file ((char) data) and print it.

//public class O00020_Filehandling {
//	public static void main(String args[]) {
//		String currentDirectory = System.getProperty("user.dir");
//		System.out.println("Current directory " + currentDirectory);
//		String filepath = currentDirectory + "\\file.txt";
//		try {
//			FileInputStream fin = new FileInputStream(filepath);
//			int i = fin.read();// single character
//			System.out.println((char) i);
//			fin.close();
//			System.out.println(" success...");
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//	}
//}
// ====================
// Reading all characters
//public class O00020_Filehandling {
//	public static void main(String args[]) {
//		String currentDirectory = System.getProperty("user.dir");
//		System.out.println("Current directory " + currentDirectory);
//		String filepath = currentDirectory + "\\file.txt";
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
//public class O00020_Filehandling {
//
//	public static void main(String[] args) {
//		BufferedReader reader;
//
//		try {
//			reader = new BufferedReader(new FileReader("file.txt"));
//			String line = reader.readLine();
//
//			while (line != null) {
//				System.out.println(line);
//				// read next line
//				line = reader.readLine();
//			}
//
//			reader.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//
//}
// ================
// Reading all content of a file
//import java.nio.file.Files;
//import java.nio.file.Paths;
//
//public class O00020_Filehandling {
//	public static void main(String[] args) throws Exception {
//		String content = new String(Files.readAllBytes(Paths.get("file.txt")));
//		System.out.println(content);
//	}
//}
// ===============

// Writing to a file
//public class O00020_Filehandling {
//	public static void main(String[] args) {
//		try {
//			FileWriter myWriter = new FileWriter("filename1.txt");// create a file if
//			// file not exists and over write the content
//			myWriter.write("overwrite");
//			myWriter.close();
//			System.out.println("Successfully wrote to the file.");
//		} catch (IOException e) {
//			System.out.println("An error occurred.");
//			e.printStackTrace();
//		}
//	}
//}
// ====================
public class O00020_Filehandling {

	// Main driver method
	public static void main(String[] args) throws IOException {
		// Assigning the content of the file
		String text = "Welcome to ashoks class\nHappy Learning!";

		// Defining the file name of the file
		Path fileName = Path.of("D:\\Study\\JAVA_Automation\\file.txt");

		// Writing into the file
		Files.writeString(fileName, text); // create a new file

		// Reading the content of the file
		String file_content = Files.readString(fileName);

		// Printing the content inside the file
		System.out.println(file_content);
	}
}

// =================
// RandomAccessFile in Java provides the ability to read from and write to a
// file randomly.
// It allows both read and write operations at any position within the file.
// Unlike other file access classes in Java (FileInputStream, FileOutputStream),
// RandomAccessFile supports both input and output operations.

// public class O00020_Filehandling {
// public static void main(String args[]) throws IOException {
// String currentDirectory = System.getProperty("user.dir");
// System.out.println("Current directory " + currentDirectory);
// String filepath = currentDirectory + "\\file.txt";
// RandomAccessFile fin = new RandomAccessFile(filepath, "r");
// fin.seek(5);
// int s = fin.read();
// System.out.println((char) s);
//
// fin.close();
//
// }
// }
// =================
// appending at end of file
// public class O00020_Filehandling {
//
// public static void main(String[] args) {
//
// String path = System.getProperty("user.dir") + "\\file.txt";
// String text = "Added text";
// System.out.println(path);
//
// try {
// FileWriter fw = new FileWriter(path, true);
// fw.write(text);
// fw.close();
// System.out.println("done");
//
// } catch (IOException e) {
// }
// }
// }

// ========================
/*
 * excel file
 * 
 */
// public class O00020_Filehandling {
// public static void main(String[] args) throws Exception {
// // create file input stream object for the excel sheet
// XSSFWorkbook workbook;
// XSSFSheet sheet;
// XSSFCell cell;
// String currentDirectory = System.getProperty("user.dir");
// System.out.println("Current directory " + currentDirectory);
//
// FileInputStream fis = new FileInputStream(currentDirectory + "\\test.xlsx");
// // create object for work book
// workbook = new XSSFWorkbook(fis);
// // create object for sheet present in excel using Workbook object 'wb'
// sheet = workbook.getSheetAt(0);
// // create object for row present in sheet using Sheet object 'sheet'
// XSSFRow row = sheet.getRow(0);
// // create object for cell present in row using Row object 'row'
// XSSFCell cell1 = row.getCell(0);
// // print the value present in the excel sheet
// System.out.println(cell1.getStringCellValue());
// }
// }
// ====================================

// public class O00020_Filehandling {
// public static void main(String[] args) throws Exception {
// // create file input stream object for the excel sheet
// String currentDirectory = System.getProperty("user.dir");
//
// File file = new File(currentDirectory + "\\WriteExcel.xlsx"); // creating a
// // new file instance
// FileInputStream fis = new FileInputStream(file); // obtaining bytes from the
// // file
// // creating Workbook instance that refers to .xlsx file
// XSSFWorkbook wb = new XSSFWorkbook(fis);
// XSSFSheet sheet = wb.getSheetAt(0);
// Iterator<Row> itr = sheet.iterator(); // iterating over excel file
// while (itr.hasNext()) {
// Row row = itr.next();
// Iterator<Cell> cellIterator = row.cellIterator(); // iterating over each
// // column
// while (cellIterator.hasNext()) {
// Cell cell = cellIterator.next();
// switch (cell.getCellType()) {
// case STRING: // field that represents string cell type
// System.out.print(cell.getStringCellValue() + "\t\t\t\t");
// break;
// case NUMERIC: // field that represents number cell type
// System.out.print(cell.getNumericCellValue() + "\t\t\t");
// break;
// default:
// }
// }
// System.out.println("");
// }
// }
// }
// ==================================
// class Student {
//
// private String name;
// private String maths;
// private String science;
// private String english;
//
// public Student() {
// }
//
// public Student(String name, String maths, String science, String english) {
// this.name = name;
// this.maths = maths;
// this.science = science;
// this.english = english;
// }
//
// // getters and setter..
//
// @Override
// public String toString() {
// return name + ": Maths " + maths + " Science " + science + " English " +
// english;
// }
// }
//
// public class O00020_Filehandling {
// public static void main(String[] args) throws Exception {
// // create file input stream object for the excel sheet
// List studentList = new ArrayList();
// studentList.add(new Student("Magneto", "90", "100", "80"));
// studentList.add(new Student("Wolverine", "60", "60", "90"));
// studentList.add(new Student("ProfX", "100", "100", "100"));
//
// // String currentDirectory = System.getProperty("user.dir");
//
// // File file = new File(currentDirectory + "\\MyFirstExcel.xlsx"); //
// // creating a
// // new file instance
//
// Workbook workbook = new XSSFWorkbook();
//
// Sheet studentsSheet = workbook.createSheet("Students");
//
// int rowIndex = 0;
// for (Student student : studentList) {
// Row row = studentsSheet.createRow(rowIndex++);
// int cellIndex = 0;
// // first place in row is name
// row.createCell(cellIndex++).setCellValue(student.getName());
//
// // second place in row is marks in maths
// row.createCell(cellIndex++).setCellValue(student.getMaths());
//
// // third place in row is marks in Science
// row.createCell(cellIndex++).setCellValue(student.getScience());
//
// // fourth place in row is marks in English
// row.createCell(cellIndex++).setCellValue(student.getEnglish());
//
// }
//
// // write this workbook in excel file.
// try {
// FileOutputStream fos = new FileOutputStream(FILE_PATH);
// workbook.write(fos);
// fos.close();
//
// System.out.println(FILE_PATH + " is successfully written");
// } catch (FileNotFoundException e) {
// e.printStackTrace();
// } catch (IOException e) {
// e.printStackTrace();
// }
//
// }
// }

// ================================
// class O00020_Filehandling {
// public static void main(String[] args) {
// String txtFileName =
// "C:\\My\\users\\eclipse-workspace\\CoreJava\\src\\corejavapackage\\result.csv";
// try (Stream<String> stream = Files.lines(Paths.get(txtFileName))) {
//
// stream.forEach(System.out::println);
//
// } catch (IOException ioe) {
// ioe.printStackTrace();
// }
// //
// }
// }

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