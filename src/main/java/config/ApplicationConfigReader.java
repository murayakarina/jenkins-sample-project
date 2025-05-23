
package config;


import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource.Classpath;


@Classpath({"ApplicationConfig.properties"})

public class ApplicationConfigReader {

    private static ApplicationConfigReader config;

    public static ApplicationConfigReader getConfig() {
        if (config == null) {
            config = new ApplicationConfigReader();
        }
        return config;
    }

    @Property("baseUrl")
    private String baseUrl;
    @Property("dashboardUrl")
    private String dashboardUrl;

    @Property("dataviewUrl")
    private String dataviewUrl;

    @Property("tableUrl")
    private String tableUrl;
    @Property("htmlReportPath")
    private String htmlReportPath;
    @Property("LogTestRail")
    private String LogTestRail;
    @Property("TestRailurl")
    private String TestRailurl;
    @Property("TestRailusername")
    private String TestRailusername;
    @Property("TestRailpassword")
    private String TestRailpassword;
    @Property("TestRailprojectid")
    private String TestRailprojectid;
    @Property("isEnableReporting")
    private String isEnableReporting;
    @Property("SendEmailAfterExecution")
    private String SendEmailAfterExecution;
    @Property("From")
    private String From;
    @Property("FromPassword")
    private String FromPassword;
    @Property("To")
    private String[] To;
    @Property("ProjectDescription")
    private String ProjectDescription;
    @Property("filePath")
    private String filePath;

    @Property("Browser")
    private String Browser;
    @Property("Device")
    private String Device;

    @Property("headless")
    private String headless;


    @Property("Project")
    private String Project;
    @Property("Platform")
    private String Platform;
    @Property("Environment")
    private String Environment;

    @Property("UpdateCase")
    private String UpdateCase;

    @Property("userName")
    private String userName;

    @Property("username1")
    private String username1;

    @Property("password")
    private String password;



    public ApplicationConfigReader() {
        PropertyLoader.newInstance().populate(this);
    }


    public String getBaseUrl() {
        return this.baseUrl;
    }
    public String getDashboardUrl() {
        return this.dashboardUrl;
    }

    public String getusername1() {return this.username1; }

    public String getHtmlReportPath() {
        return this.htmlReportPath;
    }

    public String getLogTestRail() {
        return this.LogTestRail;
    }

    public String getTestRailurl() {
        return this.TestRailurl;
    }

    public String getTestRailusername() {
        return this.TestRailusername;
    }

    public String getTestRailpassword() {
        return this.TestRailpassword;
    }


    public String getIsEnableReporting() {
        return this.isEnableReporting;
    }


    public String getSendEmailAfterExecution() {
        return this.SendEmailAfterExecution;
    }

    public String getFrom() {
        return this.From;
    }

    public String getFromPassword() {
        return this.FromPassword;
    }

    public String[] getTo() {
        return this.To;
    }


    public String getProject() {
        return this.Project;
    }

    public String getPlatform() {
        return this.Platform;
    }

    public String getEnviroment() {
        return this.Environment;
    }

    public String getUpdateTestRail() {
        return this.UpdateCase;
    }

    public String getUsername() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public String getTestRailprojectid() {
        return this.TestRailprojectid;
    }

    public String getBrowser() {
        return this.Browser;
    }

    public String getDevice() {
        return this.Device;
    }
    public String getHeadless() {
        return headless;
    }

    public String getfilePath() {
        return System.getProperty("user.dir")+filePath;
    }

}