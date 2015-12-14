#!/bin/bash

if [ "$#" -eq 0 ]; then
  echo -e "Manuale dello script di calcolatrice."
  echo -e "Per eseguire dei semplici calcolo inserire l'operazione in riga di comando,"
  echo -e "facendo attenzione a lasciare spazio fra ogni argomento."
  echo -e "(+)  --addizione\n(-)  --sottrazione\n(xX) --moltiplicazione\n(/)  --divisione."
  echo -e "Tanti saluti e buon utilizzo."
fi

if [ "$#" -eq 3 ]; then
  # inizializzo delle variabili in cui inserisco i tre argomenti dalla linea di comando
  var1=$1
  var2=$3         
  oper=$2 
  # controllo se le variabili sono numeri o meno
  re='-?[0-9]+([.][0-9]+)?'
  if [[ $var1 =~ $re && $var2 =~ $re ]] ; then
    
     case "$oper" in
       [+])
         echo "Il risultato è: ";
         echo "$var1 + $var2" | bc -l;
       ;;
       [-])
         echo "Il risultato è: ";
         echo "$var1 - $var2" | bc -l;
       ;;
       [xX])
         echo "Il risultato è: ";
         echo "$var1 * $var2" | bc -l;
       ;;
       [/])
         echo "Il risultato è: ";
         echo "$var1 / $var2" | bc -l ;
       ;;
       *)
         echo -e "Operatore non riconosciuto!"; 
       ;;
     esac
  else
     echo -e "Non hai inserito dei numeri!";
  fi
else
  echo -e "Numero argomenti non valido!";
fi
