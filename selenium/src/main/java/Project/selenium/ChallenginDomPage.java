package Project.selenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChallenginDomPage {

	WebDriver driver;

	public ChallenginDomPage(WebDriver driver) {
		this.driver = driver;
	}

	private By buttonBar = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]");
	private By buttonBaz = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]");
	private By buttonQux = By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[3]");
	private By table = By.tagName("table");

	public void clickButtonBar() {
		driver.findElement(buttonBar).click();
	}

	public void clickbuttonBaz() {
		driver.findElement(buttonBaz).click();
	}

	public void clickbuttonQux() {
		driver.findElement(buttonQux).click();
	}

	public void tableAction() {
		WebElement tableDom = driver.findElement(table);
		List<WebElement> edit = tableDom.findElements(By.linkText("edit"));
		List<WebElement> delete = tableDom.findElements(By.linkText("delete"));
		int posEdit = 0;
		int posDelete = 0;
		for (WebElement clickEdit : edit) {
			clickEdit.click();
			System.out.println("POS EDIT: " + posEdit);
			posEdit++;
		}
		for (WebElement clickdelete : delete) {
			clickdelete.click();
			System.out.println("POS DELETE: " + posDelete);
			posDelete++;
		}
	}
}
