<?php


namespace App\Http\Controllers;


class MioController extends Controller
{
    
    public function ciao_mondo(){
        return "<h1>Ciao Mondo!</h1>";
    }
    
    public function ciao_mondo_con_parametro($nome){
        return "<h1> Ciao ".$nome." </h1>";
    }
    
    public function login($n){
        if($n == "pippo"){
            return "<h3> Sei loggato!";
        }else{
            return "<h3> non lo sei!!";
        }
    }
    
    public function csv(){
        
    
        
           echo "<br><table>";
            $csv = Reader::createFromPath('result.csv');
            $csv->setDelimiter(',');
            $res = $csv;
            foreach ($res as $row) {
                echo "<br><tr>";
                foreach($row as $a){
                    echo "<td> ".$a . "</td>" ;
                }
                echo "</tr>";
            }
    }
}