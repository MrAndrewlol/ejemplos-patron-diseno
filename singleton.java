// Esta es la clase de ejemplo donde se implementa el singleton
class Database {
    
    //Declaracion del objeto dentro de la clase
    private static Database dbObject;
 
    // Constructor de la clase
    private Database() {      
    }

    //
    public static Database getInstance() {
 
       // Crear el objeto en caso que no haya sido instnaciado aun
       if(dbObject == null) {
          System.out.println("Se ha creado una instancia nueva \n");
          dbObject = new Database();
       }

       // Esta condicional es mas para demostrar la existencia de una unica instancia
       else {
          System.out.println("Ya existe una instancia!\n");
       }
 
        // se regresa el objeto singleton
        return dbObject;
    }
 
    public void getConnection() {
        System.out.println("Te has conectado\n");
    }
 }
 
 class Main {
    public static void main(String[] args) {
       Database db1;
 
       // refers to the only object of Database
       db1= Database.getInstance();

       Database.getInstance();

       Database.getInstance();
       
       db1.getConnection();
    }
 }
 