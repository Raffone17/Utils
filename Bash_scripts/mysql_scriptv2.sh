#!/bin/bash
echo -e "\n*******************************DATABASE_SCRIPT*******************************"
echo -e "Inserire host a cui loggarsi o local se si lavora in locale:"
read host;
if [[ "$host" == "local" ]]
then
   host="localhost";
fi
echo -e "Inserire nome utente con cui loggare: ";

read user;

echo -n "Inserire la password: ";

read -s pass;

database="no_selected";
while :
 do
   clear ;
   echo -e "\n*******************************DATABASE_SCRIPT*******************************"
   echo -e "[L/l] per login [I/i] per un interrogazione [S/s] per selezionare un database\n";
   echo -e "[Q/q] per uscire.";
   read sele; 

   case "$sele" in

   [Ll])
       echo -e "Effetuo il login." ;
      mysql -h $host -u $user --password="$pass" ;
   ;; 
   [Ii])
      inte="a";
      while [[ "$inte" != "q"  &&  "$inte" != "Q" ]]
       do
         echo -e "Database selezionato: $database\n";
         echo -e "Che interrogazione si vuole eseguire?: ";
         echo -e "[M/m] mostra tabelle [P/p] interrogazione personalizzata " ;
         echo -e "[S/s] Seleziona una tabella da mostrare [C/c] pulire schermo\n[Q/q] per chiudere" ;
         read inte;

         case "$inte" in
         
           [Mm])
              mysql -h $host -u $user --password="$pass" -e "USE $database; SHOW TABLES;" ;
           ;;
           [Pp])
              echo -e "Inserire l'interrogazione personalizzata seguito da ';' : " ;
              read action;
              mysql -h $host -u $user --password="$pass" -e "USE $database; $action" ;
           ;;
           [Qq])
              echo -e "Nessuna interrogazione" ;
              sleep 1;
           ;;
           [Cc])
              clear ;
           ;;
           [Ss])
              echo -e "Inserisci nome tabella: ";
              read tab;
              mysql -h $host -u $user --password="$pass" -e "USE $database; DESCRIBE $tab;";
              echo -e "Inserire i campi che si vuole visualizzare oppure [ * ] per visualizzarli tutti:";
              echo -e "Inserire campo, q per terminare: ";
              read campi[0];
              campo="${campi[0]}";
              i=0;
              while [[ "${campi[$i]}" != "*" && "${campi[$i]}" != "q" ]]
              do
                 i=$((i+1));
                 echo -e "Inserire campo, q per terminare: ";
                 read campi[$i];
                 if [[ "${campi[$i]}" != "q" ]]
                 then
                   campo+=", ${campi[$i]}";
                 fi
              done;
              mysql -h $host -u $user --password="$pass" -e "USE $database; SELECT $campo FROM $tab;";
           ;;
           *)
              echo -e "Comando sbagliato!!!" ;
         esac
       done;
   ;;
   [Ss])
      mysql -h $host -u $user --password="$pass" -e "SHOW DATABASES";
      echo -e "\nQuale database desideri selezionare: ";
      read database;
   ;;
   [Qq])
      echo -e "Grazie ed arrivederci!";
      exit ;
   ;;
   *)
      echo -e "Comando non riconosciuto!!!\n" ;
   esac;

 done;
