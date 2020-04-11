private static WebDriver getRemoteDriver(String selHub){
    DesiredCapabilities cap = new DesiredCapabilities();
  if (Consts.BROWSER_TYPE_FIREFOX.equals(EnvConfigFactory.getBrowser())){
      cap = DesiredCapabilities.firefox();
  }else if (Consts.BROWSER_TYPE_CHROME.equals(EnvConfigFactory.getBrowser())){
      cap = DesiredCapabilities.chrome();
  }else if(Consts.BROWSER_TYPE_IE.equals(EnvConfigFactory.getBrowser())){
      cap = DesiredCapabilities.internetExplorer();
  }else if(Consts.BROWSER_TYPE_OPERA.equals(EnvConfigFactory.getBrowser())){
      cap = DesiredCapabilities.operaBlink();
  }else if(Consts.BROWSER_TYPE_SAFARI.equals(EnvConfigFactory.getBrowser())){
      cap = DesiredCapabilities.safari();
  }
  
  URL url = null;
  try {
       url = new URL(selHub);
  }catch (MalformedURLException e){
       e.printStackTrace();
       System.out.println("Can not find hub url!!");
  }
  WebDriver driver = new RemoteWebDriver(url,cap);
  System.out.println("The remote driver is" + driver);
  return driver;
}
