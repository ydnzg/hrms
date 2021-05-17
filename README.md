# hrms  (Human Resource Management System)

1) Vertabanı tabloları oluşturuldu(Posgre içerisinde)

   -companies
   -jobseekers
   -positions
   -system_employees
   -users
   
2) Spring initializr ile proje şablonu oluşturuldu ve proje eclipse import edildi.

3) Proje içerisinde 5 temel paket oluşturuldu
   -entities;
   -dataAccess
   -core
   -business
   -api
   
   3.1) entities paketi içerisinde abstracts ve concretes olmak üzere iki paket oluşturuldu.
      
      3.1.1) concretes ;
            -Company
            -Jobseeker
            -Position
            -SystemEmployee
            -User
            
   3.2) dataAccess paketi içerisinde abstracts ve concretes olmak üzere iki paket oluşturuldu.
      
      3.2.1) abstracts ;
            -CompanyDao
            -JobseekerDao
            -PositionDao
            -SystemEmployeeDao
            -UserDao
   
   3.3) business paketi içerisinde abstracts ve concretes olmak üzere iki paket oluşturuldu.
      
      3.3.1) abstracts ;
            -CompanyService
            -JobseekerService
            -PositionService
            -SystemEmployeeService
            -UserService  
            
      3.3.2) concretes ;
            -CompanyManager
            -JobseekerManager
            -PositionManager
            -SystemEmployeeManager
            -UserManager  
            
   3.4) api paketi içerisinde controllers paketi oluşturuldu.
      
      3.4.1) controllers ;
            -CompaniesController
            -JobseekersController
            -PositionsController
            -SystemEmployeesController
            -UsersController        
            
            
            
            
     
