package com.banking.project.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

  Properties pro;

  public ReadConfig()
  {
      File src= new File("./Configurations/config.properties");
      try{
          FileInputStream fis= new FileInputStream(src);
          pro= new Properties();
          pro.load(fis);
      }
      catch(Exception e)
      {
          System.out.println("Execption is"+e.getMessage());
      }
  }
public String getApplicationURL()
{
    String url= pro.getProperty("baseUrl");
    return url;
}

public String getUsername()
{
    String uname=pro.getProperty("username");
    return uname;

}

public String getPassword()
{
    String pwd= pro.getProperty("password");
    return pwd;
}
}
