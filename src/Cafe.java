import java.util.HashMap;
import java.util.Map;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Cafe extends Application {

    private final Map<String, Integer> orderList = new HashMap<>();

    @Override
    public void start(Stage primaryStage) {
        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.TOP_CENTER);
        vbox.setStyle("-fx-padding: 50;");
        Scene scene = new Scene(vbox, 900, 750);
        vbox.setStyle("-fx-background-color: #FFDBE9;");
        primaryStage.setTitle("Midnight's Cafe!");
        primaryStage.setScene(scene);

        //cafe title and subtitle
        Text text = new Text();
        text.setText("Welcome to Midnight's Cafe!");
        text.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 36px; -fx-font-weight: bold; -fx-fill: #341539;");
        
        Text text2 = new Text();
        text2.setText("We are so happy to have you here!");
        text2.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 22px; -fx-fill: #341539;");

        vbox.getChildren().add(text);
        vbox.getChildren().add(text2);

        //midnight picture
        String imagePath = "file:/C:\\Users\\pinkd\\OneDrive\\Desktop\\midnightowner.jpg";
        Image picture = new Image(imagePath, 300, 0, true, true);
        ImageView picViewer = new ImageView(picture);

        Text text4 = new Text();
        text4.setText("This is Midnight, the owner.");
        text4.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 20px; -fx-fill: #341539;");

        VBox vbox3 = new VBox(10);
        vbox3.setAlignment(Pos.CENTER);
        vbox3.getChildren().addAll(picViewer, text4);

        //marshall picture
        String imagePath2 = "file:/C:\\Users\\pinkd\\OneDrive\\Desktop\\marshallcashier1.jpg";
        Image picture2 = new Image(imagePath2, 300, 0, true, true);
        ImageView picViewer2 = new ImageView(picture2);

        Text text3 = new Text();
        text3.setText("This is Marshall, your cashier.");
        text3.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 20px; -fx-fill: #341539;");

        VBox vbox2 = new VBox(10);
        vbox2.setAlignment(Pos.CENTER);
        vbox2.getChildren().addAll(picViewer2, text3);

        //aligning pictures
        HBox hbox = new HBox(50);
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().addAll(vbox2, vbox3);

        vbox.getChildren().add(hbox);

        VBox vbox4 = new VBox();
        vbox4.setMinHeight(15);
        vbox.getChildren().add(vbox4);

        //order button
        Text text5 = new Text();
        text5.setText("Ready to order? Click the button below: ");
        text5.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 25px; -fx-font-weight: bold; -fx-fill: #341539;");
        vbox.getChildren().add(text5);

        Button button = new Button("Place Order");
        button.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 15px;");
        button.setOnAction(e -> openMenu());
        vbox.getChildren().add(button);
        
    
        primaryStage.show();
        
}

private void openMenu() {
    Stage menu = new Stage();
    VBox mainVBox = new VBox(10);
    mainVBox.setAlignment(Pos.TOP_CENTER);
    mainVBox.setStyle("-fx-padding: 10;");
    Scene scene2 = new Scene(mainVBox, 900, 750);
    mainVBox.setStyle("-fx-background-color: #B1F2FF;");
    menu.setTitle("Menu!");

    //Menu Title
    Text menuTitle = new Text();
    menuTitle.setText("Menu: ");
    menuTitle.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 25px; -fx-font-weight: bold; -fx-fill: #341539;");
    Text menuSubtitle = new Text();
    menuSubtitle.setText("Order whatever you would like!");
    menuSubtitle.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 18px; -fx-font-weight: bold; -fx-fill: #341539;");
    mainVBox.getChildren().add(menuTitle);
    mainVBox.getChildren().add(menuSubtitle);

    //Black Coffee
    String imagePath = "file:/C:\\Users\\pinkd\\OneDrive\\Desktop\\drinks\\hotblackcoffee.jpg";
    Image picture = new Image(imagePath, 200, 0, true, true);
    ImageView picViewer = new ImageView(picture);

    Text text4 = new Text();
    text4.setText("Hot Black Coffee | $2.00");
    text4.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 20px; -fx-fill: #341539;");

    Button button = new Button("Add to Order");
    button.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 15px;");
    button.setOnAction(e -> {orderList.put("Hot Black Coffee", orderList.getOrDefault("Hot Black Coffee", 0) + 1);});
    
    VBox bcVBox = new VBox(10);
    bcVBox.setAlignment(Pos.CENTER);
    bcVBox.getChildren().addAll(picViewer, text4, button);

    //Iced Matcha Latte
    String imagePath2 = "file:/C:\\Users\\pinkd\\OneDrive\\Desktop\\drinks\\matcha.jpg";
    Image picture2 = new Image(imagePath2, 200, 0, true, true);
    ImageView picViewer2 = new ImageView(picture2);

    Text text5 = new Text();
    text5.setText("Iced Matcha Latte | $6.50");
    text5.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 20px; -fx-fill: #341539;");

    Button button2 = new Button("Add to Order");
    button2.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 15px;");
    button2.setOnAction(e -> {orderList.put("Iced Matcha Latte", orderList.getOrDefault("Iced Matcha Latte", 0) + 1);});
    VBox imlVBox = new VBox(10);
    imlVBox.setAlignment(Pos.CENTER);
    imlVBox.getChildren().addAll(picViewer2, text5, button2);

    //Sweet Tea
    String imagePath3 = "file:/C:\\Users\\pinkd\\OneDrive\\Desktop\\drinks\\sweettea.jpg";
    Image picture3 = new Image(imagePath3, 200, 0, true, true);
    ImageView picViewer3 = new ImageView(picture3);
 
    Text text6 = new Text();
    text6.setText("Sweet Tea | $2.50");
    text6.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 20px; -fx-fill: #341539;");
 
    Button button3 = new Button("Add to Order");
    button3.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 15px;");
    button3.setOnAction(e -> {orderList.put("Sweet Tea", orderList.getOrDefault("Sweet Tea", 0) + 1);});
 
    VBox stVBox = new VBox(10);
    stVBox.setAlignment(Pos.CENTER);
    stVBox.getChildren().addAll(picViewer3, text6, button3);

    HBox hbox = new HBox(50);
    hbox.setAlignment(Pos.TOP_CENTER);
    hbox.getChildren().addAll(bcVBox, imlVBox, stVBox);

    mainVBox.getChildren().add(hbox);

    //Espresso Shot
    String imagePath4 = "file:/C:\\Users\\pinkd\\OneDrive\\Desktop\\drinks\\espresso.png";
    Image picture4 = new Image(imagePath4, 200, 0, true, true);
    ImageView picViewer4 = new ImageView(picture4);

    Text text7 = new Text();
    text7.setText("Espresso Shot | $3.00");
    text7.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 20px; -fx-fill: #341539;");

    Button button4 = new Button("Add to Order");
    button4.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 15px;");
    button4.setOnAction(e -> {orderList.put("Espresso Shot", orderList.getOrDefault("Espresso Shot", 0) + 1);});
    VBox eVBox = new VBox(10);
    eVBox.setAlignment(Pos.CENTER);
    eVBox.getChildren().addAll(picViewer4, text7, button4);

    //Vanilla Latte
    String imagePath5 = "file:/C:\\Users\\pinkd\\OneDrive\\Desktop\\drinks\\vanillalatte.jpg";
    Image picture5 = new Image(imagePath5, 200, 0, true, true);
    ImageView picViewer5 = new ImageView(picture5);

    Text text8 = new Text();
    text8.setText("Vanilla Latte | $4.00");
    text8.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 20px; -fx-fill: #341539;");

    Button button5 = new Button("Add to Order");
    button5.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 15px;");
    button5.setOnAction(e -> {orderList.put("Vanilla Latte", orderList.getOrDefault("Vanilla Latte", 0) + 1);});
    VBox vlVBox = new VBox(10);
    vlVBox.setAlignment(Pos.CENTER);
    vlVBox.getChildren().addAll(picViewer5, text8, button5);

    //Americano
    String imagePath6 = "file:/C:\\Users\\pinkd\\OneDrive\\Desktop\\drinks\\americano.jpg";
    Image picture6 = new Image(imagePath6, 200, 0, true, true);
    ImageView picViewer6 = new ImageView(picture6);

    Text text9 = new Text();
    text9.setText("Americano | $3.50");
    text9.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 20px; -fx-fill: #341539;");

    Button button6 = new Button("Add to Order");
    button6.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 15px;");
    button6.setOnAction(e -> {orderList.put("Americano", orderList.getOrDefault("Americano", 0) + 1);});

    VBox aVBox = new VBox(10);
    aVBox.setAlignment(Pos.CENTER);
    aVBox.getChildren().addAll(picViewer6, text9, button6);

    //aligning the pictures
    HBox hbox2 = new HBox(50);
    hbox2.setAlignment(Pos.BOTTOM_CENTER);
    hbox2.getChildren().addAll(eVBox, vlVBox, aVBox);

    mainVBox.getChildren().add(hbox2);

    //adding space
    Region space = new Region();
    space.setMinHeight(30);
    mainVBox.getChildren().add(space);

    //adding the print receipt option
    Text text10 = new Text();
    text10.setText("Done ordering? Print your receipt: ");
    text10.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 20px; -fx-font-weight: bold; -fx-fill: #341539;");
    mainVBox.getChildren().add(text10);

    Button button7 = new Button("Print Receipt");
    button7.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 15px;");
    button7.setOnAction(e -> printReceipt());
    mainVBox.getChildren().add(button7);

    //Reset Order
    Region space2 = new Region();
    space.setMinHeight(20);
    mainVBox.getChildren().add(space2);

    Text text11 = new Text();
    text11.setText("Made a mistake or changed your mind?");
    text11.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 12px; -fx-fill: #341539;");

    Button button8 = new Button("Reset Order");
    button8.setStyle("-fx-font-family: 'Noto Sans'; -fx-font-size: 10px;");
    button8.setOnAction(e -> {orderList.clear();});
    mainVBox.getChildren().add(button8);

    HBox resetHBox = new HBox(10);
    resetHBox.setAlignment(Pos.BOTTOM_LEFT);
    resetHBox.getChildren().addAll(text11, button8);


    mainVBox.getChildren().add(resetHBox);

    menu.setScene(scene2);
    menu.show();
    
}

private void printReceipt() {
    Stage receipt = new Stage();
    VBox mainVBox = new VBox(10);
    mainVBox.setAlignment(Pos.TOP_CENTER);
    mainVBox.setStyle("-fx-padding: 10;");
    Scene scene2 = new Scene(mainVBox, 900, 750);
    receipt.setTitle("Receipt!");

    VBox titleBox = new VBox(5);
    titleBox.setAlignment(Pos.CENTER);

    //Receipt Title
    Text receiptTitle = new Text();
    receiptTitle.setText("Receipt: ");
    receiptTitle.setStyle("-fx-font-family: 'Times New Roman'; -fx-font-size: 25px; -fx-font-weight: bold; -fx-fill: #000000;");

    Text receiptLine = new Text();
    receiptLine.setText("-----------------------------------------------");
    receiptLine.setStyle("-fx-font-family: 'Times New Roman'; -fx-font-size: 18px; -fx-font-weight: bold; -fx-fill: #000000;");
    
    titleBox.getChildren().addAll(receiptTitle, receiptLine);
    mainVBox.getChildren().add(titleBox);

    VBox receiptBox = new VBox(10);
    receiptBox.setAlignment(Pos.TOP_CENTER);
    mainVBox.getChildren().add(receiptBox);


    //getting the total amount and quantity
    //printing the order with the name, quantity, and price
    double totalAmount = 0;

    for(Map.Entry<String, Integer> entry : orderList.entrySet()) {
        String itemName = entry.getKey();
        int quantity = entry.getValue();
        double price = getItemPrice(itemName);
        double itemTotal = price * quantity;
        
        Text itemText = new Text(itemName + " x" + quantity + " = $" + String.format("%.2f", itemTotal));
        itemText.setStyle("-fx-font-family: 'Times New Roman'; -fx-font-size: 20px; -fx-fill: #000000;");
        receiptBox.getChildren().add(itemText);

        totalAmount += itemTotal;

    }

    //adding the text on the receipt
    Text totalText = new Text("Total: $" + String.format("%.2f", totalAmount));
    totalText.setStyle("-fx-font-family: 'Times New Roman'; -fx-font-size: 25px; -fx-font-weight: bold; -fx-fill: #000000;");
    mainVBox.getChildren().add(totalText);

    Text extraText3 = new Text("-----------------------------------------------");
    Text extraText4 = new Text("Your Reward Level: " + getrewardLevel(totalAmount));
    Text extraText = new Text("Cashier: Marshall #202");
    Text extraText2 = new Text("Thank you so much for visiting!");
    Text extraText5 = new Text("Est. 2025");

    extraText.setStyle("-fx-font-family: 'Times New Roman'; -fx-font-size: 20px; -fx-fill: #000000;");
    extraText2.setStyle("-fx-font-family: 'Times New Roman'; -fx-font-size: 20px; -fx-fill: #000000;");
    extraText3.setStyle("-fx-font-family: 'Times New Roman'; -fx-font-size: 18px; -fx-font-weight: bold; -fx-fill: #000000;");
    extraText4.setStyle("-fx-font-family: 'Times New Roman'; -fx-font-size: 20px; -fx-fill: #000000;");
    extraText5.setStyle("-fx-font-family: 'Times New Roman'; -fx-font-size: 20px; -fx-fill: #000000;");
    mainVBox.getChildren().addAll(extraText3, extraText4, extraText, extraText2, extraText5);

    String imagePath = "file:/C:/Users/pinkd/OneDrive/Desktop/CSI2300 Project/qrcodefinal.png";
    Image picture = new Image(imagePath, 150, 0, true, true);
    ImageView picViewer = new ImageView(picture);

    mainVBox.getChildren().add(picViewer);

    receipt.setScene(scene2);
    receipt.show();
}

//calculating the rank
private String getrewardLevel(double totalAmount) {
    String rank;
    if (totalAmount >= 10) {
        rank = "Gold";
    } else if (totalAmount < 10 && totalAmount >= 6) {
        rank = "Silver";
    } else if (totalAmount < 6 && totalAmount > 0) {
        rank = "Bronze";
    } else {
        rank = "None";
    }
    return rank;
    }
    
    
//getting the price for each item
private double getItemPrice(String itemName) {
    switch (itemName) {
        case "Hot Black Coffee":
            return 2.00;
        case "Iced Matcha Latte":
            return 6.50;
        case "Sweet Tea":
            return 2.50;
        case "Espresso Shot":
            return 3.00;
        case "Vanilla Latte":
            return 4.00;
        case "Americano":
            return 3.50;
        default:
            return 0.00;
    }
}
}
