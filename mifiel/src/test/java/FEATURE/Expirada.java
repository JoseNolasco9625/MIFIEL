package FEATURE;

import CONFIG.Config_acc;
import ELEMENTS.MIFIEL2firma;
import UTILS.SeleniumUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Expirada extends BaseTest
{
    SeleniumUtils utils = new SeleniumUtils();
    Config_acc configAcc = new Config_acc();
    MIFIEL2firma e_Firma = new MIFIEL2firma();

    @Test
    public void FirmaExpirada () throws InterruptedException {
        utils.Click(e_Firma.BottonFirma(driver));
        utils.addfile(e_Firma.Uploadfile_cer(driver), configAcc.cerExpirada);
        utils.addfile(e_Firma.Uploadfile_key(driver),configAcc.keyExpirada);
        utils.Input(e_Firma.Contraseña(driver), configAcc.Pwd);
        utils.Click(e_Firma.FirmarDocumento(driver));
        Thread.sleep(500);
        Assert.assertTrue(e_Firma.MensajeExpirado(driver).isDisplayed());

    }

}
