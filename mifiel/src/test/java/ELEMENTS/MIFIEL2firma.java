package ELEMENTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MIFIEL2firma
{
    // Boton 2. Firma para proceder a la carga de los archivos para firma
    public By byBottonFirma = By.xpath("//div[@class='sf_StandardSidebarTabsOnDesktop-buttonFake mi_u-inlineBlock']/button");
    public WebElement BottonFirma(WebDriver driver)
    {
        WebElement bottonFirma = driver.findElement(byBottonFirma);
        return bottonFirma;
    }

    // Subir archivo cer
    public By byUploadfile_cer = By.xpath("//input[@accept='application/x-x509-ca-cert']");
    public WebElement Uploadfile_cer (WebDriver driver)
    {
        WebElement uploadfile_cer = driver.findElement(byUploadfile_cer);
        return uploadfile_cer;
    }

    // Subir archivo .key
    public By byUploadfile_key = By.xpath("//input[@accept='.key']");
    public WebElement Uploadfile_key (WebDriver driver)
    {
        WebElement uploadfile_key = driver.findElement(byUploadfile_key);
        return uploadfile_key;
    }

    //Ingresar contraseña
    public By byContraseña = By.xpath("//div/mi-form-control/mi-form-control-box/div/input");
    public WebElement Contraseña (WebDriver driver)
    {
        WebElement contraseña = driver.findElement(byContraseña);
        return contraseña;
    }

    //Boton FIRMAR DOCUMENTO
    public By byFirmarDocumento = By.xpath("//button[@type='submit']/mi-translate[@innerhtml='Firmar documento']");
    public WebElement FirmarDocumento (WebDriver driver)
    {
        WebElement firmarDocumento = driver.findElement(byFirmarDocumento);
        return firmarDocumento;
    }

    //Validacion Mensaje expirada
    public By byMensajeExpirado = By.xpath("//div[contains(text(), 'Esta e.firma expiró. Por favor utiliza los archivos de una e.firma vigente')]");
    public WebElement MensajeExpirado (WebDriver driver)
    {
        WebElement mensajeExpirado = driver.findElement(byMensajeExpirado);
        return mensajeExpirado;
    }

    //Validacion Mensaje revocada
    public By byMensajeRevocado = By.xpath("//div[contains(text(), 'Esta e.firma está revocada')]");
    public WebElement MensajeRevocado (WebDriver driver)
    {
        WebElement Revocado = driver.findElement(byMensajeRevocado);
        return Revocado;
    }

}
