package FEATURE;

import CONFIG.Config_acc;
import ELEMENTS.MIFIEL2firma;
import UTILS.SeleniumUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Revocada extends BaseTest
{
    SeleniumUtils utils = new SeleniumUtils();
    Config_acc configAcc = new Config_acc();
    MIFIEL2firma e_Firma = new MIFIEL2firma();

    @Test
    public void FirmaRevocada () throws InterruptedException {
        utils.Click(e_Firma.BottonFirma(driver));
        utils.addfile(e_Firma.Uploadfile_cer(driver), configAcc.cerRevocada);
        utils.addfile(e_Firma.Uploadfile_key(driver),configAcc.keyRevocada);
        utils.Input(e_Firma.Contraseña(driver), configAcc.Pwd);
        utils.Click(e_Firma.FirmarDocumento(driver));
        Thread.sleep(500);
        Assert.assertTrue(e_Firma.MensajeRevocado(driver).isDisplayed());
    }
}
