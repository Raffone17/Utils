#!/bin/bash

echo -e "***************RUBRICA***************\n";
while :
  do

    echo -e "Inserre [I/i] per iniziare inserimento [V/v] per visualizzare [C/c] per cercare";
    echo -e "[D/d] per eliminare un contatto."

    read val;

    case "$val" in
    [Ii])
      echo -e "Hai inserito i"
       while [[ $val == "i" ]]
          do
            read -p "Inserire nome: " nome;
            read -p "Inserire telefono: " tel;
            read -p "Inserire indirizzo: " indirizzo;
            echo "$nome -- $tel -- $indirizzo" >> contatti
      
            echo -e "Per continuare inserimeto premere i:" 
            read val;
          done;
    ;;
    [Vv])
    num=1;
     while read -r line
       do
        name=$line
        echo "Contatto $num - $name"
        num=$(( $num + 1 ))
     done < contatti 
    ;;
    [Cc])
    read -p "Inserire nome: " nome;
     grep "$nome" contatti;
   
    ;;
    [Dd])
    echo -e "Inserire nome o numero di telefono del contatto da eliminare: "
    read elimina;
    grep "$elimina" contatti;
    echo -e "Sicuro di voler eliminare la riga seguente? [Y/y] o [N/n] "
    read val;
    if [[ $val=="y" || $val=="Y" ]] ;
      then
      sed -i "/$elimina/d" contatti ;
    fi
    more contatti ;
    ;;
    *) 
      echo -e "Grazie e arrivederci\n";
      exit ;
    ;;    
    esac;

done;

