import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://forum.katalon.com/categories/web-testing')

def xObj = CustomKeywords.'com.swre.tools.exexpath'('count(//div[@class=" category_parent_katalon-studio"])', 'NUMBER_TYPE')

println(xObj)

xObj = CustomKeywords.'com.swre.tools.exexpath'('count(//div[@class=" category_parent_katalon-studio"])>10', 'BOOLEAN_TYPE')

println(xObj)

xObj = CustomKeywords.'com.swre.tools.exexpath'('normalize-space(" The   xpath    executer! ")', 'STRING_TYPE')

println(xObj)

xObj = CustomKeywords.'com.swre.tools.exexpath'('normalize-space(" The   xpath    executer! ")', 'STRING_TYPO')

println(xObj)

WebUI.closeBrowser()

