import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.thoughtworks.selenium.Selenium
import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('https://www.katalon.com/')
def driver = DriverFactory.getWebDriver()
String baseUrl = "https://www.katalon.com/"
selenium = new WebDriverBackedSelenium(driver, baseUrl)
selenium.open("https://www.choucairtesting.com/")
selenium.click("link=Servicios")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Buscar:'])[1]/following::img[3]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Capacidades'])[1]/following::img[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='(+51) 984 270 574'])[1]/following::i[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Cómo lo hacemos'])[1]/following::img[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Portafolio de soluciones de testing centradas en su negocio'])[1]/following::div[15]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Portafolio de soluciones de testing centradas en su negocio'])[1]/following::img[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='(+51) 984 270 574'])[1]/following::i[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Cómo lo hacemos'])[1]/following::img[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Pruebas de Usabilidad'])[1]/following::div[10]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Pruebas de Usabilidad'])[1]/following::img[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='(+51) 984 270 574'])[1]/following::i[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Cómo lo hacemos'])[1]/following::img[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Alta automatización'])[1]/following::img[1]")
selenium.click("xpath=(.//*[normalize-space(text()) and normalize-space(.)='Cursos y Certificaciones'])[2]/following::span[2]")
selenium.click("link=exact:http://www.choucairtesting.com")
selenium.click("link=Servicios")
