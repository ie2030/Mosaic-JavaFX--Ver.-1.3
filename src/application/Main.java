package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;



public class Main extends Application {
	
	public void start(Stage primaryStage) {
	
		BorderPane leftPanel = new BorderPane();
		Label x;
		
		leftPanel.setTop(x = new Label());
		x.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(4),new Insets(1))));
		x.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		x.setPrefSize(50,50);
		x.setAlignment(Pos.CENTER);
		
		leftPanel.setRight(x = new Label());
		x.setBackground(new Background(new BackgroundFill(Color.BLUE, new CornerRadii(4),new Insets(1))));
		x.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		x.setPrefSize(50,50);
		x.setAlignment(Pos.CENTER);
		
		leftPanel.setLeft(x = new Label());
		x.setBackground(new Background(new BackgroundFill(Color.PINK, new CornerRadii(4),new Insets(1))));
		x.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		x.setPrefSize(50,50);
		x.setAlignment(Pos.CENTER);
		
		leftPanel.setBottom(x = new Label());
		x.setBackground(new Background(new BackgroundFill(Color.GRAY, new CornerRadii(4),new Insets(1))));
		x.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		x.setPrefSize(50,50);
		x.setAlignment(Pos.CENTER);
		
		leftPanel.setCenter(x = new Label());
		x.setBackground(new Background(new BackgroundFill(Color.BLACK, new CornerRadii(4),new Insets(1))));
		x.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		x.setPrefSize(50,250);
		x.setAlignment(Pos.CENTER);
		
		//----------------------------------------------------------------------------------------------------
		GridPane centerPane = new GridPane();
		
		FlowPane cp1;
		GridPane cp2;
		
		
		GridPane root1 = new GridPane();
		
		Button l;
		
		
			int rows = 2;
		    int columns = 2;
		    int rectangleWidth = 50;
		    int rectangleHeight = 50;

		    root1.setMaxSize(rectangleWidth*columns, rectangleHeight*rows);

		    for(int row = 0; row < rows; row++)
		    {
		        for(int col= 0; col< columns; col++)
		        {
		            Rectangle rectangle = new Rectangle(rectangleWidth, rectangleHeight);
		            root1.add(rectangle, col, row);

		            if(row % 2 == 0)
		            {
		                rectangle.setFill(col % 2 == 0 ? Color.ORANGE : Color.BLACK);
		            }
		            else
		            {
		                rectangle.setFill(col % 2 != 0 ? Color.ORANGE : Color.BLACK);
		            }
		        }
		    }
		root1.setAlignment(Pos.CENTER);
		
		
		centerPane.add(cp1 = new FlowPane(), 0,0);
	    cp1.setBackground(new Background(new BackgroundFill(Color.BISQUE  , new CornerRadii(4),new Insets(1))));
		cp1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		cp1.setPrefSize(700, 500);		
		
		
		cp1.getChildren().add(root1);
		cp1.setAlignment(Pos.CENTER);
		
		
		centerPane.add(cp2 = new GridPane(), 0, 1);
		for (int i=0; i<64; i++) {
			cp2.add(l = new Button("  "), i/8, i%8);
			l.setPrefSize(90, 70);
			if ( (i/8 + i%8)%2 == 0) l.setBackground(new Background(new BackgroundFill(Color.BLACK   , new CornerRadii(4),new Insets(1))));
			else l.setBackground(new Background(new BackgroundFill(Color.WHITE , new CornerRadii(4),new Insets(1))));
		}
		cp2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);		
		cp2.setPrefSize(700, 500);
	
	
		//-----------------------------------------------------------------
		
		GridPane rigthPane = new GridPane();
	
		FlowPane fp1; 
		FlowPane fp2; 
		FlowPane fp3;
		
		rigthPane.add(fp1 = new FlowPane (), 3,0);
		rigthPane.add(fp2 = new FlowPane (), 3,1);
		rigthPane.add(fp3 = new FlowPane(), 3,2);
		
		fp1.setBackground(new Background(new BackgroundFill(Color.DARKGRAY   , new CornerRadii(4),new Insets(1))));
		fp1.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		fp1.setPrefSize(700,500);
		
		fp2.setBackground(new Background(new BackgroundFill(Color.DARKGREEN    , new CornerRadii(4),new Insets(1))));
		fp2.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		fp2.setPrefSize(700,500);;
		
		fp3.setBackground(new Background(new BackgroundFill(Color.DARKKHAKI   , new CornerRadii(4),new Insets(1))));
		fp3.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		fp3.setPrefSize(700,500);
		
		Rectangle rec1 = new Rectangle(35,25);
		Rectangle rec2 = new Rectangle(35,25);
		Rectangle rec3 = new Rectangle(35,25);
		
		rec1.setFill(Color.RED);
		rec2.setFill(Color.YELLOW);
		rec3.setFill(Color.GREEN);
		
		
		fp3.setAlignment(Pos.CENTER);
		fp3.setHgap(5);
		fp3.setPadding(new Insets(25, 25, 200, 25));
		fp3.getChildren().addAll(rec1, rec2, rec3);
		
		
		    BorderPane root = new BorderPane();
			Scene scene = new Scene(root);
			root.setPrefSize(500,500);
			primaryStage.setTitle("Mosaic FX");
			primaryStage.setScene(scene);
			primaryStage.show();
	
			root.setLeft(leftPanel);
			root.setCenter(centerPane);
			root.setRight(rigthPane);
		  
	}
	
	

	public static void main(String[] args) {
		launch(args);
	}

	
}

