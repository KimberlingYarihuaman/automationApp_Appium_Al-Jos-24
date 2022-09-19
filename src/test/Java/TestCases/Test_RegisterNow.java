package TestCases;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import Functions.*;


public class Test_RegisterNow extends StartApplication{

    String dir;
    DefinitionActions registerNow= new DefinitionActions();
    ReadFiles readingFile=new ReadFiles();
    ArrayList<String> data= new ArrayList<String>();   // Array with data of the file
    int line=2;                                  // Specific Line to read


    @BeforeTest
    public void ReadFile() throws IOException {

        Properties properties = new Properties();
        properties.load(new FileReader("testApp.properties"));

        dir= properties.getProperty("TestFilesPath")+"RegisterUsers.txt";    // Path of the file to read
        data=readingFile.ReadSpecificLine(dir,line);                        //Read the file with data of that line

        DefinitionActions.FileName="Test_RegisterNow.json";                //JSON file that it going to read
        ExtentReportDemo.createScenario(this.getClass().getName());       //Create test scenario
    }


    @Test (priority=1)
    public void testOne() throws IOException {

        try{
            registerNow.pressElement("Register Now");
            driver.hideKeyboard();
            createStep("Press the Register Now Button","PASSED");

        }catch (Exception e){
            ExtentReportDemo.e=e;
            createStep("Press the Register Now Button","FAILED");
        }
    }

    @Test (priority=2)
    public void testTwo() throws IOException {

        try{
            registerNow.setTextField("User", data.get(0));
            driver.hideKeyboard();
            createStep("Send value "+data.get(0)+" to username field","PASSED");

        }catch (Exception e){
            ExtentReportDemo.e=e;
            createStep("Send value "+data.get(0)+" to username field","FAILED");
        }
    }

    @Test (priority=3)
    public void testThree() throws IOException {

        try {
            registerNow.setTextField("FullName", data.get(1));
            driver.hideKeyboard();
            createStep("Send value "+data.get(1)+" to fullname field","PASSED");

        }catch (Exception e){
            ExtentReportDemo.e=e;
            createStep("Send value "+data.get(1)+" to fullname field","FAILED");
        }
    }

    @Test (priority=4)
    public void testFour() throws IOException {

        try {
            registerNow.setValueList("Document Type","Document Type Value");
            driver.hideKeyboard();
            createStep("Send value to type document list","PASSED");

        }catch (Exception e){
            ExtentReportDemo.e=e;
            createStep("Send value to type document list","FAILED");
        }
    }

    @Test (priority=5)
    public void testFive() throws IOException {

        try {
            registerNow.setTextField("Document Number", data.get(3));
            driver.hideKeyboard();
            createStep("Send value to "+data.get(3)+" document number field","PASSED");

        }catch (Exception e){
            ExtentReportDemo.e=e;
            createStep("Send value to "+data.get(3)+" document number field","FAILED");
        }
    }

    @Test (priority=6)
    public void testSix() throws IOException {

        try {
            registerNow.setTextField("Email", data.get(4));
            driver.hideKeyboard();
            createStep("Send value to "+data.get(4)+" email field","PASSED");

        }catch (Exception e){
            ExtentReportDemo.e=e;
            createStep("Send value to "+data.get(4)+" email field","FAILED");
        }

    }

    @Test (priority=7)
    public void testSeven() throws IOException {

        try {
          registerNow.setTextField("Confirm Email", data.get(5));
          driver.hideKeyboard();
          createStep("Send value to "+data.get(5)+" confirm email field","PASSED");

        }catch (Exception e){
            ExtentReportDemo.e=e;
            createStep("Send value to "+data.get(5)+" confirm email field","FAILED");
        }

    }

    @Test (priority=8)
    public void testEight() throws IOException {

        try {
           registerNow.setTextField("Password", data.get(6));
           driver.hideKeyboard();
           createStep("Send value to "+data.get(6)+" password field","PASSED");

        }catch (Exception e){
            ExtentReportDemo.e=e;
            createStep("Send value to "+data.get(6)+" password field","FAILED");

        }
    }

    @Test (priority=9)
    public void testNine() throws IOException {

        try {
           registerNow.setTextField("Confirm Password", data.get(7));
           driver.hideKeyboard();
           createStep("Send value to "+data.get(7)+" confirm password field","PASSED");

        }catch (Exception e){
            ExtentReportDemo.e=e;
            createStep("Send value to "+data.get(7)+" confirm password field","FAILED");
        }
    }

    @Test (priority=10)
    public void testTen() throws IOException {

        try {
           registerNow.setDateCalendar("Date of Birth", "Accept Calendar");
           driver.hideKeyboard();
           createStep("Send value to date of birth field","PASSED");

        }catch (Exception e){
            ExtentReportDemo.e=e;
            createStep("Send value to date of birth field","FAILED");
        }
    }

    @Test (priority=11)
    public void testEleven() throws IOException {

        try {
           registerNow.setValueList("Gender", "Gender Value");
           driver.hideKeyboard();
           createStep("Send value to gender list","PASSED");


       }catch (Exception e){
            ExtentReportDemo.e=e;
            createStep("Send value to gender list","FAILED");
       }
    }

    @Test (priority=12)
    public void testTwelve() throws IOException {

        try {
            registerNow.verticalScroll();
            createStep("Do vertical scroll","PASSED");

        } catch (Exception e){
            ExtentReportDemo.e=e;
            createStep("Do vertical scroll","FAILED");
       }
    }

    @Test (priority=13)
    public void testThirteen() throws IOException {

        try {
            registerNow.setTextField("Phone Number", data.get(9));
            driver.hideKeyboard();
            createStep("Send value "+ data.get(9)+" to phone number field","PASSED");

        }catch (Exception e){
            ExtentReportDemo.e=e;
            createStep("Send value "+ data.get(9)+" to phone number field","FAILED");
        }
    }

    @Test (priority=14)
    public void testFourteen() throws IOException {

        try {
            registerNow.setTextField("Other Phone", data.get(10));
            driver.hideKeyboard();
            createStep("Send value "+ data.get(10)+" to other phone field","PASSED");

        }catch (Exception e){
            ExtentReportDemo.e=e;
            createStep("Send value "+ data.get(10)+" to other phone field","FAILED");
        }
    }

    @Test (priority=15)
    public void testFifteen() throws IOException {

        try {
            registerNow.setTextField("Activation Code", data.get(11));
            driver.hideKeyboard();
            createStep("Send value "+ data.get(11)+" to activation code field","PASSED");

        }catch (Exception e){
            ExtentReportDemo.e=e;
            createStep("Send value "+ data.get(11)+" to activation code field","FAILED");
        }
    }

    @Test (priority=16, groups = {"testExclude"})
    public void testSixteen() throws IOException {

        try {
            registerNow.pressElement("Radio Button");
            createStep("Press the radiobutton","PASSED");

        }catch (Exception e){
            ExtentReportDemo.e=e;
            createStep("Press the radiobutton","FAILED");
        }
    }

    @Test (priority=17, groups = {"testExclude"})
    public void testSeventeen() throws IOException {

        try {
            registerNow.pressElement("Save Button");
            createStep("Press the save button","PASSED");

        }catch (Exception e){
            ExtentReportDemo.e=e;
            createStep("Press the save button","FAILED");
        }

    }

}
