$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Santhosh kumar/eclipse-workspace/Facebook/src/test/java/com/Featurefile/Feature_1.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook login and logout",
  "description": "",
  "id": "facebook-login-and-logout",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "login",
  "description": "",
  "id": "facebook-login-and-logout;login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter the email in email field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter the password in password fiels",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click on the login button and it navigate to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_launch_the_application()"
});
formatter.result({
  "duration": 2505291700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enter_the_email_in_email_field()"
});
formatter.result({
  "duration": 2114858400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_enter_the_password_in_password_fiels()"
});
formatter.result({
  "duration": 2124028200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_on_the_login_button_and_it_navigate_to_home_page()"
});
formatter.result({
  "duration": 25287588700,
  "status": "passed"
});
});