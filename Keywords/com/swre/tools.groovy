package com.swre
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.WebDriver as WDriver

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.driver.DriverFactory


class tools {
	/**
	 * Execute/evaluate xpath
	 * @param String or testObject
	 * @param RESULT_TYPE: [NUMBER_TYPE|STRING_TYPE|BOOLEAN_TYPE]
	 * @return result from xpath
	 */
	@Keyword
	def exexpath(String xpth, String RESULT_TYPE) {
		def resultTypes = ['NUMBER_TYPE': 'numberValue','STRING_TYPE': 'stringValue', 'BOOLEAN_TYPE': 'booleanValue']
		WDriver wd = DriverFactory.getWebDriver()
		try{
			String execCmd = 'return (document.evaluate(\''+xpth+'\', document, null, XPathResult.ANY_TYPE, null)).'+resultTypes[RESULT_TYPE]+';'
			return ((JavascriptExecutor) wd).executeScript(execCmd,[xpth])
		} catch (Exception e){
			println e
			return null
		}
	}
	def exexpath(TestObject to, String RESULT_TYPE) {
		try{
			exexpath(to.findPropertyValue("xpath"), RESULT_TYPE)
		} catch (Exception e){
			println e
			return null
		}
	}
}