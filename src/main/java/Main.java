/*import java.awt.Toolkit;
import java.awt.AWTException;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.DataFlavor;
import java.awt.image.BufferedImage;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.lang.Exception;
import java.util.Scanner;*/

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;


public class Main extends Application
{
	//static Scanner in = new Scanner(System.in);
	private String TITLE = "Data Transfer";

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Main.launch();

		/*Integer message;
		try {
			System.out.println("Please enter number of function");
			System.out.println("* 1 - String from Clipboard *");
			System.out.println("* 2 - Image PNG from Clipboard *");
			System.out.println("<1/2>: ");
			message = in.nextInt();
			System.out.println(message);

			if (message != 1 && message != 2) {
				throw new Exception("Wrong number!");
			}
			else {
				Clipboard clipboard = Toolkit
				.getDefaultToolkit()
				.getSystemClipboard();

				if (message == 1) {
					startTakeStringInfo(clipboard);
				}
				else {
					startTakeImage(clipboard);
				}
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			in.close();
		}*/
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		primaryStage.setHeight(640);
		primaryStage.setWidth(960);
		primaryStage.setTitle(TITLE);

		Label lbl = new Label("Hello World!");
		Scene scene = new Scene(lbl);

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/*
	private static void startTakeStringInfo(Clipboard clipboard) 
	{
		String result = "";
		try {
			result = (String) clipboard.getData(
				DataFlavor.stringFlavor
			);
			System.out.println("Your Text: " + result);
		} 
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private static void startTakeImage(Clipboard clipboard) 
	{
		try {
			System.out.println("Enter file name for image (without extension): ");
			String filename = in.nextLine();

			Transferable transferable = clipboard.getContents(null);

			if (transferable != null && 
				transferable.isDataFlavorSupported(DataFlavor.imageFlavor)) 
			{
				BufferedImage image = (BufferedImage) transferable
					.getTransferData(DataFlavor.imageFlavor);
		
				File file = new File(filename + ".png");
				ImageIO.write(image, "png", file);
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}*/
}