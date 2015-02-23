package service;

public class ServiceFactory {
    private ServiceFactory() {}  
    
    public static Service getLocalService(){  
        return new ServiceImp ();  
    }

}
