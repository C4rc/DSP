class Benutzer {

     Strichliste[] meineStrichlisten;
     String name;  

     fügeStrichZuListeHinzu ( int ListenID ){
          Strichliste sl1 = meineStrichlisten[ListenID];
          sl1.strichHinzufuegen( this );
     }  
}

class Strichliste {

     Strich[] striche;
     String name;
     Benutzer[] mitglieder;

     strichHinzufuegen(Benutzer benutzer){
          striche.add( new Strich( benutzer, this ) );
     }
}

class Strich {

     Benutzer besitzer;
     Date timestamp;

     protected Strich(Benutzer besitzer, Strichliste liste){
          
     }
}


Benutzer b1 = new Benutzer("Peter");
Strichliste sl1 = new Strichliste("SL1");
sl1.strichHinzufuegen( b1 );

