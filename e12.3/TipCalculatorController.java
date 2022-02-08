// Controller that handles calculateButton and tipPercentageSlider events
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;


public class TipCalculatorController { 
// formatters for currency and percentages
private static final NumberFormat currency = NumberFormat.getCurrencyInstance();

private static final NumberFormat percent =NumberFormat.getPercentInstance();

private static final BigDecimal HUNDRED = BigDecimal.valueOf(100);

private BigDecimal tipPercentage = new BigDecimal(0.15); // 15% default

@FXML
private TextField amountTextField;
@FXML
private Label tipPercentageLabel;
@FXML
private Slider tipPercentageSlider;
@FXML
private TextField tipTextField;
@FXML
private TextField totalTextField;

private void update() 
{
BigDecimal amount;

try {
	
amount = new BigDecimal(amountTextField.getText());

} catch (NumberFormatException ex) 

{
	
tipTextField.setText("Invalid Input");
totalTextField.setText("Invalid Input");
return;

}

BigDecimal tipFactor = BigDecimal.valueOf(tipPercentageSlider.getValue()).divide(HUNDRED, 2, RoundingMode.HALF_UP);
BigDecimal tip = amount.multiply(tipFactor);
BigDecimal total = amount.add(tip);
tipTextField.setText(currency.format(tip));
totalTextField.setText(currency.format(total));

}
@FXML
private void initialize() 
{
tipPercentageLabel.textProperty().bind(tipPercentageSlider.valueProperty().asString("%.0f %%"));
currency.setRoundingMode(RoundingMode.HALF_UP);
tipPercentageSlider.valueProperty().addListener(o -> update());
amountTextField.textProperty().addListener(o -> update());
}


}