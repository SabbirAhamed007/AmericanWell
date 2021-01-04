$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SignUp.feature");
formatter.feature({
  "line": 1,
  "name": "SignUp Amricanwell",
  "description": "",
  "id": "signup-amricanwell",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Test signup Americanwell",
  "description": "",
  "id": "signup-amricanwell;test-signup-americanwell",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tag6"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "type americanwell web address",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "mouse hover on Need to see a doctor",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "click on signup button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I fill all the fields",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "click on agree check button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "successfully signup",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUpTest.i_open_browser()"
});
formatter.result({
  "duration": 9435970700,
  "error_message": "org.openqa.selenium.WebDriverException: java.net.ConnectException: Failed to connect to localhost/0:0:0:0:0:0:0:1:11115\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-C3UG4MO\u0027, ip: \u0027192.168.1.14\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: driver.version: EdgeDriver\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:92)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:209)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:132)\r\n\tat org.openqa.selenium.edge.EdgeDriver.\u003cinit\u003e(EdgeDriver.java:141)\r\n\tat org.openqa.selenium.edge.EdgeDriver.\u003cinit\u003e(EdgeDriver.java:96)\r\n\tat sTepDefination.SignUpTest.i_open_browser(SignUpTest.java:34)\r\n\tat ✽.Given I open browser(SignUp.feature:5)\r\nCaused by: java.net.ConnectException: Failed to connect to localhost/0:0:0:0:0:0:0:1:11115\r\n\tat okhttp3.internal.connection.RealConnection.connectSocket(RealConnection.java:240)\r\n\tat okhttp3.internal.connection.RealConnection.connect(RealConnection.java:158)\r\n\tat okhttp3.internal.connection.StreamAllocation.findConnection(StreamAllocation.java:256)\r\n\tat okhttp3.internal.connection.StreamAllocation.findHealthyConnection(StreamAllocation.java:134)\r\n\tat okhttp3.internal.connection.StreamAllocation.newStream(StreamAllocation.java:113)\r\n\tat okhttp3.internal.connection.ConnectInterceptor.intercept(ConnectInterceptor.java:42)\r\n\tat okhttp3.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:147)\r\n\tat okhttp3.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:121)\r\n\tat okhttp3.internal.cache.CacheInterceptor.intercept(CacheInterceptor.java:93)\r\n\tat okhttp3.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:147)\r\n\tat okhttp3.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:121)\r\n\tat okhttp3.internal.http.BridgeInterceptor.intercept(BridgeInterceptor.java:93)\r\n\tat okhttp3.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:147)\r\n\tat okhttp3.internal.http.RetryAndFollowUpInterceptor.intercept(RetryAndFollowUpInterceptor.java:125)\r\n\tat okhttp3.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:147)\r\n\tat okhttp3.internal.http.RealInterceptorChain.proceed(RealInterceptorChain.java:121)\r\n\tat okhttp3.RealCall.getResponseWithInterceptorChain(RealCall.java:200)\r\n\tat okhttp3.RealCall.execute(RealCall.java:77)\r\n\tat org.openqa.selenium.remote.internal.OkHttpClient.execute(OkHttpClient.java:101)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:101)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:73)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:209)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:132)\r\n\tat org.openqa.selenium.edge.EdgeDriver.\u003cinit\u003e(EdgeDriver.java:141)\r\n\tat org.openqa.selenium.edge.EdgeDriver.\u003cinit\u003e(EdgeDriver.java:96)\r\n\tat sTepDefination.SignUpTest.i_open_browser(SignUpTest.java:34)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:37)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:13)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:31)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:299)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:91)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:93)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:98)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:675)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\nCaused by: java.net.ConnectException: Connection refused: connect\r\n\tat java.net.DualStackPlainSocketImpl.waitForConnect(Native Method)\r\n\tat java.net.DualStackPlainSocketImpl.socketConnect(Unknown Source)\r\n\tat java.net.AbstractPlainSocketImpl.doConnect(Unknown Source)\r\n\tat java.net.AbstractPlainSocketImpl.connectToAddress(Unknown Source)\r\n\tat java.net.AbstractPlainSocketImpl.connect(Unknown Source)\r\n\tat java.net.PlainSocketImpl.connect(Unknown Source)\r\n\tat java.net.SocksSocketImpl.connect(Unknown Source)\r\n\tat java.net.Socket.connect(Unknown Source)\r\n\tat okhttp3.internal.platform.Platform.connectSocket(Platform.java:125)\r\n\tat okhttp3.internal.connection.RealConnection.connectSocket(RealConnection.java:238)\r\n\t... 66 more\r\n",
  "status": "failed"
});
formatter.match({
  "location": "SignUpTest.type_americanwell_web_address()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignUpTest.mouse_hover_on_Need_to_see_a_doctor()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignUpTest.click_on_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignUpTest.click_on_signup_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignUpTest.i_fill_all_the_fields()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignUpTest.click_on_agree_check_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "SignUpTest.successfully_signup()"
});
formatter.result({
  "status": "skipped"
});
});