
import Clases.Autor;
import Clases.Book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> libros = new ArrayList<>();
        List<Autor> autores = new ArrayList<>();
        
        //Autores
        Autor GabrielGarcia = new Autor("Gabriel Garcia Marquez" , "gabrielgarcia45@gmail.com",'M');
        Autor JRRTolkien = new Autor("J. R. R. Tolkien" , "JRRtolkien8@gmail.com" , 'M');
        Autor GeorgeOrwell = new Autor("George Orwell" , "georgeororwel@gmail.com" , 'M');
        Autor AldousHuxley = new Autor("Aldous Huxley" , "aldoushux12@gmail.com" , 'M');
        Autor JaneAusten = new Autor("Jane Austen" , "janeautin@gmail.com" , 'F');
        Autor FiodorDosto = new Autor("Fiodor Dostoyevski" , "fiodordiosto122@gmail.com" , 'M');
        Autor VladimirNavo = new Autor("Vladimir Navokov" , "vladimirkovnav@gmail.com" , 'M');
        Autor JamesJoyce = new Autor("James Joyce" , "jamesjoycce1@gmailc.oom" , 'M');
        Autor GustaveFlaubert = new Autor("Gustave Flaubert" , "gustaveflaubrr@gmail.com" , 'M');
        Autor MarcelProust = new Autor("Marcel Proust" , "marcelproust567@gmail.com" , 'M');
        Autor MiguelCervan = new Autor("Miguel de Cervantes" , "miguelcervantes4512@gmail.com" , 'M');
        Autor OscarWilde = new Autor("Oscar Wilde" , "oscarwilde9823@gmail.com" ,'M');
        Autor AntoineSaint = new Autor("Antoine de Saint-Exupery" , "antoinesaintu8y@gmail.com" , 'F');
        Autor WilliamFaul = new Autor("William Faulkner" , "williamfaulker213@gmail.com" , 'M');
        Autor JonathanSwif = new Autor("Jonathan Swif" , "jonathanswif@gmail.com" ,'M');
        Autor ArthurGolden = new Autor("Arthur Golden", "arthurgolden98@gmail.com" , 'M');
        Autor SuzanneCollins = new Autor("Suzanne Collins" , "suzannecollins@gmail.com" , 'F');
        Autor JKRolling  = new Autor("J.K. Rolling" , "jkrollyng@gmail.com" , 'F');
        Autor VictorHugo = new Autor("Victor Hugo" , "victorhugo@gmail.com" , 'M');
        Autor CSLewis = new Autor("C.S. Lewis" , "cslewis2335@gmail.com" , 'M');
        
        //Libros
        Book CienAños = new Book("Cien Años de Soledad" , GabrielGarcia , 200 , 400);
        libros.add(CienAños);
        Book SeñorAnillos = new Book("Señor de los Anillos (Trilogia)" , JRRTolkien , 1500 , 1200);
        libros.add(SeñorAnillos);
        Book milochocuatro = new Book("1984" , GeorgeOrwell , 500 , 300);
        libros.add(milochocuatro);
        Book MundoFeliz = new Book("Un mundo feliz" , AldousHuxley , 320 , 500);
        libros.add(MundoFeliz);
        Book OrgulloPrejuicio = new Book("Orgullo y Prejuicio" , JaneAusten , 130 , 700);
        libros.add(OrgulloPrejuicio);
        Book CrimenCastigo = new Book("Crimen y Castigo" , FiodorDosto , 230 , 540);
        libros.add(CrimenCastigo);
        Book Lolita = new Book("Lolita" ,VladimirNavo , 140 , 456);
        libros.add(Lolita);
        Book Ulises = new Book("Ulises" , JamesJoyce , 158 , 400);
        libros.add(Ulises);
        Book MadameBov = new Book ("Madame Bovary" , GustaveFlaubert , 120 , 430);
        libros.add(MadameBov);
        Book TiempoPerdido = new Book ("En busca del tiempo perdido" , MarcelProust , 345 , 450);
        libros.add(TiempoPerdido);
        Book DonQuijote  =new Book ("Don Quijote de la Mancha" , MiguelCervan , 340 , 123);
        libros.add(DonQuijote);
        Book DorianGray = new Book ("El retrato de Dorian Gray" , OscarWilde , 123 , 67);
        libros.add(DorianGray);
        Book ElPrincipito = new Book ("El Principito" , AntoineSaint , 259 , 345);
        libros.add(ElPrincipito);
        Book RuidoFuria = new Book("El ruido y la furia" , WilliamFaul , 134 , 246);
        libros.add(RuidoFuria);
        Book Guilliver = new Book("Los viajes de Guillever" , JonathanSwif, 186  ,234);
        libros.add(Guilliver);
        Book MemoriasGeisha = new Book("Memoria de una Geisha" , ArthurGolden , 195  , 234);
        libros.add(MemoriasGeisha);
        Book JuegosdelHambre = new Book("Los juegos del hambre" , SuzanneCollins , 181 , 234);
        libros.add(JuegosdelHambre);
        Book HarryPotter = new Book("Harry Potter y la piedra filosofal" , JKRolling , 650 , 4000);
        libros.add(HarryPotter);
        Book LosMiserables = new Book("Los Miserables" , VictorHugo , 23, 245);
        libros.add(LosMiserables);
        Book CronicasNarnia = new Book("Las Cronicas de Narnia" , CSLewis , 456 , 444);
        libros.add(CronicasNarnia);
        
        //Codigo
        
        int salir = 0;
        
        do{
            System.out.println("\nBienvenido a la tabla de operaciones");
            System.out.println("1. Mostrar la lista del libros");
            System.out.println("2. Agregar un libro  y asignar autor del libro");
            System.out.println("3. Eliminar un libro");
            System.out.println("4. Editar un libro");
            System.out.println("5. Buscar un libro por titulo");
            System.out.println("6. Buscar el autor dado el libro");
            System.out.println("7. Ordenar Libros por Autor");
            System.out.println("8. Salir");
            System.out.print("Ingrese su numero de opción : ");
            int opcion = scanner.nextInt();
            
            switch(opcion){
                case 1:
                    
                    System.out.println("Nombre del Libro / Author / Precio / Cantidad");
                    
                    for(Book book : libros){
                        System.out.println(book.getName() + " / " + book.getAuthor().getName() + " / " + book.getPrice() + " / " + book.getQty());
                    }
                    break;
                    
                    
                case 3:
                    System.out.println("\nIngrese el título del libro que desea eliminar :");
                    scanner.nextLine();
                    String eliminar = scanner.nextLine();
                    
                    for(Book book : libros){
                        if(book.getName().equalsIgnoreCase(eliminar)){
                            libros.remove(book);
                            
                            if(libros.contains(book)){
                            System.out.println("No se elimino\n");
                            }else{
                            System.out.println("Se ha eliminado correctamente\n");
                            }
                        } 
                    }
                    break;
                    
                case 4:
                    System.out.println("\nIngrese el título del libro que cambiar : ");
                    scanner.nextLine();
                    String libroCambiar = scanner.nextLine();
                    
                    for(Book book : libros){
                        if(book.getName().equalsIgnoreCase(libroCambiar)){
                            int cerrar = 0;
                            do{
                                System.out.println("\n1. Modificar Nombre");
                                System.out.println("2. Modificar Precio");
                                System.out.println("3. Modificar Cantidad");
                                System.out.println("4. Salir");
                                System.out.print("Ingrese su numero de operación : \n");
                                int numOperacion = scanner.nextInt();
                        
                                switch (numOperacion) {
                                    case 1:
                                        System.out.print("Ingrese el nuevo nombre del libro : ");
                                        String nnombre = scanner.next();
                                        book.setName(nnombre);
                                        
                                        break;
                                        
                                    case 2:
                                        System.out.print("Ingrese el nuevo precio del libro : ");
                                        double nprecio = scanner.nextDouble();
                                        book.setPrice(nprecio);
                                        
                                        break;
                                        
                                    case 3:
                                        System.out.print("Ingrese la nueva cantidad del libro : ");
                                        int ncant = scanner.nextInt();
                                        book.setQty(ncant);
                                        
                                        break;
                                    
                                    case 4:
                                        cerrar = 4;
                                        System.out.println("\nRegresando....1"
                                                + "");
                                        
                                        break;
                                }           
                            }while(cerrar != 4);
                            
                        }
                        
                    }
                    
                    break;
                    
                case 5:
                    System.out.println("\nIngrese el título del libro que desea buscar : ");
                    scanner.nextLine();
                    String nomBuscar = scanner.nextLine();
                    
                    for (Book book : libros) {
                        if (book.getName().equalsIgnoreCase(nomBuscar)) {
                            System.out.println("\n" + book.toString());
                            break;
                        }
                    }
                    System.out.println("\nNo se encontro el libro\n");
                    break;
                    
                case 6:
                    System.out.println("\nIngrese el título del libro del cual desea conocer el autor : ");
                    scanner.nextLine();
                    String titulo = scanner.nextLine();
                    
                    for (Book book : libros) {
                        if (book.getName().equalsIgnoreCase(titulo)) {
                            System.out.println("\nEl autor de " + titulo + " es " + book.getAuthor().getName());
                        }
                    }
                    
                    break;
                    
                    
                case 7:
                    Collections.sort(libros, (book1, book2) -> book1.getAuthor().getName().compareTo(book2.getAuthor().getName()));
                    System.out.println("\nLibros ordenados por autor : ");
                    for(Book book : libros){
                        System.out.println(book.toString());
                    }
                    
                    break;
                    
                case 8:
                    salir = 8;
                    System.out.println("Saliendo......");
                    
                    break;
                
                default:
                    System.out.println("Opción no válida. Por favor, ingrese un número válido.");
  
                    break;
            }  
        }while(salir != 8);
    }
}
